package library;

public class Reader {
    private final String readerName;
    private Book book;

    public Reader(String readerName) {
        this.readerName = readerName;
    }
    public void setBook(Book carentBook) {
        this.book = carentBook;
    }

    public String getReaderName() {
        return readerName;
    }

    public void returnBook(Book book){
        if(this.book != null){
            this.book.setReader(null);
            this.book = null;
            System.out.println(getReaderName() + " повернув книгу " + book.getTitle());
        } else {
            System.out.println(getReaderName() + " не має такої книги для повернення.");
        }
    }

    public void readerReading(){
        if(this.book == null){
            System.out.println(getReaderName() + " не має книги для читання.");
            return;
        }
        System.out.println(getReaderName() + " читає книгу " + book.getTitle());
    }
}
