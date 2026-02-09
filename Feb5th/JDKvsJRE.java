public class JDKvsJRE {
   

   public static void main(String[] var0) {
      System.out.println("=== JDK vs JRE Validation Program ===\n");
      System.out.println("1. JDK (Java Development Kit):");
      System.out.println("   - Includes Java compiler (javac), debugger, and development tools");
      System.out.println("   - Required to write and compile Java programs");
      System.out.println("\n2. JRE (Java Runtime Environment):");
      System.out.println("   - Includes JVM and standard libraries");
      System.out.println("   - Can only run compiled Java programs, cannot compile new ones");
      System.out.println("\n--- Compilation & Execution Flow ---");
      System.out.println("Compilation: javac JDKvsJRECheck.java (requires JDK)");
      System.out.println("Execution  : java JDKvsJRECheck (runs on JVM, either JRE or JDK can execute)");
   }
}