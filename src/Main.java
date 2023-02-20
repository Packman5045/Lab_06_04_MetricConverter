import java.util.Scanner;
//this code allows us to use an input function for the user
public class Main {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        //this allows us to name the scanner for later use in the code
    String trash = "";
    int meters = 0;
    //variables listed above



    System.out.println("What is the measurement in meters?");
    //prompt for meters for the user to input

        if(scan.hasNextInt())
        {
            meters = scan.nextInt();
            //this allows us to store the user's answer
            scan.nextLine();
            //this prevents a buffer in the program

        }
        else
        {
            trash = scan.nextLine();
            System.out.println("ERROR. Please put in proper values " + trash + " is not a valid number.");
        }

            double miles = (meters * 0.000621);
            double feet = (meters * 3.281);
            double inches = (meters * 39.37);


            System.out.println(meters + " Converted to miles is " + miles);
            System.out.println(meters + " Converted to feet is " + feet);
            System.out.println(meters + " Converted to inches is " + inches);



    }
}