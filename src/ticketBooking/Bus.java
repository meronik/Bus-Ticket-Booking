package ticketBooking;

public class Bus {
	private String BusName;
	
	private String Source;
	private String destination;
	private int seatsAvail;
	private int cost;
	private String stime;
	private String atime;
	
	
	
	
	public Bus(String busName, String source, String destination, int seatsAvail, int cost, String stime,
			String atime) {
		super();
		BusName = busName;
		Source = source;
		this.destination = destination;
		this.seatsAvail = seatsAvail;
		this.cost = cost;
		this.stime = stime;
		this.atime = atime;
	}
	
	public String getBusName() {
		return BusName;
	}
	public void setBusName(String busName) {
		BusName = busName;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getSeatsAvail() {
		return seatsAvail;
	}
	public void setSeatsAvail(int seatsAvail) {
		this.seatsAvail = seatsAvail;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getStime() {
		return stime;
	}
	public void setStime(String stime) {
		this.stime = stime;
	}
	public String getAtime() {
		return atime;
	}
	public void setAtime(String atime) {
		this.atime = atime;
	}
	@Override
	public String toString() {
		return "Bus \nBusName : " + BusName + "\nSource : " + Source + "\ndestination : " + destination + "\nseatsAvailable : "
				+ seatsAvail + "\ncost : " + cost + "\nstime : " + stime + "\natime : " + atime + "]";
	}
	
	
		

}
