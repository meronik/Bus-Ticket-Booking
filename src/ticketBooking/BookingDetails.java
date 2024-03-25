package ticketBooking;

import java.util.Date;

public class BookingDetails {

	private String bookedBusName;
	private String bookedSource;
	private String bookedDestination;
	private Date bookedDate;
	private int count=0;
	
	
	public BookingDetails(String bookedBusName , Date bookedDate,int count) {
		super();
		this.bookedBusName = bookedBusName;
		this.count=count;
		this.bookedDate = bookedDate;
	}
	
	public String getBookedBusName() {
		return bookedBusName;
	}
	public void setBookedBusName(String bookedBusName) {
		this.bookedBusName = bookedBusName;
	}
	public String getBookedSource() {
		return bookedSource;
	}
	public void setBookedSource(String bookedSource) {
		this.bookedSource = bookedSource;
	}
	public String getBookedDestination() {
		return bookedDestination;
	}
	public void setBookedDestination(String bookedDestination) {
		this.bookedDestination = bookedDestination;
	}
	public Date getBookedDate() {
		return bookedDate;
	}
	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "BookingDetails [bookedBusName=" + bookedBusName + ", bookedSource=" + bookedSource
				+ ", bookedDestination=" + bookedDestination + ", bookedDate=" + bookedDate + "]";
	}
	

}
