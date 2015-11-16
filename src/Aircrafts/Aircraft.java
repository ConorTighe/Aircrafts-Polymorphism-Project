package Aircrafts;

import java.util.Date;

public abstract class Aircraft {

	String id;
	String pilotName;
	int passengers;
	int speed;
	double cost;
	int distanceMiles;
	int time;
	
	
	abstract void calcTime();
	
	abstract String formatTime(int i);
	
	abstract void display();
	
	static void Takeoff(){
	Date date = new Date();
    
    // display time and date using toString()
    System.out.println(" Takeoff: " + date.toString());
	}
}
