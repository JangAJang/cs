package design.factory.simpleFactory;

import java.time.LocalDateTime;

public class Movie extends Item{
    private String name;
    private final LocalDateTime onScreenDate;
    private final int price;

    public Movie(String name, LocalDateTime onScreenDate, int price) {
        this.price = price;
        this.onScreenDate = onScreenDate;
        this.name = name;
    }

    @Override
    public String getInfo() {
        return "이 영화는 " + onScreenDate.toLocalDate() + "에 개봉하는 "+ name + "입니다. 가격 :: " + price ;
    }
}
