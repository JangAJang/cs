package design.singleton.coffee;

public class Americano {
    private final String name = "아메리카노";
    private final int price = 1_800;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void tellInfo(){
        System.out.println(name + "는 " + price + "입니다.");
    }
}
