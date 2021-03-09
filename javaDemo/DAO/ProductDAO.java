package javaDemo.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import javaDemo.E_com.Product;
import javaDemo.E_com.User;

public class ProductDAO {
	 Configuration cfg = new Configuration().configure();
     ServiceRegistry register = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
     SessionFactory sf = cfg.buildSessionFactory(register);
     
 public void save(Product product) {
	 Session session = sf.openSession();
     Transaction transaction = session.beginTransaction(); 
     session.save(product);
     transaction.commit();
     session.close();
     }

public List<Product>productlist(){
	 Session session = sf.openSession();
     Transaction transaction = session.beginTransaction(); 
	 List<Product>productlist = new ArrayList<Product>();
	  session.createCriteria(Product.class).list();
	 transaction.commit();
	 session.close();
     return productlist;
     }
}
