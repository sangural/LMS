package lib_man;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class IssueDetails {
@Id
private int Libbookno;
private int bookid;
private int stdroll;
public int getLibbookno() {
	return Libbookno;
}
public void setLibbookno(int libbookno) {
	Libbookno = libbookno;
}
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public int getStdroll() {
	return stdroll;
}
public void setStdroll(int stdroll) {
	this.stdroll = stdroll;
}

}
