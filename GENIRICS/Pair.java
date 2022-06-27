

import java.security.KeyPair;
import java.util.Date;
import java.util.HashMap;

public class Pair {
	private Date dt;
	private String key;
	private String value;
	
	public Pair(String key,String value) {
		super();
		this.setkey1(key);
		this.value = value;
	}
	
	public Pair(String key,Date dt) {
		super();
		this.key = key;
		this.dt = dt;
	}
	
	public String getkey() {
		return key;
	}
	
	public void setkey1(String key) {
		this.key = key;
	}
	
	public void setkey(String key) {
	    this.key = key;
	}
	public String getvalue() {
		return value;
	}
	public void setvalue(String value) {
		this.value = value;
	}
	public Date getDate() {
		return dt;
	}
	public void setDate(Date dt) {
		this.dt = dt;
	}
	public static void main(String[] args) {
		Pair p = new Pair("1","Hello");
		HashMap<String,String> h = new HashMap<String,String>();
		h.put(p.getkey(), p.getvalue());
		System.out.println("object:"+h);
		Pair p1 = new Pair("Today is",new Date());
		HashMap<String,Date> h1 =new HashMap<String,Date>();
		h1.put(p1.getkey(), p1.getDate());
		System.out.println("Date:" +h1);
	}
}
