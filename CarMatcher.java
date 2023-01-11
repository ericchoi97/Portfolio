import java.util.Scanner;

//** SAMPLE
public class Car 
	{ 
private String make; 
private int mileage; 
public Car(String carMake, int initialMileage) 

	{ 
make = carMake; 
mileage = initialMileage; 
	} 
	
// other methods go here 

	} 
public class CarManager { public static void main(String[] args)
	{ 
Car myCar = new Car("xxxxx", xxxxx); 

// instructions to use this car goes here 
	}
	
	
// END OF SAMPLE FROM ASSIGNMENT INSTRUCTIONS //
	
//** LINE OF DEMARCATION //

public class CarMatcher

{
	public static void main(String[] args)
	{
		boolean quit = false;
		String model, make;
		int year = 0;
		Scanner scan = new Scanner(System);
		
		//create empty objects
		Car car = new Car(" ", " ", 0);
		
		while(!quit)
		{
			System.out.println("Please enter the Make, Model and year of your desired match:  ");
			make = scan.next();
			model = scan.next();
			year = scan.nextInt();
			
			//assigns data to object
			car.setMake(make);
			car.setModel(model);
			car.setYear(year);
			scan.nextLine();
			
			System.out.println("Just to confirm, is this right?:  " + car);
			System.out.println("Type 'R' to reset the search paramatters, or any ket to continue");
			toQuit = scan.next();
			
			if (toQuit.equalsIgnoreCase("R"))
				quit = true;
		}
		
	}
}

// "CarMatcher, the online dating site matching those with //
// mechinically-orientated tastes with the objects of their desire." //
{
	
		//private fields
		private String _model;
		private String _make;
		private int _year;
		
		//constructor
		public car(String make, String model, int year)
		{
			_model = model;
			_make - make;
			_year = year;
		}
		
		//getters
		public String getModel() 
		{
			return _model;
		}
		public String getMake(String make) 
		{
			_make = make;
		}
		public void setYear(int year)
		{
			_year = year;
		}
		public String toString()
		{
			return _make + " " + _model + " " + Integer.toString(_year);
		}
		
		scan.close()
		System.out.println("Please consider some psychotherapy. This session has been reported to the DMV.");
}