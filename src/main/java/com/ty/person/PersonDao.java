package com.ty.person;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class PersonDao {
	private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	private EntityManager entityManager=entityManagerFactory.createEntityManager();
	private EntityTransaction entityTransaction=entityManager.getTransaction();
	public void savePerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
	public List<Person> getAllPerson(){
		Query query=entityManager.createQuery("select p from Person p");
		return query.getResultList();
	}
	public Person getPersonById(PersonId id) {
		return entityManager.find(Person.class, id);
	}
	public void updatePerson(Person person) {
		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();
	}
	public void deletePerson(PersonId id) {
		entityTransaction.begin();
		entityManager.remove(id);
		entityTransaction.commit();
	}
}