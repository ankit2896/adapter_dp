public class Flipkart {

    private PaymentGateway paymentGateway;

    private PaymentGatewayPayu paymentGatewayPayu;

    Flipkart(PaymentGateway paymentGateway,PaymentGatewayPayu paymentGatewayPayu)
    {
        this.paymentGateway = paymentGateway;
        this.paymentGatewayPayu = paymentGatewayPayu;
    }
    public void makePaymentviaCC(String cardNumber,int CVV,int expiryMonth,int expiryYear)
    {
       Long transactionId = paymentGateway.PayViaCC(cardNumber,CVV,expiryMonth,expiryYear);

       while(!paymentGateway.getStatus(transactionId).equals(PaymentStatus.SUCCESS))
       {
           System.out.println("Waiting");
       }
    }

    public void makePaymentviaCCPayu(String cardNumber,int CVV,int expiryMonth,int expiryYear)
    {
        Long transactionId = paymentGatewayPayu.PayViaCCPayu(cardNumber, CVV, expiryMonth, expiryYear);
        while(!paymentGatewayPayu.getStatusPayu(transactionId).equals(PaymentStatusPayu.SUCCESS))
        {
            System.out.println("waiting");
        }
    }
}
