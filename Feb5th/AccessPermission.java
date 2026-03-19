import java.util.Scanner;
    public class AccessPermission{

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter your age: ");
      int var2 = var1.nextInt();
      var1.nextLine();
      System.out.print("Do you have a valid ID? (yes/no): ");
      String var3 = var1.nextLine();
      boolean var4 = var3.equalsIgnoreCase("yes");
      System.out.print("Is your subscription active? (yes/no): ");
      String var5 = var1.nextLine();
      boolean var6 = var5.equalsIgnoreCase("yes");
      if (var2 >= 18 && var4 && var6) {
         System.out.println("Access Granted ");
      } else {
         System.out.println("Access Denied ");
         if (var2 < 18) {
            System.out.println(" User must be at least 18 years old.");
         }

         if (!var4) {
            System.out.println(" Valid ID required.");
         }

         if (!var6) {
            System.out.println(" Active subscription required.");
         }
        }

      var1.close();
   }
}
