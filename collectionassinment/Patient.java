package com.techment.collectionassinment;

//////QUESTION NO. 4.1
//////QUESTION NO. 4.1
//////QUESTION NO. 4.1
//////QUESTION NO. 4.1


public class Patient  implements Comparable<Patient>{
	
	private int patientId;
	private String name;
	private int age;
	
	
	public Patient(int patientId, String name, int age) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		
		
		
	}


	public int getPatientId() {
		return patientId;
	}


	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Patient o) {
		
		if (age<o.age)
		// TODO Auto-generated method stub
		return 1;
		else if(age == o.age)
			return 0;
		else 
			return -1;
	}
	
	

	
	

}
