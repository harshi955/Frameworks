package test.com;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
public int saveEmployee(Employee e ) {
	String query ="insert into emp values('"+e.getId()+"','"+e.getName()+"','"+e.getCity()+"','"+e.getSalary()+"')";
	return jdbcTemplate.update(query);
}

public int updateEmployee(Employee e) {
	String query1="update emp set name='"+e.getName()+"','"+e.getCity()+"','"+e.getSalary()+"' where id='"+e.getId()+"' ";
	return jdbcTemplate.update(query1);
}

public int deleteEmployee(Employee e) {
	String query ="delete from emp where id='"+e.getId()+"' ";
	return jdbcTemplate.update(query);
}
}
