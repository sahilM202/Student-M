import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first and last name:");
        var surname=sc.nextLine();
        var name=sc.nextLine();
        System.out.println("enter your age and FIN:" );
        var age=sc.nextInt();
        String FIN= sc.next();
        System.out.println("Everything is okay,continue  " +
                "What kind of course do you want to take?");
        var count=sc.nextInt();
        int  amount=count*500;
        System.out.println("this is amount: "+"  "+amount);
        System.out.println("How much do you want to pay?");
        int payment= sc.nextInt();
        int  remainingDebt=amount-payment;
        System.out.println("the remaining debt:"+"  "+remainingDebt);
        System.out.println("registration was successful!!");
        if (age<18){
            throw new ArithmeticException("bad age");

        }
    }


}
