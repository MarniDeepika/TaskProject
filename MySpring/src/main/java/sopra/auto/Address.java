package sopra.auto;

public class Address 
{
private String City;
private String location;
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "Address [City=" + City + ", location=" + location + "]";
}

}
