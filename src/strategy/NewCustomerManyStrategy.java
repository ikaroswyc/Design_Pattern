package strategy;

public class NewCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("9折");
        return standardPrice* 0.9;
    }
}
