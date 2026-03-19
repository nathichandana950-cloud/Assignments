public class TypeCasting {

    public static void main(String[] args) {

        double billAmount = 2599.75;
        System.out.println("Original Bill Amount (double): " + billAmount);

        int storedAmount = (int) billAmount;
        System.out.println("Stored Bill Amount (int): " + storedAmount);

        double precisionLoss = billAmount - storedAmount;
        System.out.println("Precision Loss: " + precisionLoss);

        double convertedBack = storedAmount;
        System.out.println("Implicit Casting (int to double): " + convertedBack);
    }
}
