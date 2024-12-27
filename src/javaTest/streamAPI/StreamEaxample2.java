package javaTest.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {

	String name;
	double salary;
	String city;
	public Employee() {
		super();
	}
	
	public Employee(String name, double salary, String city) {
		super();
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}
	
	
}
public class StreamEaxample2{
	
	public static void main(String args[]) {
		
		List<Employee> empList= new ArrayList<>();
		Employee e1= new Employee("raj",1000,"muzaffarpur");
		Employee e2= new Employee("aditya",20000,"sheohar");
		Employee e3= new Employee("praveen",3000,"delhi");
		Employee e4= new Employee("hariom",4000,"patna");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		System.out.println(empList);
		
		// sort the employee on the basic of salary in ascending order
		List<Employee> list=empList.stream().sorted(Comparator.comparingDouble(e-> e.getSalary())).collect(Collectors.toList());
		System.out.println("ascending "+list);
		
		// sort the employee on the basic of salary in descending order
		List<Employee> list2=empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(list2);
		
		// second max salary
		double  secondMaxSalary=empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList()).get(1).getSalary();
		System.out.println("secondMaxSalary "+secondMaxSalary);
		
		// get max salary employee
		Employee emp=empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList()).get(0);
		System.out.println(emp);
		
		// get max salary of employee
		double maxSalary=empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList()).get(0).getSalary();
		System.out.println("MaxSalary "+maxSalary);
		
		// find all name of employee in list also sort the list
		List<String> nameList= empList.stream().filter(a->!(a.getName().equals("raj")||a.getName().equals("aditya"))).map(e->e.getName()).sorted().collect(Collectors.toList());
		System.out.println("---->"+nameList);
		
		boolean name= empList.stream().filter(a->(a.getName().equals("raj"))).anyMatch(a->(a.getName().equals("raj")));
		System.out.println("---->"+name);
		
		// create the map of name and salary
		Map<String,Double> map= empList.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
		System.out.println(map);
		
		// create the map of name and salary
		Map<String,Employee> map2= empList.stream().collect(Collectors.toMap(Employee::getName, Function.identity()));				
		System.out.println(map2);
		
		// List of Employee name
		List<String> EmpNames=empList.stream().map(e->e.getName()).collect(Collectors.toList());
		System.out.println(EmpNames);
		

		

	}
}