
public class Person {
	private String FName;
	private String LName;
	private String phoneNumber;
	private String email;
	
	public Person(String FName, String LName, String phoneNumber, String email)
	{
		this.FName = FName;
		this.LName = LName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		
	}
	
	public String getFName()
	{
		return FName;
	}
	public String getLName()
	{
		return LName;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public String getEmail()
	{
		return email;
	}
	public void setFName(String FName) 
	{
		this.FName = FName;
	}
	public void setLName(String LName)
	{
		this.LName = LName;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public void setphoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
}
