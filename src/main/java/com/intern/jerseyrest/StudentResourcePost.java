package com.intern.jerseyrest;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import org.hibernate.Session;
import com.intern.util.HibernateUtil;

@Path("student")
public class StudentResourcePost 
{
	@POST
	public void addStudent(Student s1)
	{
		Session session= HibernateUtil.getSessionFactory().openSession();
		session.save(s1);
		session.beginTransaction().commit();
		System.out.println("Success");
	}
	
}
