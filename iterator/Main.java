public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("book name 1"));
        bookShelf.appendBook(new Book("book name 2"));
        bookShelf.appendBook(new Book("book name 3"));
        bookShelf.appendBook(new Book("book name 4"));
        Iterator it = bookShelf.iterator();
        while(it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}