public class Main {
    public static void main(String[] args) {
        PaymentProcessor razorpay = new RazorpayAdapter();
        PaymentProcessor stripe = new StripeAdapter();

        razorpay.processPayment(500.0);
        stripe.processPayment(20.0);
    }
}
