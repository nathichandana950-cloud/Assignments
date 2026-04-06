public class Configuration {
    public static void main(String[] args) {
        int maxUser=150;
        double threshold=75.5;
        boolean featureFlag=true;
        String environmentName="Production";

        int maxUserLimit=100;
        double thresholdLimit=70.0;

        System.out.println("Max User : " + maxUser);
        System.out.println("Threshold : " + threshold);
        System.out.println("Feature Flag : " + featureFlag);
        System.out.println("Environment Name :"+ environmentName);
        System.err.println();
        if(maxUser > maxUserLimit){
            System.out.println("Warning: Max users (" + maxUser + ") exceed the system limit (" + maxUserLimit + ")!");
        }
        if(threshold > thresholdLimit){
            System.out.println("Warning: Max threshold(" + threshold + ") exceed the system limit (" + thresholdLimit + ")!");
        }
        System.out.println("completed configuration");

    }
}
