package test.com;

public class Student {
	private int id;
	private String name;
	private String city;
	private Subject subject;
	
	
	public Student(int id, String name, String city, Subject subject) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.subject = subject;
	}


	public void chat() {
		System.out.println("My ID is :"+id);
		subject.write();
	}
	
}
