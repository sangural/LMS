package lib_man;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Student {
@Id
private int id;
private String password;
private String name;
private int phone;
private String email;
private String course;
private int quota;
//@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
//@JoinColumn(name="student_id",referencedColumnName="id")
//private List <Book> issued=new ArrayList<Book>();

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}/*
public Collection<Book> getIssued() {
	return issued;
}
public void setIssued(Collection<Book> issued) {
	this.issued = issued;
}

@Override
public String toString() {
	return "Student [id=" + id + ", password=" + password + ", name=" + name + ", phone=" + phone + ", email=" + email
			+ ", course=" + course + ", issued=" + issued + "]";
}*/
public int getQuota() {
	return quota;
}
public void setQuota(int quota) {
	this.quota = quota;
}
}
