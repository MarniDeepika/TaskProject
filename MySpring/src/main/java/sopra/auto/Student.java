package sopra.auto;

import org.springframework.beans.factory.annotation.Autowired;

public class Student 
{
@Autowired	
private Address Address;

public Address getAddress() {
	return Address;
}

public void setAddress(Address address) {
	Address = address;
}

@Override
public String toString() {
	return "Student [Address=" + Address + "]";
}

}
