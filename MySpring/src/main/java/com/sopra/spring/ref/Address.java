package com.sopra.spring.ref;

public class Address 
{
private String city;
private String location;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Address [city=" + city + ", location=" + location + "]";
}

}
