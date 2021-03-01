package com.intern.jerseyrest;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Student {

	@Id
	private int student_id;
	private String student_name;
	private String student_dob;
	private String student_doj;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	
	/*
	 * @Override public String toString() { return "Student [student_id=" +
	 * student_id + ", student_name=" + student_name + ", student_dob=" +
	 * student_dob + ", student_doj=" + student_doj + "]";
	 */
	//}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_dob() {
		return student_dob;
	}
	public void setStudent_dob(String student_dob) {
		this.student_dob = student_dob;
	}
	public String getStudent_doj() {
		return student_doj;
	}
	public void setStudent_doj(String student_doj) {
		this.student_doj = student_doj;
	}
	
	
}
