package ticketBooking;

import java.util.*;
import java.text.*;

public class Passenger {
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Date date;
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		buses.add(new Bus("bus-01","chennai","trichy",25,600,"5:00AM","11:00AM"));
		buses.add(new Bus("bus-02","chennai","madurai",25,1200,"11:00AM","8:00PM"));
		buses.add(new Bus("bus-03","chennai","theni",25,1800,"12:00PM","10:00PM"));
		buses.add(new Bus("bus-04","chennai","ariyalur",25,800,"1:00AM","6:00AM"));
		buses.add(new Bus("bus-05","chennai","madurai",25,1200,"12:00PM","9:00PM"));
		
		
		int userInput=1;
		Scanner sc1=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for booking and 2 for exit ");
		userInput=sc1.nextInt();
		while(userInput==1) {
			
		if(userInput==1) {
			
		
		System.out.println("Enter your FROM location : ");
		String l1=sc.nextLine();
		System.out.println("Enter your DESTINATION : ");
		String l2=sc.nextLine();
		System.out.println("Enter the date (ex:dd/mm/yyyy)");
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		String d1=sc.nextLine();
		date=sdf.parse(d1);
		System.out.println("AVAILABLE BUSSES ARE : " + l1 + " to " + l2 );
		
		//print a available buses
		boolean found=false;
		for(Bus b:buses) {
			if(b.getDestination().equalsIgnoreCase(l2) && b.getSource().equalsIgnoreCase(l1)) {
				System.out.println();
				System.out.println(b);
				System.out.println("---------------------------------");
				found=true;
			}
		}
		if(!found) {
			 System.out.println("There is no bus services are  avialable");
			}
		//booking
		System.out.println("Enter bus name : ");
		String busname=sc.nextLine();
		System.out.println("YOUR NAME : ");
		String name=sc.nextLine();
		System.out.println("YOUR AGE : ");
		int age=sc1.nextInt();
		System.out.println("GENDER : ");
		String gender=sc.nextLine();
		System.out.println("How tickets do you want book ? ");
		int tickets=sc1.nextInt();
		
		
			for(Bus bus:buses) {
				if(bus.getBusName().equalsIgnoreCase(busname)) {
					bookings.add(new Booking(name,age,gender,tickets,date));
					bus.setSeatsAvail(bus.getSeatsAvail()-tickets);
					System.out.println("Your booking is confirmed");
				}
			}
		}
		
		
		
		
		
		
		System.out.println("do you still want to continue the booking : (ex : y or n)" );
		String s=sc.nextLine();
		if(s.equals("y")) {
			userInput=1;
		}
		else {
		return;
		}
		
		}
	
	}
		

	}


