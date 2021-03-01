package com.intern.jerseyrest;
import java.util.Iterator;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.hibernate.Session;
import com.intern.util.HibernateUtil;

@Path("/delete/{idd}")
public class StudentResourceDelete
{
	@DELETE
	public List<Student> deleteStudent(@PathParam("idd") int stid)
	{
		Session session= HibernateUtil.getSessionFactory().openSession();
		Student ss= session.get(Student.class, stid);
		System.out.println(ss);
		session.delete(ss);
		session.beginTransaction().commit();
		List<Student> list= session.createQuery("From Student").getResultList();
		Iterator<Student> itr = list.iterator();
		while(itr.hasNext())
		{
			Student t= itr.next();
			System.out.println(t.getStudent_name());
			System.out.println(t.getStudent_id());
			System.out.println(t.getStudent_doj());
			System.out.println(t.getStudent_dob());
			System.out.println("-------------------------------------");
		}
		return list;
		
		
		/*
		 * System.out.println(s_id.getStudent_id()); s_id=session.get(Student.class, 3);
		 * System.out.println(s_id);
		 */
		 
	}
}
