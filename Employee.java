package Anudip;

public class Employee {
	int empId;
	String empName;
	int salary;
	
	{
		System.out.println("Employee object created");
	}
  {
		
	}
	
	void empInfo() {
		System.out.println("Employee Details:" +empId+
				"\n Name:"+empName+"\n Salary:"+salary);
	}

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empId=1706;
		emp.empName="Ashok";
		emp.salary=50000;
		emp.empInfo();
	}

}

	
