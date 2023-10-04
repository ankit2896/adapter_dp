public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart(new RazorpayPaymentGatewayAdapter(),new PayuPaymentGatewayAdapter());
    }
}
