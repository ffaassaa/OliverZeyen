package HW1.violations.paypal;

public class PaymentProcessor {
    private PayPalGateway payPalGateway;

    PaymentProcessor() {
        this.payPalGateway = new PayPalGateway();
    }

    void processPayment(Account account, double amount) {
        payPalGateway.processPayment(account, amount);
    }
    
    void processRequest(Account account, double amount) {
    	payPalGateway.processRequest(account, amount);
    }
}