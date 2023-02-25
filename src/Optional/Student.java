package Optional;

import java.util.Optional;

public class Student {
private int id;
private String name;
private Optional<String> email;
private Optional<String> phone;
public Student(int id, String name, Optional<String> email, Optional<String> phone) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phone = phone;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public Optional<String> getEmail() {
	return email;
}
public Optional<String> getPhone() {
	return phone;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setEmail(Optional<String> email) {
	this.email = email;
}
public void setPhone(Optional<String> phone) {
	this.phone = phone;
}

}
