package library;

public class Book {
    private String title;
    private String author;
    private Reader reader;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public boolean isAvailable() {
        return reader == null;
    }
    public void setReader(Reader reader) {
        this.reader = reader;
    }
    public Reader getReader() {
        return reader;
    }
    public String getTitle() {
        return title;
    }

    public void whoReading(){
        if(this.reader == null){
            System.out.println("Книгу " + title + " ніхто не читає.");
        } else {
            System.out.println("Книгу " + title + " читає " + reader.getReaderName() + ".");
        }
    }
}
