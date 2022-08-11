package POJOforSerialixationAndDeserializtion;

public class EmployeeDetails {
	//step 1:Declare all variables as global
	String ename;
	String eId;
	int phone;
	String email;
	String adress;
	//step2: create a constructor to initialize variables
	public EmployeeDetails(String ename,String eId,int phone,String email,String adress)
	{
		this.ename=ename;
		this.eId=eId;
		this.phone=phone;
		this.email=email;
		this.adress=adress;
	}
	//create a contructor to reinitialize in desearlization
	public EmployeeDetails()
	{
		
	}
	//step 3: use getters and setters

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
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

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
