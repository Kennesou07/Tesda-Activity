public interface UserDataObjectAccess {
    void signUp(User user);
    User login(String username, String password);
}
