package RazorPay;

public class RazorpayGateway {

    public String PayByCreditCard(String creditCard,String CVV,String expiry)
    {
        System.out.println("Payment Done via razorpay");
        return "123";
    }

    public boolean checkPaymentStatus(String id)
    {
        return false;
    }


}
