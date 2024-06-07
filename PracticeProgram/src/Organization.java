

public class Organization {
	int empid;
	String empname;
	long PhoneNo;
	double salary;
	
	Organization()
	{
	}
	Organization(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
	}
	public void addEmployee(int empid,String empname)
	{
		System.out.println(empid+"----------"+empname);
	}
    }
    //--------------------------------------------------------------------------------------------
	class Employee extends Organization
	{
		Employee()
		{
		}
		Employee(long PhoneNo,long salary)
		{
			this.PhoneNo=PhoneNo;
			this.salary=salary;
		}
		public void employeedetails(int empid,String empname,long PhoneNo,long salary)
		{
			System.out.println(empid+"-----"+empname+"------"+PhoneNo+"------"+salary);
		}
	}	
	
	//---------------------------------------------------------------------------------------------------
	class user
	{
	public static void main(String[] args)	
	{
		Organization o=new Organization(001,"Sagarika");
		Employee e=new Employee(987654321,340000);	
	}
	}
    
	
	


