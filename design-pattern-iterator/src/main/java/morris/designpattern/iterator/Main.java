package morris.designpattern.iterator;

import morris.designpattern.iterator.array.BookShelf;
import morris.designpattern.iterator.arraylist.ListBookShelf;

public class Main {

    public static final void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("A"));
        bookShelf.appendBook(new Book("B"));
        bookShelf.appendBook(new Book("C"));
        bookShelf.appendBook(new Book("D"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }

        ListBookShelf listBookShelf = new ListBookShelf(4);
        listBookShelf.appendBook(new Book("A"));
        listBookShelf.appendBook(new Book("B"));
        listBookShelf.appendBook(new Book("C"));
        listBookShelf.appendBook(new Book("D"));
        Iterator listIt = listBookShelf.iterator();
        while (listIt.hasNext()) {
            Book book = (Book)listIt.next();
            System.out.println(book.getName());
        }
    }

}
