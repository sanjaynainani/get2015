
/**
 * This is a sub class of Person super class
 * used for get and set methods of the Id, name , department
 * @author Sanjay Nainani
 *
 */
public class Employee extends Person {
	
	private int employeeId;
	private String department;
	public Employee(int uid, String name, int employeeId, String department) 
	{
		super(uid, name);
		this.employeeId = employeeId;
		this.department = department;
	}
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	public String toString()
	{
		return super.toString()+", EmployeeId: "+employeeId+", Department: "+department;
	}

}
