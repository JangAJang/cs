package design.factory.factoryMethod.book;

public class NonFiction implements Book{

    @Override
    public void tellInfo() {
        System.out.println("이 책은 비문학입니다.");
    }

    @Override
    public void sellBook() {
        System.out.println("비문학 서적이 판매되었습니다.");
    }
}
