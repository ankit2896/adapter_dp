public interface PaymentGateway {

    Long PayViaCC(String cardNumber,int CC,int expiryMonth,int expiryYear);

    PaymentStatus getStatus(Long id);
}
