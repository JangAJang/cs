package design.factory.factoryMethod.factory;

import design.factory.factoryMethod.book.Book;

public interface BookFactory {
    Book createBook();
    default Book orderBook() {
        Book book = createBook();
        book.tellInfo();
        return book;
    }
}
