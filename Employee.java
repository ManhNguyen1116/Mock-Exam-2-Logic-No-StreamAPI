package MockQuestions2Array;

public class Employee {
	private String name;
	private int id;
	private String address;
	private String email;
	private long phoneNumber;
	public Employee(String name, int id, String address, String email, long phoneNumber) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
