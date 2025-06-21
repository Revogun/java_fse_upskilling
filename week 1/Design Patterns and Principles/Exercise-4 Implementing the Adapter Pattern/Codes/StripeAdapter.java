public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripe;

    public StripeAdapter() {
        this.stripe = new StripeGateway();
    }

    public void processPayment(double amount) {
        stripe.payAmount(amount);
    }
}
