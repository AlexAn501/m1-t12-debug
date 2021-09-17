public class Ai100Calculator {
    double price = 51.55;
    double tax = 0.02;

    public double calculate(double volume, double discount) {
        double fullPrice = price * (1 + tax - discount);
        return volume * fullPrice;
    }
}
//      double fullPrice = price * (1 - discount);
//        System.out.println("fullPrice = " + fullPrice);
//        return volume * fullPrice;