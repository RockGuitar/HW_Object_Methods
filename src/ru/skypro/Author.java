package ru.skypro;
import java.util.Objects;
public class Author {
    private String authorFirstName;
    private String authorSecondName;

    public Author ( String authorFirstName, String authorSecondName ) {
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
    }

    public String getAuthorFirstName () {
        return authorFirstName;
    }

    public void setAuthorFirstName ( String authorFirstName ) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorSecondName () {
        return authorSecondName;
    }

    public void setAuthorSecondName ( String authorSecondName ) {
        this.authorSecondName = authorSecondName;
    }

    public String toString() {
        return "Полное имя автора: " + authorFirstName + " " + authorSecondName;
    }

    public boolean equals (Object other) {
//        Авторы равны когда их полные имена одинаковы
        if (this.getClass() != other.getClass()) {
            return false;
        }
        if (this == other)
            return true;
        if (other == null)
            return false;
        Author otherAuthor = (Author) other;
        String fullName = authorFirstName + " " + authorSecondName;
        String fullNameOther = otherAuthor.authorFirstName + " " + otherAuthor.authorSecondName;
        return fullName.equals(fullNameOther);
    }
    public int hashCode(){
//        Выбрал чтобы прописывало хеш-код для первого имени автора
        return Objects.hash(authorFirstName);
    }
}
