class Employee
    {
		public static int count = 0;
		private int employeeid; 
		private String firstname;
		private String lastname;
		private float salary;
		private char grade;		
        private Date doj;
public Employee(String firstname,String lastname,float salary,char grade,Date doj) 
    {
        count();
		this.firstname = firstname;	
		this.lastname = lastname;
		this.salary = salary;
        this.grade = grade;
		this.doj = doj;
	}	
 			
void displayDetails()
    {
		System.out.print("employeeid: "+ employeeid);
		System.out.println("\tfirstname: "+ firstname);
		System.out.println("\tlastname: "+ lastname);
		System.out.println("\tsalary: "+ salary);
		System.out.println("\tgrade: "+ grade);
		System.out.println("\tDate: "+ doj.toString());
		System.out.println("\tno.of employees: "+ count);
	}
	    		  
public int count()
    {
        employeeid = ++count;
        return employeeid;		
	}
	}

	    		  	