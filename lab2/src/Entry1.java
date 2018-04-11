class Entry1 
{
	public static void main(String[] args)
    {
	Date d = new Date(10,11,2016);
	
	        Employee c = new Employee("teena","bodhwani",10000,'b',d);
		c.displayDetails();
		d = new Date(12,11,2014);
		c = new Employee("meena","kumari",20000,'b',d);
		c.displayDetails();
		d = new Date(06,04,2016);
    	c = new Employee("rekha","sachdeva",40000,'a',d);
		c.displayDetails();
		d = new Date(03,02,2015);
	    c = new Employee("aashu","sawant",8000,'c',d);
		c.displayDetails();
		d = new Date(11,03,2013);
	    c = new Employee("neha","beli",40000,'a',d);
		c.displayDetails();
		//*		System.out.println("\tno.of employees: "+ c.count);
}}