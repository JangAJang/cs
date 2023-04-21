package design.factory.factoryMethod.book;

public class Fiction implements Book {

    @Override
    public void tellInfo() {
        System.out.println("이 책은 소설입니다.");
    }

    @Override
    public void sellBook() {
        System.out.println("소설책이 판매되었습니다.");
    }
}
