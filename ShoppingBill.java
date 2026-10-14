public class ShoppingBill {

    public static double calculateElectronicsGST(double a, double b) {
        return (a + b) * 1.18;
    }

    public static double calculateFashionGST(double c, double d) {
        return (c + d) * 1.13;
    }

    public static double calculateFoodGST(double e) {
        return e * 1.07;
    }

    public static double totalBill(double a, double b,
                                   double c, double d, double e) {
        return calculateElectronicsGST(a, b)
             + calculateFashionGST(c, d)
             + calculateFoodGST(e);
    }

    public static double calculateDiscountedBill(
            double a, double b, double c, double d, double e) {

        double total = totalBill(a, b, c, d, e);
        return total * 0.80;
    }

    public static void main(String[] args) {

        double a = 100, b = 100, c = 100, d = 100, e = 100;

        System.out.printf("Electronics: %.2f%n",
                calculateElectronicsGST(a, b));

        System.out.printf("Fashion: %.2f%n",
                calculateFashionGST(c, d));

        System.out.printf("Food: %.2f%n",
                calculateFoodGST(e));

        System.out.printf("Total Bill: %.2f%n",
                totalBill(a, b, c, d, e));

        System.out.printf("Final Payable Amount: %.2f%n",
                calculateDiscountedBill(a, b, c, d, e));
    }
}