package design.factory.factoryMethod.factory;

import design.factory.factoryMethod.book.Book;
import design.factory.factoryMethod.book.NonFiction;

public class NonFictionFactory implements BookFactory{

    @Override
    public Book createBook() {
        return new NonFiction();
    }
}
