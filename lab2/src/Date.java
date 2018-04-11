public class Date
{
	private int date;
	private int month;
	private int year;
	private String finaldate;
		
	public Date(int date,int month,int year)
	{
		this.date = date;
		this.month = month;
		this.year = year;
	}
	public String toString()
	{
		finaldate=date+"/"+month+"/"+year;
		return finaldate;
		
	}
}
		