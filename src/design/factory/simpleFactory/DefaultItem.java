package design.factory.simpleFactory;

import java.time.LocalDateTime;

public class DefaultItem extends Item{
    private final String name;
    private final int price;
    private final LocalDateTime localDateTime;

    public DefaultItem(String name, LocalDateTime localDateTime, int price) {
        this.name = name;
        this.price = price;
        this.localDateTime = localDateTime;
    }

    @Override
    public String getInfo() {
        return "이 상품은 " + name + "으로 " + localDateTime.toLocalDate() + "에 판매됩니다. 가격 :: " + price;
    }
}
