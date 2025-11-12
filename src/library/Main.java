package library;


import java.util.List;

public class Main {
    public static void main(String[] args){
        Reader reader1 = new Reader("Іван");
        Reader reader2 = new Reader("Марія");

        Book book1 = new Book("Війна і мир", "Лев Толстой");
        Book book2 = new Book("1984", "Джордж Орвелл");

        Library library = new Library("Міська бібліотека", List.of(book1, book2));
        library.getBookToRead(book1, reader2);
        library.getBookToRead(book1, reader1);
    }
}