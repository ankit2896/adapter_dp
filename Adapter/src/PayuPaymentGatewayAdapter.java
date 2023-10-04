import PayU.PayUpaymentStatus;
import PayU.PayuGateway;

public class PayuPaymentGatewayAdapter implements PaymentGatewayPayu{

    private PayuGateway payuGateway = new PayuGateway();
    @Override
    public Long PayViaCCPayu(String cardNumber, int CC, int expiryMonth, int expiryYear) {
        Long CreditCard = Long.valueOf(cardNumber);
        Long CVV = (long)CC;
        Long Expiry = Long.valueOf((long)expiryMonth +"/"+ (long)expiryYear);
        String answer = payuGateway.makeCCPayment(CreditCard,CVV,Expiry);
        return  Long.parseLong(answer);
    }

    @Override
    public PaymentStatusPayu getStatusPayu(Long id) {
        PayUpaymentStatus paymentStatusPayu = payuGateway.checkPaymentStatus(String.valueOf(id));

        return  PaymentStatusPayu.SUCCESS;
    }
}
