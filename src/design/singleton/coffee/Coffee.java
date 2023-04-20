package design.singleton.coffee;

public enum Coffee {
    AMERICANO(1800, "아메리카노"),
    LATTE(2000, "라떼"),
    ESPRESSO(1500, "에스프레소");

    private final int price;
    private final String name;

    private Coffee(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public void tellInfo(){
        System.out.println(name + "는 " + price + "입니다.");
    }
}
