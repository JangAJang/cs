package design.strategy;

import design.strategy.cart.ShoppingCart;
import design.strategy.item.Item;
import design.strategy.payment.CardPayment;
import design.strategy.payment.CashPayment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrategyMain {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args)throws IOException {
        CardPayment cardPayment = new CardPayment();
        CashPayment cashPayment = new CashPayment(takeCash());
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item;
        do{
            item = inputItem();
            shoppingCart.addItem(item, inputAmount());
        }while(item != null);
        shoppingCart.checkPayment(cardPayment);
        shoppingCart.checkPayment(cashPayment);
    }

    private static long takeCash() throws IOException{
        System.out.print("얼마를 들고 오셨나요? : ");
        return Long.parseLong(br.readLine());
    }

    private static Item inputItem() throws IOException{
        System.out.print("상품명을 입력해주세요 : ");
        String name = br.readLine();
        if(name.equals("0")) {
            return null;
        }
        System.out.print("가격을 숫자만 입력해주세요 : ");
        long price = Long.parseLong(br.readLine());
        return new Item(name, price);
    }

    private static int inputAmount() throws IOException{
        System.out.print("몇 개인지 입력해주세요 : ");
        return Integer.parseInt(br.readLine());
    }
}
