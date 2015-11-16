package Aircrafts;

public class Jet extends Aircraft {

	final int MaxPassengers = 4;
	
	// Constructors
	public Jet(){
		
		id="JetName";
		pilotName="Pilot";
		passengers=0;
		speed=0;
	}
	public Jet(String i,String n,int p,int s, double c){
		
		setId(i).setPilot(n).setPass(p).setSpeed(s).setCost(c);
	}
	
	// Sets
	public Jet setId(String i)
	{
		id = i;
		
		return this;
	}
	public Jet setPilot(String n)
	{
		pilotName = n;
		
		return this;
	}
	public Jet setPass(int p)
	{
		try
		{
			if(this.passengers > MaxPassengers)
			{
				throw new PassengersException("\n Too many passengers... Some cant get on");
			}			
			
		}
		catch(PassengersException e)
		{
			System.out.println(e.getMessage());
			passengers = MaxPassengers;
		}
		
		passengers = p;
		
		return this;
	}
	public Jet setSpeed(int s)
	{
		speed = s;
		
		return this;
	}
	public Jet setCost(double c)
	{
		cost = c;
		
		return this;
	}
	
	// Gets
	public String getId()
	{
		return id;
	}
	public String getPilot()
	{
		return pilotName;
	}
	public int getPassengers()
	{
		return passengers;
	}
	public int getSpeed()
	{
		return speed;
	}
	public double getCost()
	{
		return cost;
	}
	
	
	//abstract methods
	public void calcTime(){
							
		//distance divided by speed
		time = (distanceMiles * 60) / speed; 
		System.out.println(formatTime(time));
				
		}
						
	public String formatTime(int minutes){
			int hours = minutes / 60;
			minutes = minutes%60;

			String time = " ";
			if(hours != 0){
				time += hours + " hours ";
			}
			if(minutes != 0){
				time += minutes + " minutes ";
			}

				return time;
		}
	
	
	
	public void display(){
		
		System.out.println("");
		System.out.println("");
		System.out.println("			 ----Aircraft Info----");
		System.out.println("======================================================");
		System.out.println(" Aircraft Name: " + getId());
		System.out.println(" The name of the Pilot: " + getPilot());
		System.out.println(" The number of passengers is: " + getPassengers());
		System.out.println(" The speed the " + getId() + " was travling at: " + getSpeed() + "m/ph");
		System.out.println(" The cost: " + getCost() + " Million");
		System.out.println("======================================================\n");	
		System.out.println("");
		System.out.println("			 ----Aircraft Benchmarks----");
		System.out.println("======================================================");
		Takeoff();
		System.out.println("");
		distanceMiles = 3465;
		System.out.println(" Distance from London to New York: " + distanceMiles + "Miles");
		System.out.print(" The time it took the " + getId() + " to get there: ");
		calcTime();
		System.out.println("");
		distanceMiles = 6893;
		System.out.println(" Distance from Dubai to Toronto: " + distanceMiles + "Miles");
		System.out.print(" The time it took the " + getId() + " to get there: ");
		calcTime();
		System.out.println("");
		distanceMiles = 12429;
		System.out.println(" Distance from North Pole to South Pole: " + distanceMiles + " Miles");
		System.out.print(" The time it took the " + getId() + " to get there: ");
		calcTime();
	}
}
	
	



