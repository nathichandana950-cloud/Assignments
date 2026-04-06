public class StudentMarks {

    public static void main(String[] args) {

        int[] marks = {85, 92, 76, 105, -5, 48, 66};

        int passCount = 0;
        int failCount = 0;

        System.out.println("Marks Validation:");

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks for student " + (i + 1) + " : " + marks[i]);
                continue;  
            }

            if (marks[i] >= 50) {
                passCount++;
            } else {
                failCount++;
            }
        }

        System.out.println("\nTotal Pass Students: " + passCount);
        System.out.println("Total Fail Students: " + failCount);
    }
}

