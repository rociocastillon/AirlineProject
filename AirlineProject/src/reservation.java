
public class reservation {
	private int flightNumber;
	private int reservationNumber;
	private String flightTime;
	private String departingCity;
	private String destinationCity;
	
	public reservation(int flightNumber, String flightTime, String departingCity, String destinationCity, int reservationNumber)
	{
		this.flightNumber = flightNumber;
		this.flightTime = flightTime;
		this.departingCity = departingCity;
		this.destinationCity = destinationCity;
		this.reservationNumber = reservationNumber;
	}
	public int getflightNumber() 
	{
		return flightNumber;
	}
	public String getFlightTime()
	{
		return flightTime;
	}
	public String getDepartingCity()
	{
		return departingCity;
	}
	public String getdestinationCity()
	{
		return destinationCity;
	}
	public int getReservationNumber()
	{
		return reservationNumber;
	}
	public void setFlightNumber(int flightNumber)
	{
		this.flightNumber = flightNumber;
	}
	public void setFlightTime(String flightTime) 
	{
		this.flightTime = flightTime;
	}
	public void setdepartingCity(String departingCity)
	{
		this.departingCity = departingCity;
	}
	public void setDestinationCity(String destinationCity)
	{
		this.destinationCity = destinationCity;
	}
	public void setReservationNumber(int reservationNumber)
	{
		this.reservationNumber = reservationNumber;
	}
}
