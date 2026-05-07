package TaiyariDSA.array;

import java.util.Scanner;

public class SimpleLoginSystem {
    public static void main(String[] args) {
        String username = "ashu";
        String password = "ashu";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your username : ");
         String name = sc.nextLine();
        System.out.print("Enter your password : ");
        String pass = sc.nextLine();
        if(username.equals(name) && password.equals(pass)){
            System.out.println("Login Successful");
        }else{
            System.out.println("Login Failed");
        }
    }
}
