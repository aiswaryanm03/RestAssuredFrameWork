package POJOforSerialixationAndDeserializtion;

public class Spouse {
	String name;
	String eid;
	int sal;
	int phno;
	public Spouse(String name, String eid, int sal,int phno) {
		super();
		this.name = name;
		this.eid = eid;
		this.sal = sal;
		this.phno=phno;
		
	}
	public Spouse()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	

}
