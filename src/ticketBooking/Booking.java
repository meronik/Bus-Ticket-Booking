package ticketBooking;

import java.util.Date;

public class Booking {
	private String pname;
	private int age;
	private String gender;
	private int tickets;
	Date bookingDate;
	
	
	public Booking(String pname, int age, String gender, int tickets,Date date) {
		super();
		this.pname = pname;
		this.age = age;
		this.gender = gender;
		this.tickets = tickets;
		this.bookingDate=date;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getTickets() {
		return tickets;
	}
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}
	
	
	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	@Override
	public String toString() {
		return "Booking [pname=" + pname + ", age=" + age + ", gender=" + gender + ", tickets=" + tickets + "]";
	}
	
	

	

}
