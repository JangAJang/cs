package design.factory.factoryMethod.book;

public class Magazine implements Book{

    @Override
    public void tellInfo() {
        System.out.println("이 책은 잡지입니다.");
    }

    @Override
    public void sellBook() {
        System.out.println("잡지가 판매되었습니다.");
    }
}
