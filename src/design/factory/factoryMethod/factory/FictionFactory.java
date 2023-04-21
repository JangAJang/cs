package design.factory.factoryMethod.factory;

import design.factory.factoryMethod.book.Book;
import design.factory.factoryMethod.book.Fiction;

public class FictionFactory implements BookFactory{

    @Override
    public Book createBook() {
        return new Fiction();
    }
}
