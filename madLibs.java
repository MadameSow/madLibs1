import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Enter a US state: ");
    String usaState = myObj.nextLine();  // Read user input
    System.out.println("Enter a verb ending in -ing: ");
    String verb = myObj.nextLine();  // Read user input
    System.out.println("Enter an animal: ");
    String animal = myObj.nextLine();  // Read user input
    System.out.println("Enter your desired job title: ");
    String profession = myObj.nextLine();  // Read user input
    System.out.println("A crazy person from, you guessed it: " + usaState + " was arrested this morning after they were caught " + verb
    + " in front of a crowd of " + animal + "s." + '\n' + " Every precaution has been taken by the state of " + usaState + 
    " to prevent further " + verb + " in public. If you catch anyone else commiting this crime, " + '\n' + "be a good citizen and report it to your local " 
    + profession + ".");
    }
}
