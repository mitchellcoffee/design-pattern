package morris.designpattern.iterator.arraylist;

import morris.designpattern.iterator.Iterator;

public class ListBookShelfIterator implements Iterator {

    private ListBookShelf bookShelf;

    private int index;

    public ListBookShelfIterator(ListBookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    public Object next() {
        return bookShelf.getBookAt(index++);
    }
}
