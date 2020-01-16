package com.deloitte.secondmvn.hibthird.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Person
{
	@Id
	String name;
	int age;
	String address;
	@OneToOne
	@JoinColumn(name="aid")
	AadharCard acard;
	public Person() {}
	public Person(String name, int age, String address, AadharCard acard) 
	{
	
		this.name = name;
		this.age = age;
		this.address = address;
		this.acard = acard;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public AadharCard getAcard() {
		return acard;
	}
	public void setAcard(AadharCard acard) {
		this.acard = acard;
	}
}
