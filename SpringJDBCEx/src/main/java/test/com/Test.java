package test.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		EmployeeDAO da = (EmployeeDAO) ctx.getBean("edao");
//		int status = da.saveEmployee(new Employee(102, "Balaji", "MPL1", 80000));
//		System.out.println("status");
		
		int status = da.updateEmployee(new Employee(101, "prasad", "MPL1",50000));
		System.out.println("status");
		
//		Employee e=new Employee();
//		e.setId(101);
//		int status=da.deleteEmployee(e);
//		System.out.println(status);
	}

}
