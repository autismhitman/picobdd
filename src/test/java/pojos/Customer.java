package pojos;

public class Customer {
	
	String uname;
	String pwd;
	
	public Customer(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

}
