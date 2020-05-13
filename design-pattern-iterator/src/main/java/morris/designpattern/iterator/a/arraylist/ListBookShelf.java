package morris.designpattern.iterator.a.arraylist;

import morris.designpattern.iterator.a.Aggregate;
import morris.designpattern.iterator.a.Book;
import morris.designpattern.iterator.a.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ListBookShelf implements Aggregate {

    private List<Book> books;

    public ListBookShelf(int maxSize) {
        this.books = new ArrayList<Book>(maxSize);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public Iterator iterator() {
        return new ListBookShelfIterator(this);
    }
}
