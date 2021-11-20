package entity;


import java.util.HashSet;
import java.util.Set;


import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement()
public class User  {


	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private Set<Product> products = new HashSet<Product>();
	


	public User() {
		
	}

	public User(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	

	public User( String firstName, String lastName, String email, Set<Product> products) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.products = products;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@XmlTransient 
	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	
	
	
}
