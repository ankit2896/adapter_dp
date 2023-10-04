import RazorPay.RazorpayGateway;

public class RazorpayPaymentGatewayAdapter implements PaymentGateway {

    private RazorpayGateway razorpayGateway = new RazorpayGateway();
    @Override
    public Long PayViaCC(String cardNumber, int CC, int expiryMonth, int expiryYear) {
        String cvvString = String.valueOf(CC);
        String expiry = String.valueOf(expiryMonth) + "/"+ String.valueOf(expiryYear);
        String answer = razorpayGateway.PayByCreditCard(cardNumber,cvvString,expiry);
        return  Long.parseLong(answer);
    }

    @Override
    public PaymentStatus getStatus(Long id) {
        boolean status = razorpayGateway.checkPaymentStatus(String.valueOf(id));
        if(status)
        {
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.FAILING;
    }
}
