package Aircrafts;
import java.util.Scanner;

public class Airport {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner console = new Scanner (System.in);
		
		int choice = 0;
		boolean done = false;
		
		do{
		System.out.println("======================================================");
		System.out.println("	Hello and welcome to Airport Simulator! ");
		System.out.println("======================================================");
		System.out.println(" 	Choose a Aircraft you wish to simulate, \n\tenter a "
				+ "corresponding number:");
		System.out.println(" * 1.Jet");
		System.out.println(" * 2.Heliccopter");
		System.out.println(" * 3.Plane");
		System.out.println(" * 4.Stunt-Plane");
		System.out.println("======================================================\n");	
		System.out.print("Enter number here:");	
		choice= console.nextInt();
		System.out.println("======================================================\n");	
		
		if(choice == 1){
			Jet Jet1 = new Jet("F-15 Eagle","A.Smith",2,764,28.0);
			Jet1.display();
		}
		else if(choice == 2){
			Helicopter Heli1 = new Helicopter("AH-64 Apache","S.Williams",6,182,37.5);
			Heli1.display();
		}
		else if(choice == 3){
			Plane Plane1 = new Plane("Boeing 777","C.Ryans",180,605,22.0);
			Plane1.display();
		}
		else if(choice == 4){
			StuntPlane StuntP1 = new StuntPlane("Zivko Edge 540","P.Reed",1,265,295000);
			StuntP1.display();
		}
		
		System.out.println("");
		System.out.println("======================================================");
		System.out.println("Would you like to return to the main menu? 1.Yes 2.No ");
		System.out.print("Enter number here:");	
		choice= console.nextInt();
		if(choice==1) {
			System.out.println("");
			System.out.println("");
		} else {
			System.out.println("");
		    System.out.println("	Maybe next time..");
		    done = true;
		}
		}while(done == false);
	}

}
