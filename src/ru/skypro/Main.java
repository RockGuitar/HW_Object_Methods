package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author firstAuthor = new Author("Олег", "Сашин");
        Author secondAuthor = new Author("Андрей", "Земельский");
//        Сначала проверим равны ли авторы(изначально не равны, должно быть false),
//        а потом сделаем им одинаковые имена, и проверим выводится ли true
        System.out.println("firstAuthor.equals(secondAuthor) = " + firstAuthor.equals(secondAuthor));
        secondAuthor.setAuthorFirstName("Олег");
        secondAuthor.setAuthorSecondName("Сашин");
        System.out.println("firstAuthor.equals(secondAuthor) = " + firstAuthor.equals(secondAuthor));
//        Печатаем полное имя любого автора через toString
        System.out.println("firstAuthor.toString() = " + firstAuthor.toString());
//         Проверим пишется ли хэш-код для первого автора и его первого имени
        System.out.println("firstAuthor.hashCode() = " + firstAuthor.hashCode());

        Book firstBook = new Book("Life", firstAuthor, 1972);
        Book secondBook = new Book("Домовой", secondAuthor, 2001);
//        Реализуем хеш-код для имени книги
        System.out.println("secondBook.hashCode() = " + secondBook.hashCode());
//        Вывод toString для книги
        System.out.println("secondBook.toString() = " + secondBook.toString());
        System.out.println("firstBook.equals(secondBook) = " + firstBook.equals(secondBook));
//        Устанавливаем название книги и полное имя автора равными и проверяем, вернет ли true:
        secondBook.setBookName(firstBook.getBookName());
        secondBook.setAuthor(firstAuthor.getAuthorFirstName(),firstAuthor.getAuthorSecondName());
        System.out.println("firstBook.equals(secondBook) = " + firstBook.equals(secondBook));
//        В результате все работает и программа возвращает ожидаемый результат

    }
}
