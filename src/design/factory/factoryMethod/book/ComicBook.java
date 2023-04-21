package design.factory.factoryMethod.book;

public class ComicBook implements Book{

    @Override
    public void tellInfo() {
        System.out.println("이 책은 만화책입니다.");
    }

    @Override
    public void sellBook() {
        System.out.println("만화책이 판매되었습니다.");
    }
}
