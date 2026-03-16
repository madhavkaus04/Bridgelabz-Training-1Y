public class RegularOrder extends Order {

    // Constructor
    public RegularOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    // No discount — just baseAmount + deliveryCharge
    @Override
    public double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}
