import java.util.concurrent.atomic.AtomicBoolean;

public class MyApp {
    public static void main(String[] args) {

        // Heading
        System.out.println();
        System.out.println();
        System.out.println("<<<<  Homework 12 (Classes and Methods) >>>>");
        System.out.println();
        int taskN = 0;

        // Task 1

        taskN += 1;
        printTaskHeading(taskN);
        Author author01 = new Author("Николай", "Кривошеев");
        Author author02 = new Author("Виктор", "Пылин");
        Book book01 = new Book("Первая книга", author01, 2020);
        Book book02 = new Book("Вторая книга", author02, 2022);

        System.out.println("Книга 01");
        System.out.println("Название: " + book01.getTitle());
        System.out.println("Автор: " + book01.getAuthor().getFirstName() + " " + book01.getAuthor().getLastName());
        System.out.println("Год издания: " + book01.getYearOfPublication());
        printSeparator();

        System.out.println("Книга 02");
        System.out.println("Название: " + book02.getTitle());
        System.out.println("Автор: " + book02.getAuthor().getFirstName() + " " + book02.getAuthor().getLastName());
        System.out.println("Год издания: " + book02.getYearOfPublication());
        printSeparator();

        book02.setYearOfPublication(2021);
        System.out.println("Год издания книги 02 (исправленный): " + book02.getYearOfPublication());
        printSeparator();

        Author author03 = author01;
        System.out.println("author03 = author01  ");
        System.out.println();

        System.out.println("author03.equals(author01) = " + author03.equals(author01));
        System.out.println("author03.equals(author02) = " + author03.equals(author02));
        System.out.println();

        System.out.println("author01.hashCode() = " + author01.hashCode());
        System.out.println("author02.hashCode() = " + author02.hashCode());
        System.out.println("author03.hashCode() = " + author03.hashCode());
        printSeparator();

        Book book03 = book02;
        System.out.println("book03 = book02  ");
        System.out.println();
        System.out.println("book01.hashCode() = " + book01.hashCode());
        System.out.println("book02.hashCode() = " + book02.hashCode());
        System.out.println("book03.hashCode() = " + book03.hashCode());
        System.out.println();

        System.out.println("book03.equals(book01) = " + book03.equals(book01));
        System.out.println("book03.equals(book02) = " + book03.equals(book02));
    }

    public static void printSeparator() {
        System.out.println();
        System.out.println("-----------");
        System.out.println();
    }

    public static void printTaskHeading(int taskNumber) {
        System.out.println("Task " + taskNumber + ".");
        System.out.println("=======");
        System.out.println();
    }
}

