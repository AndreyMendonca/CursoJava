package entities;

import java.util.Date;

public class Client {
	private String name;
	private String email;
	private Date bithDate;
	
	public Client() {
	}

	public Client(String name, String email, Date bithDate) {
		this.name = name;
		this.email = email;
		this.bithDate = bithDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBithDate() {
		return bithDate;
	}

	public void setBithDate(Date bithDate) {
		this.bithDate = bithDate;
	}
}
