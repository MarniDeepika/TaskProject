package com.sopra.spring;

public class Person 
{
private int personId;
private String personName;
public Person(int personId, String personName) {
	super();
	this.personId = personId;
	this.personName = personName;
}
public Person() {
	super();
	
}
@Override
public String toString() {
	return "Person [personId=" + personId + ", personName=" + personName + "]";
}

}
