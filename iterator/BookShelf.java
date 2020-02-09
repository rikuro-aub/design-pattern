import java.util.*;

public class BookShelf implements Aggregate {
    private ArrayList<Book> books;
    
    public BookShelf(int initialize) {
        this.books = new ArrayList<Book>(initialize);
    }
    
    public Book getBookAt(int index) {
        return books.get(index);
    }
    
    // 本を追加する
    public void appendBook(Book book) {
        this.books.add(book);
    }
    
    public int getLength() {
        return books.size();
    }
    
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}