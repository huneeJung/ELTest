package hello;

public class HelloBean implements java.io.Serializable{
	
	public static final long serialVersionUID = 2312314131432412L;
	
	private String str;
	
	public HelloBean() {
		
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
}