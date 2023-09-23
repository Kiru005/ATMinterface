
/**
 * ATM interface
 */

import java.util.*;

public class ATMinterface{

    public static void main(String[] args){

        int pin = 1234;
        int balance = 50000;

        int AddAmount = 0;
        int TakeAmount = 0;

        String name;

        Scanner scanner = new Scanner(System.in);

        //we have to take an input by an user
        
        System.out.println("Enter your pin number");

        int password = scanner.nextInt();

        if(password==pin)
        {
            System.out.println("Enter your name");
            name = scanner.next();
            System.out.println("Welcome " + name);

            while (true){
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 to take recipt");
                System.out.println("Press 5 to ExIT");

                int opt = scanner.nextInt();
                switch(opt){
                    case 1:
                        System.out.println("Your current balance is " + balance);
                        break;
                    case 2:
                        System.out.println("How much amount did you want to ADD to your account");
                        AddAmount=scanner.nextInt();
                        System.out.println("Successfully credited");
                        balance = AddAmount + balance;
                        //1000 = 100 + 50000
                        //balance = 50100
                        break;
                    case 3:
                        System.out.println("How much amount did you want to take ");
                        TakeAmount= scanner.nextInt();
                        if(TakeAmount>balance){
                            System.out.println("Your balance is insufficient");
                            System.out.println("Try less than your available balance");

                        }
                        else{
                            System.out.println("Successfully taken");
                            balance = balance-TakeAmount;
                            //balance = 50100 = 50100 - 100
                            //balance = 50000
                        }
                        break;
                    case 4:
                        System.out.println("Welcome to all in one mini ATM");
                        System.out.println("Available balance is " + balance);
                        System.out.println("Amount deposited   " + AddAmount);
                        System.out.println("Amount taken     " + TakeAmount);
                        System.out.println("Thanks for coming");
                        break;
                            default:
                            System.out.println("press the number below 5");
                            break;
                }
                if(opt == 5)
                {
                    System.out.println("Thankyou");
                    break;
                }   
            }
        
        }
        else
        {
            System.out.println("Wrong pin number");
        }

                    


                }
            

            }

        



