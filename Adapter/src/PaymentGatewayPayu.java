public interface PaymentGatewayPayu {

    Long PayViaCCPayu(String cardNumber,int CC,int expiryMonth,int expiryYear);

    PaymentStatusPayu getStatusPayu(Long id);
}
