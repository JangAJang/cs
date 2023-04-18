package design.factory;

import java.time.LocalDateTime;

public class Book extends Item{
    private final String title;
    private final LocalDateTime writtenDate;
    private final int price;

    public Book(String title, LocalDateTime writtenDate, int price) {
        this.title = title;
        this.writtenDate = writtenDate;
        this.price = price;
    }

    @Override
    public String getInfo() {
        return "이 책은 " + writtenDate.toLocalDate() + "에 나온" + title + "입니다. 가격 ::" + price;
    }
}
