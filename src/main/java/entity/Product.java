package entity;



import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class Product {


	private int productId;
	
	private String productName;
	
	private String productCompany;
	
	private String productOs;
	
	
	private User userm;
	public Product() {
		
	}
	
	public Product(String productName, String productCompany, String productOs) {
		this.productName = productName;
		this.productCompany = productCompany;
		this.productOs = productOs;
	}

	
	
	
	public Product( String productName, String productCompany, String productOs, User user) {
		this.productName = productName;
		this.productCompany = productCompany;
		this.productOs = productOs;
		this.userm = user;
	}




	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCompany() {
		return productCompany;
	}

	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}

	public String getProductOs() {
		return productOs;
	}

	public void setProductOs(String productOs) {
		this.productOs = productOs;
	}


	public User getUserm() {
		return userm;
	}

	public void setUserm(User userm) {
		this.userm = userm;
	}
		
	
}
