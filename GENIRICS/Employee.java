

import java.util.HashSet;
import java.util.Set;

public class Employee {

	private String empName;
	private String department;
	private int salary;
	private int empId;

	public Employee(int empId, String empName, int salary, String department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.department = department;
		
	}
	public final void setEmpName(String empName) {
	     this.empName = empName;
	}
	public final int getsalary() {
		return salary;
	}
  public final void setsalary(int salary) {
	   this.salary = salary;
  }
      public final String getdepartment() {
   	   return department;
      }
      
      public final void setdepartment(String department) {
   	   this.department = department;
      }
      
      public String toString() {
   	   return "Employee [empId=" + empId +", empName=" + empName + ", salary="+ salary +", department= "+ department +"]";
      }
      
      public int hashCode() {
   	   return this.empId;
      }
      
      public boolean equals(Object obj) {
   	   Employee employee = (Employee) obj;
   	   
   	   if (employee.empId == this.empId) {
   	       employee.setEmpName(this.empName);
   	       employee.setsalary(this.salary);
   	       employee.setdepartment(this.department);
   	       
       }
          
              return true;
     }
       {
      
        }
           
      public static void main(String[] args) {
    	  
   	   Set<Employee> employees = new HashSet<>();
   	   
   	   employees.add(new Employee(1,"abbas",500000,"cse"));
   	   
   	   employees.add(new Employee(2, "kareem",500000,"cse"));
   	   
   	   
   	   System.out.println("employees:" +employees);
   	   
      }
   }


    
