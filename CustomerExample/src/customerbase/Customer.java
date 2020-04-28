package customerbase;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;



public class Customer implements Comparable<Customer>{
	private int id;
	private String name;
	private String email;
	private LocalDate dob;
	
	
	//private int defaultidlen = 3;
	// constructor to recive name, email and dob
	public Customer(int id ,String name,String email, LocalDate dob) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		
		//this.id = randomId(defaultidlen);
	}

    

	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int compareTo(Customer o) {
		return id - o.id;
	}
	


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + "]";
	}
	
	 @Override
	    public int hashCode() {
	        return Objects.hash(id);
	    }

	 
	
	
	
	
	
//	public String randomId(int length) {
//		String idSet = "123456789";
//		char[] id = new char[length];
//		
//		for (int i = 0;i<length;i++) {
//			int rand = (int) (Math.random() * idSet.length());
//			id[i] = idSet.charAt(rand);
//		}
//		return new String(id);
//		
//	}

}
	
	
	
	
