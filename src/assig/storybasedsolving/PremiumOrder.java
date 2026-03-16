public class PremiumOrder extends Order {

    private static final double DISCOUNT_RATE = 0.20; // 20% discount

    // Constructor
    public PremiumOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    // 20% discount on baseAmount, then add deliveryCharge
    @Override
    public double calculateBill() {
        double discountedAmount = baseAmount - (baseAmount * DISCOUNT_RATE);
        return discountedAmount + deliveryCharge;
    }
}
