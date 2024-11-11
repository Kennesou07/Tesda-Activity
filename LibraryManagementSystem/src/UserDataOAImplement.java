
import org.mindrot.jbcrypt.BCrypt;
import java.sql.*;
public class UserDataOAImplement implements UserDataObjectAccess {
    private static final String URL = "jdbc:mysql://localhost:3306/users_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private Connection connect() throws Exception {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    @Override
    public void signUp(User user) {
        if (isUsernameExists(user.getUsername())) {
            throw new IllegalArgumentException("Username already exists.");
        }

        String encryptedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12));
        String query = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";

        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, encryptedPassword);
            preparedStatement.setString(3, user.getRole());

            preparedStatement.executeUpdate();
            System.out.println("Successfully Registered!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean isUsernameExists(String username) {
        String query = "SELECT COUNT(*) FROM users WHERE username = ?";

        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, username);

            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next() && resultSet.getInt(1) > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public User login(String username, String password) {
        String query = "SELECT * FROM users WHERE username = ?";

        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, username);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String encryptedPassword = resultSet.getString("password");

                if (BCrypt.checkpw(password, encryptedPassword)) {
                    return new User(
                            resultSet.getInt("id"),
                            resultSet.getString("username"),
                            encryptedPassword,
                            resultSet.getString("role")
                    );
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
