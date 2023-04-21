package design.factory.factoryMethod.factory;

import design.factory.factoryMethod.book.Book;
import design.factory.factoryMethod.book.Magazine;

public class MagazineFactory implements BookFactory{

    @Override
    public Book createBook() {
        return new Magazine();
    }
}
