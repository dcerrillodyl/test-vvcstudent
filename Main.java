import java.util.Scanner;

public class Main {
    public static void print_menu() {
        System.out.println("-----------------------");
        System.out.println("Enter s for sine wave.");
        System.out.println("Enter c for cosine wave.");
        System.out.println("Enter q for quit.");
        System.out.println("-----------------------");
    }

    public static char get_choice() {
        Scanner input = new Scanner(System.in);
        return input.next().charAt(0);
    }

    public static void print_sine_wave_values() {
        for(int i=0;i<360;i++) {
            System.out.println(Math.toRadians(i)+","+Math.sin(Math.toRadians(i)));
        }
    }

    public static void print_cosine_wave_values() {
    }

    public static void print_error() {
       System.out.println("Error, wrong value.");
    }

    public static void main(String args[]) {
        /*

            do 
                print menu
                get choice
                if choice is sine
                    output sine values
                if choice is cos
                    output cos values
                
            while choice is not quit
        */
        char choice;
        do  {
            print_menu();// done
            choice = get_choice();
            if(choice == 's') {
                print_sine_wave_values();
            }
            else if (choice == 'c') {
                print_cosine_wave_values();
            }
            else if (choice != 'q') {
                print_error();
            }

        } while (choice != 'q');
    }
}
