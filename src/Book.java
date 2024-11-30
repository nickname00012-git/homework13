public class Book {
    private String title;
    private Author author;
    private int yearOfPublication;

    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearOfPublication(int year) {
        this.yearOfPublication = year;
    }

    @Override
    public String toString() {
        return this.title + ", автор - " + this.author.toString() + ", год издания - " + this.yearOfPublication;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(this.author, this.title, this.yearOfPublication);
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (this.hashCode() != that.hashCode()) {
            return false;
        }
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        Book book = (Book) that;
        if (this.yearOfPublication != book.yearOfPublication) {
            return false;
        }
        if (!(this.title.equals(book.title))) {
            return false;
        }
        return (this.author.equals(book.author.getLastName()) && this.author.equals(book.author.getFirstName()));
    }
}
