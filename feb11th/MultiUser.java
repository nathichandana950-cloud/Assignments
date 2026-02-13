class LoginUser extends Thread{
    public void run(){
        System.out.println(getName()+"Login started");
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
        }
        System.out.println(getName()+"login successful");
    }

}
public class MultiUser {
    public static void main(String[] args) throws InterruptedException{
        LoginUser[] users = new LoginUser[10];
        for(int i=0; i<10; i++){
            users[i] = new LoginUser();
            users[i].setName("users:"+(i+1));
            System.out.println("Before start (" + users[i].getName() + ") : "+ users[i].getState());
            users[i].start();

        }

    }
    
}