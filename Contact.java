// 주소록프로그램

/*
	class:	Contact
	attr:	-name
			-phone
			-email
*/

import java.util.*;

public class Contact implements Comparable<Contact>{
	private String name;
	private String phone;
	private String email;

	public Contact() {};
	public Contact(String _name, String _phone, String _email) {
		this.name = _name;
		this.phone = _phone;
		this.email = _email;
	}

	public String getName() {
		return this.name;
	}
	public String getPhone() {
		return this.phone;
	}
	public String getEmail() {
		return this.email;
	}

	public void setName(String _name) {
		this.name = _name;
	}
	public void setPhone(String _phone) {
		this.phone = _phone;
	}
	public void setEmail(String _email) {
		this.email = _email;
	}

	public String toString() {
		return name +"\t"+ phone+ "\t"+ email;
	}
	
	// 이름으로 오름차순 정렬
	public int compareTo(Contact contact) {
		return this.getName().compareTo(contact.getName());
	}
}