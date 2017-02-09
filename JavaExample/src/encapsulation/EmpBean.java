package encapsulation;

public class EmpBean {
	
	private int eid;
	private String ename;
	
	
	//Setter (used to set the values  to properties)
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	//geeter (used to get the values from properties)
	
	public int getEid() {
		return eid;
	}
	
	public String getEname() {
		return ename;
	}
	
	

}
