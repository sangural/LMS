package lib_man;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
@Id
private int bookid;
private String Book_name;
private String author;
private int quantity;
private int issued;
//@ManyToOne

public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}

public String getBook_name() {
	return Book_name;
}
public void setBook_name(String book_name) {
	Book_name = book_name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getIssued() {
	return issued;
}
public void setIssued(int issued) {
	this.issued = issued;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

}
