package POJOforSerialixationAndDeserializtion;

public class EmployeeDetailsWithObject {
	String ename;
	String eid;
	String adress;
	Spouse s;
	String [] email;
	Spouse2 s1;
	public EmployeeDetailsWithObject(String ename, String eid, String adress, Spouse s,Spouse2 s1, String[] email) {

		this.ename = ename;
		this.eid = eid;
		this.adress = adress;
		this.s=s;
		this.email = email;
		this.s1=s1;
		
	}

	public Spouse2 getS1() {
		return s1;
	}

	public void setS1(Spouse2 s1) {
		this.s1 =s1;
	}

	public Spouse getS() {
		return s;
	}

	public void setS(Spouse s) {
		this.s = s;
	}

	public EmployeeDetailsWithObject()
	{
		
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String[] getEmail() {
		return email;
	}
	public void setEmail(String[] email) {
		this.email = email;
	}
	
	

}
