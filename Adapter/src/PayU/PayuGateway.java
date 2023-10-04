package PayU;

public class PayuGateway {

    public String makeCCPayment(Long CreditCard,Long CC,Long Expiry)
    {
        System.out.println("payment done by PayU");
        return "123";
    }
    public PayUpaymentStatus checkPaymentStatus(String id)
    {
        return PayUpaymentStatus.FAILURE;
    }
}
