package design.factory.factoryMethod;

import design.factory.factoryMethod.book.Book;
import design.factory.factoryMethod.factory.ComicBookFactory;
import design.factory.factoryMethod.factory.FictionFactory;
import design.factory.factoryMethod.factory.MagazineFactory;
import design.factory.factoryMethod.factory.NonFictionFactory;

public class BookFactoryMain {

    public static void main(String[] args) {
        // 팩토리 생성
        FictionFactory fictionFactory = new FictionFactory();
        NonFictionFactory nonFictionFactory = new NonFictionFactory();
        ComicBookFactory comicBookFactory = new ComicBookFactory();
        MagazineFactory magazineFactory = new MagazineFactory();
        // 팩토리에서 객체를 생성 && 객체 판매
        Book fiction = fictionFactory.orderBook();
        fiction.sellBook();
        Book nonFiction = nonFictionFactory.orderBook();
        nonFiction.sellBook();
        Book comics = comicBookFactory.orderBook();
        comics.sellBook();
        Book magazine = magazineFactory.orderBook();
        magazine.sellBook();
    }
}
