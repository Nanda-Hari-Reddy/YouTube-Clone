package com.jsp.package1;

import javax.p
public class SaveStudent 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.setId(1);
		s1.setAddress("Bangalore");
		s1.setAge(21);
		s1.setName("Nanda");
		EntityManagerFactory emf = Persistence.EntityManagerFactory();
	}

}
