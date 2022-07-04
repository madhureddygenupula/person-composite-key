package com.ty.person;

import java.util.List;


public class PersonDriver {
	public static void main(String[] args) {
//	PersonId personId=new PersonId();
//	personId.setEmail("vishnu@gmail.com");
//	personId.setPhone(630599l);
//		
//		Person person=new Person();
//		person.setName("vishnu");
//		person.setDob("15/10/2003");
//		person.setGender("Female");
//		person.setPersonId(personId);
//	
//	PersonDao dao=new PersonDao();
//	dao.savePerson(person);
		
	   /* PersonDao dao=new PersonDao();
		List<Person> persons = dao.getAllPerson();
		for(Person person:persons) {
		System.out.println("Name : "+person.getName());
			System.out.println("Email : "+person.getPersonId().getEmail());
		}
		*/
		PersonId personId=new PersonId();
		personId.setEmail("madhu@gmail.com");
		personId.setPhone(701378l);
		PersonDao dao=new PersonDao();
		Person person= dao.getPersonById(personId);
		System.out.println("Name : "+person.getName());
		System.out.println("Gender : "+person.getGender());
		System.out.println("DOB : "+person.getDob());
		System.out.println("Email : "+person.getPersonId().getEmail());
		System.out.println("Phone : "+person.getPersonId().getPhone());
	}
}