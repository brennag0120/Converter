import java.util.Scanner;
public class Assignment_5_2300 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to metric converter!\nPlease enter a number for your unit.");
        int num = scan.nextInt();
       

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter your unit; either kg, g, km, or mm.\nEnter 'exit' to exit this program.");
        String unit = scan2.nextLine();
        double output; 

        if(unit.equals("kg")){
            output= num * 2.204;
            System.out.println(num + " kilograms = " + output +" pounds" );
        }

        else if(unit.equals("g")){
            output= num * 0.035;
            System.out.println(num + " grams = " + output + " ounces" );
        }

        else if(unit.equals("km")){
            output= num * 0.621;
            System.out.println(num + " kilometers = " + output + " miles" );
        }

        else if(unit.equals("mm")){
            output= num * 0.039 ;
            System.out.println(num + " millimeters = " + output + " inches" );
        }

        else if(unit.equals("exit")){
            System.exit(0);
        }

        else{
            System.out.println("Your input is not currently handled by this app, please input another query");
        }
        
        scan.close();
        scan2.close();
    }
}
