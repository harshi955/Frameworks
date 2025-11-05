package test.com;

import java.util.List;

public class Employee {
private String name;
private String employeeID;
private String department;
private List<String> address;
public Employee(String name, String employeeID, String department, List<String> address) {
	
	this.name = name;
	this.employeeID = employeeID;
	this.department = department;
	this.address = address;
}
public String getName() {
	return name;
}
public String getEmployeeID() {
	return employeeID;
}
public String getDepartment() {
	return department;
}
public List<String> getAddress() {
	return address;
}
public void setName(String name) {
	this.name = name;
}
public void setEmployeeID(String employeeID) {
	this.employeeID = employeeID;
}
public void setDepartment(String department) {
	this.department = department;
}
public void setAddress(List<String> address) {
	this.address = address;
}
public void disply() {
	System.out.println("Name :"+getName()+"Employee ID :"+getEmployeeID()+"Department :"+getDepartment()+"Address"+getAddress());
}

}
