package com.intern.jerseyrest;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.hibernate.Session;

import com.intern.util.HibernateUtil;

@Path("/update/{id}")
public class StudentResourceUpdate 
{
	@PUT
	public void editStudent(@PathParam("id") int stid)
	{
		Session session= HibernateUtil.getSessionFactory().openSession();
		Student ss= session.get(Student.class, stid);
		
		session.update(ss);
		
		
	}
}
