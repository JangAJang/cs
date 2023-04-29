package design.strategy.payment;

public class CashPayment implements PaymentStrategy{

    private long myMoney;

    public CashPayment(long myMoney) {
        this.myMoney = myMoney;
    }

    @Override
    public void pay(long totalPrice) {
        if(myMoney < totalPrice) throw new IllegalArgumentException("돈이 그만큼 없습니다.");
        System.out.println("현금으로 " + totalPrice +"만큼 결제했습니다. 남은 금액은 " + myMoney+"원 입니다.");
        myMoney -= totalPrice;
    }
}
