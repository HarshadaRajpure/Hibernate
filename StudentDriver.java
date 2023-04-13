package com.prc.student.info;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {
	public static void main(String[] args) {
		Student student=new Student(1,"harshada","pune");
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("harshada");
		EntityManager entityManager=factory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		entityManager.find(Student.class,2);
		}

}
