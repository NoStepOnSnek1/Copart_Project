
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        //overall employee roster
        //would probably be better implemented as an unordered map with person and id as key
        ArrayList<Person> EmployeeRoster = new ArrayList<Person>();

        Scanner read = new Scanner(System.in);

        System.out.println("Welcome to the Copart sports tournament\n");


        //create the sporting list
        Sports Relay = new Sports(1,4, "Relay");
        Sports Football = new Sports(2,24, "Football");
        Sports Volleyball = new Sports(3,8, "Volleyball");
        Sports Tennis = new Sports(4,2, "Tennis");
        Sports Chess = new Sports(5,2, "Chess");


        //main application
        //boolean check = true;
        while(true)
        {
            System.out.println("Please enter first name of employee: ");
            String firstName = read.nextLine();
            System.out.println();

            System.out.println("Please enter last name of employee: ");
            String lastName = read.nextLine();
            System.out.println();

            System.out.println("Please enter ID of employee: ");
            int ID = read.nextInt();


            Person newEmployee = new Person(firstName, lastName, ID);
            EmployeeRoster.add(newEmployee);

            System.out.println("Please enter in an integer for the sport you would like to participate in.");
            System.out.println("1. Relay");
            System.out.println("2. Football");
            System.out.println("3. Volleyball");
            System.out.println("4. Tennis");
            System.out.println("5. Chess");

            int Selection = read.nextInt();
            System.out.println();

            System.out.println("Would you like to leave or add yourself to the roster?:");
            System.out.println("1. Remove");
            System.out.println("2. add");

            int choice = read.nextInt();

            //if relay
            if(Selection == 1)
                Relay.addDeletePlayer(newEmployee.getID(), choice, newEmployee.getFirstName());

            //if Football
            if(Selection == 2)
                Football.addDeletePlayer(newEmployee.getID(), choice, newEmployee.getFirstName());


            //if Volleyball
            if(Selection == 3)
                Volleyball.addDeletePlayer(newEmployee.getID(), choice, newEmployee.getFirstName());


            //if Tennis
            if(Selection == 4)
                Tennis.addDeletePlayer(newEmployee.getID(), choice, newEmployee.getFirstName());


            //if Chess
            if(Selection == 5)
                Chess.addDeletePlayer(newEmployee.getID(), choice, newEmployee.getFirstName());


            System.out.println();


        }

    }

}
