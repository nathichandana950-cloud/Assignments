public class SalaryIncrement {

    public static void main(String[] args) {

        int[] salaries = {20000, 25000, 30000, 28000, 35000};

        System.out.println("Updated Salaries after 10% hike:");

        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = salaries[i] + (salaries[i] * 10 / 100);
            System.out.println(salaries[i]);
        }
    }
}

