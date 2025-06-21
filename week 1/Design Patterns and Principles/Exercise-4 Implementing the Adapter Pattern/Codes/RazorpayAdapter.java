public class RazorpayAdapter implements PaymentProcessor {
    private RazorpayGateway razorpay;

    public RazorpayAdapter() {
        this.razorpay = new RazorpayGateway();
    }

    public void processPayment(double amount) {
        razorpay.makePayment(amount);
    }
}
