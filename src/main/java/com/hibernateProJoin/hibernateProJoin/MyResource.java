
package com.hibernateProJoin.hibernateProJoin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import entity.*;


@Path("/myresource")
public class MyResource {
    
//    @GET 
//    @Produces("text/plain")
//    @Path("getuser")
//    public String getIt() {
//        return "Hi there!";
//    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("getpro")
    public Product getit() {
    	
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
				
		try {

			session.beginTransaction();
						
			Product pro = (Product) session.get(Product.class,13);
			
//			session.getTransaction().commit();
			
			return pro;
			
		} catch (Exception e) {
		
			session.clear();

			e.printStackTrace();
			return null;
		}
		
		
    }
    
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("getuser")
    public User getUser() {
    	
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
				
		try {

			session.beginTransaction();
						
			User user = (User) session.get(User.class,13);
			
//			session.getTransaction().commit();
			
			return user;
			
		} catch (Exception e) {
		
			session.clear();

			e.printStackTrace();
			return null;
		}
		
		
    }
    
    
}



