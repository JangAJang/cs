package design.strategy.cart;

import design.strategy.item.Item;
import design.strategy.payment.PaymentStrategy;

import java.util.*;

public class ShoppingCart {
    private final HashMap<Item, Integer> items = new HashMap<>();

    public void addItem(Item item, int amount){
        if(item == null) return;
        if(items.containsKey(item)){
            int currentAmount = items.get(item);
            items.replace(item, currentAmount, currentAmount+amount);
            return;
        }
        items.put(item, amount);
    }

    public void removeItem(Item item, int amount){
        if(!items.containsKey(item)){
            throw new IllegalArgumentException("해당 상품을 담은 적 없습니다.");
        }
        int stock = items.get(item);
        if(stock < amount){
            throw new IllegalArgumentException("해당 상품을 그만큼 담지 않았습니다. 상품 개수 : " + stock);
        }
        if(stock == amount){
            items.remove(item);
            return;
        }
        items.replace(item, stock, stock - amount);
    }

    public void checkPayment(PaymentStrategy paymentStrategy){
        long total = 0;
        for(Item each : items.keySet()){
            total += each.getPrice() * items.get(each);
        }
        paymentStrategy.pay(total);
    }
}
