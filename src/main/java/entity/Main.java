package entity;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] arg) {
		
	
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
				
		try {

			session.beginTransaction();
			
			User user = new User("abdalluh" , "dawoud" , "abdalluh@gmail.com");
			
						
			Product pro1 = new Product("nokia13" , "Nokia" , "android" , user);
			Product pro2 = new Product("nokia14" , "Nokia" , "android" , user);
			Product pro3 = new Product("nokia15" , "Nokia" , "android" , user);	

		
			Set<Product> products = new HashSet<Product>();
			
			products.add(pro1);
			products.add(pro2);
			products.add(pro3);
			
			user.setProducts(products);
			
			int idu = (Integer)session.save(user);
			
			
			
			System.out.println(idu);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			session.close();
			e.printStackTrace();
		}
		
	}
	

}
