public abstract class Order {

    protected int orderId;
    protected double baseAmount;
    static double deliveryCharge = 40;

    // Constructor
    public Order(int orderId, double baseAmount) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }

    // To be overridden by subclasses (polymorphism)
    public abstract double calculateBill();

    public void printBill() {
        System.out.println("-------------------------------");
        System.out.println("Order ID     : " + orderId);
        System.out.println("Base Amount  : ₹" + baseAmount);
        System.out.println("Delivery     : ₹" + deliveryCharge);
        System.out.println("Total Bill   : ₹" + calculateBill());
        System.out.println("-------------------------------");
    }
}
