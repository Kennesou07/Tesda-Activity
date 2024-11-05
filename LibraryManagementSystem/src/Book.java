public class Book {
    private String title;
    private String author;
    private String genre;
    private Boolean isAvailable;

    public Book(String title, String author, String genre, Boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public Boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) { isAvailable = available; }
    @Override
    public String toString() {
        return title + " by " + author + " (" + genre + ")";
    }

}
