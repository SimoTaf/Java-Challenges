import java.util.Scanner;


public class test{


    public static void main(String[] args) {
         System.out.println("How old are you ?:");
         Scanner sc  = new Scanner(System.in);
         int save_int = sc.nextInt();
         System.out.println("What is your name ? :");
         Scanner sct = new Scanner(System.in);
         String  save_str= sct.nextLine();
         if(save_str.equals("Sid Ahmed") && save_int == 24){
         System.out.println("\nWelcome "+save_str+" You are  "+save_int+" years old!");}
         else System.out.println("\n Goodby , you are not  welcome!");
         sct.close();
         sc.close();




    }


}
