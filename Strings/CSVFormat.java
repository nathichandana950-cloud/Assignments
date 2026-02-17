public class CSVFormat {
    public static void main(String[] args) {

        String data = "101,Ravi,50000";

        String[] parts = data.split(",");

        System.out.println("ID:" + parts[0]);
        System.out.println("Name:" + parts[1]);
        System.out.println("Salary:" + parts[2]);
    }
}
