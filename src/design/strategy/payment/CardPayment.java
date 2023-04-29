package design.strategy.payment;

public class CardPayment implements PaymentStrategy{

    private long debt;

    public CardPayment() {
        this.debt = 0L;
    }

    @Override
    public void pay(long totalPrice) {
        debt+=totalPrice;
        System.out.println("총 " + totalPrice+"원을 카드로 결제했습니다. 카드 빚이 " + debt + "원 남았습니다.");
    }

    public void chargeDebt(int money) {
        if(debt < money){
            throw new IllegalArgumentException("빚 이상의 돈은 받을 수 없습니다.");
        }
        debt -= money;
        System.out.println(money + "원을 갚았습니다. 신용카드 빚이 " + debt + "원 만큼 남았습니다.");
    }
}
