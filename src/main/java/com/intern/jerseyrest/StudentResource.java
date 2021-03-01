package com.intern.jerseyrest;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;

import com.intern.util.HibernateUtil;

@Path("students")
public class StudentResource
{
	
	//GET METHOD TO FETECH ALL RECORDS
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> stdres()
	{
		System.out.println("Resourse called");
		Session session= HibernateUtil.getSessionFactory().openSession();
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
	}
}
