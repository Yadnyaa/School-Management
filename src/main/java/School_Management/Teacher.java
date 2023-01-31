package School_Management;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Teacher {
	@Id
	private int id;
	private String name;
	private String subject;
	private int exp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	

}
