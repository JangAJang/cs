package design.factory;

import java.time.LocalDateTime;

public class Album extends Item{
    private final String name;
    private final LocalDateTime onSaleDate;
    private final int price;

    public Album(String name, LocalDateTime onSaleDate, int price) {
        this.name = name;
        this.onSaleDate = onSaleDate;
        this.price = price;
    }

    @Override
    public String getInfo() {
        return name+"이라는 노래로, " + onSaleDate.toLocalDate() +"에 판매됩니다. 가격 :: " + price;
    }
}
