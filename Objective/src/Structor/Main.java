package Structor;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
	
	Scanner s = new Scanner("System,in");
	
	System.out.println("Enter FirstName:");
	String firstName = s.nextLine();
	
	System.out.println("Enter LastName:");
	String lastName = s.nextLine();
	
	System.out.println("Enter Sex:");
	char sex = s.next().charAt(0);
	
	System.out.println("Enter Age:");
	int age = s.nextInt();
	
	Person p = new Person(firstName, lastName, sex, age);
	
	System.out.println("\n" + "....Person Profile Created....: ");
	System.out.println("Full Name:" + p.firstName + " " + p.lastName);
	System.out.println("Sex: " + p.sex);
	System.out.println("Age: " + p.age);
	}

}
