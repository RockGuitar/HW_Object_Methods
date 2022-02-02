package ru.skypro;
import java.util.Objects;
public class Book {
    private String bookName;
    private Author bookAuthor;
    private int publishYear;

    public Book ( String bookName, Author author, int publishYear ) {
        this.bookName = bookName;
        this.bookAuthor = author;
        this.publishYear = publishYear;
    }

    public String getBookName () {
        return bookName;
    }

    public void setBookName ( String bookName ) {
        this.bookName = bookName;
    }

    public String getAuthor () {
        return (bookAuthor.getAuthorFirstName() + " " + bookAuthor.getAuthorSecondName());
    }

    public void setAuthor (String bookAuthorFirstName, String bookAuthorSecondName) {
         bookAuthor.setAuthorFirstName(bookAuthorFirstName);
         bookAuthor.setAuthorSecondName(bookAuthorSecondName);
    }

    public int getPublishYear () {
        return publishYear;
    }

    public void setPublishYear ( int publishYear ) {
        this.publishYear = publishYear;
    }

    public String toString () {
        return bookAuthor.toString() + ", название книги: "+ bookName + ", год выпуска: "+ publishYear;
    }

    public boolean equals ( Object other ) {
//        Книги равны когда у них одинаковый заголовок И одинаковый автор, но год выпуска не учитывается
        if (this.getClass() != other.getClass()) {
            return false;
        }
        if (this == other)
            return true;
        if (other == null)
            return false;
        Book otherBook = (Book) other;
        boolean equal = (bookName == otherBook.bookName && bookAuthor.equals(otherBook.bookAuthor));
        return equal;
    }

    public int hashCode () {
//        Выбрал чтобы выводил хеш-код для имени книги
        return Objects.hash(bookName);
    }
}
