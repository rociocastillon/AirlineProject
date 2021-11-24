
public class reservation {
	private int flightNumber;
	private String flightTime;
	private String departingCity;
	private String destinationCity;
	
	public reservation(int flightNumber, String flightTime, String departingCity, String destinationCity)
	{
		this.flightNumber = flightNumber;
		this.flightTime = flightTime;
		this.departingCity = departingCity;
		this.destinationCity = destinationCity;
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
}
