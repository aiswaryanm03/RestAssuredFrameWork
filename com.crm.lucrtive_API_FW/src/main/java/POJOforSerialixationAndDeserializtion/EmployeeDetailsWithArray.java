package POJOforSerialixationAndDeserializtion;

public class EmployeeDetailsWithArray {
	String name;
	String id;
	int[]number;
	String []email;
	String adress;
	public EmployeeDetailsWithArray(String name, String id, int[] number, String[] email, String adress) {
		super();
		this.name = name;
		this.id = id;
		this.number = number;
		this.email = email;
		this.adress = adress;
	}
	public EmployeeDetailsWithArray()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int[] getNumber() {
		return number;
	}
	public void setNumber(int[] number) {
		this.number = number;
	}
	public String[] getEmail() {
		return email;
	}
	public void setEmail(String[] email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	

}
