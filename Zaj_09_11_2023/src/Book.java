import java.util.Objects;

public class Book {
    public String title, author;
    public int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        if(numberOfPages < 0) {
            this.numberOfPages = 1;
        } else {
            this.numberOfPages = numberOfPages;
        }
        if(title.isEmpty()) {
           this.title = "Pusty napis";
        } else {
            this.title = title;
        }
        if(author.isEmpty()) {
            this.author = "Pusty napis";
        } else {
            this.author = author;
        }

    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + ", Pages: " + numberOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }
}
