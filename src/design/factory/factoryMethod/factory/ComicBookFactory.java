package design.factory.factoryMethod.factory;

import design.factory.factoryMethod.book.Book;
import design.factory.factoryMethod.book.ComicBook;

public class ComicBookFactory implements BookFactory{

    @Override
    public Book createBook() {
        return new ComicBook();
    }
}
