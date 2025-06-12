package week10.SQLExer3AND4;


public class NorthWindMain {
    public static void main(String[] args) {
            if (args.length !=2){
                System.out.println("Two parms");
                System.exit(1);
            }

            String username = args[0];
            String password = args[1];
            String url = "jdbc:mysql://localhost:3306/northwind";

            UserInterface.homeScreen(username,password, url);
    }
}

