package library;

import java.util.List;

public class Library {
    private final String libraryName;

    private List<Book> books;

    public Library(String libraryName, List<Book> books) {
        this.libraryName = libraryName;
        this.books = books;
    }

    public void getBookToRead(Book book, Reader reader){
        for(Book currentBook : books){
            String currentTitle = currentBook.getTitle();
            String neededTitle = book.getTitle();
            if(currentBook != null && currentTitle.equals(neededTitle)){
                if(!currentBook.isAvailable()){
                    System.out.println("Книга " + currentBook.getTitle() + " зайнята");
                    currentBook.whoReading();
                    return;
                }
                currentBook.setReader(reader);
                reader.setBook(currentBook);
                System.out.println(reader.getReaderName() + " взяв книгу " + currentBook.getTitle() + " в " + getLibraryName());
                break;
            }
        }
    }

    public  String getLibraryName() {
        return libraryName;
    }

}