

import java.util.logging.Level;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import domain.Order;
import domain.Product;
import domain.User;
import DataAccessObject.OrderDAO;
import DataAccessObject.ProductDAO;
import DataAccessObject.UserDAO;
import Sandbox.CRUD;

public class Main {
	
	public static void main(String[] args){
		java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);

//		User user = new User();
//		user.setEmail("Rubatharisan");
//		user.setUsername("Rubas");
//		
//		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
//		Session session = sessionFactory.openSession();
//		
//		try{
//			session.save(user);
//			session.beginTransaction();
//			session.getTransaction().commit();
//			
//		} catch (Exception exp){
//			session.getTransaction().rollback();
//		} finally {
//			session.close();
//			sessionFactory.close();
//		}
//		
////		// Read
////		User myuser = (User) session.load(User.class, 11);
////		System.out.println(myuser.getEmail());
//		
//		System.out.println("Done?");

//		User hi = new User();
//		hi.setUsername("Hi");
//		dao.addUser(hi);
//		
//		UserDAO dao = new UserDAO();
//		User k = new User();
//		k.setEmail("Rubatharisan@gmail.com");
//		k.setUsername("Rubas");
//		dao.addUser(k);
//		System.out.println("Added " + k.getUsername());
//		if(!dao.getAllUsers().isEmpty()){
//			for (User iter : dao.getAllUsers()) {
//	            System.out.println(iter.getUsername());
//	            dao.deleteUser(iter.getId());
//	            System.out.println("Deleted " + iter.getId());
//	        }
//		} else {
//			System.out.println("List empty");
//		}
		
//		CRUD action = new CRUD();
//		
//		action.create("Rubas", "Rubaatharisan@gmail.com");
//		action.create("kk", "aad");
//		action.delete(49);
//		
//		User xo = new User();
//		xo.setEmail("Rubas");
//		
//		OrderDAO orderDao = new OrderDAO();
//		Order one = new Order();
//		orderDao.addOrder(one);
		
		ProductDAO productDAO = new ProductDAO();
//		System.out.println();
//		
//		for (Product iter : productDAO.getAllProducts()) {
//			System.out.println(iter.getName());
//		
//		}
//		

		Order tmpOrder = new Order();
		OrderDAO dao1 = new OrderDAO();
//		tmpOrder.setProduct(6);
//		tmpOrder.setQuantity(5);
//		dao1.addOrder(tmpOrder);
//		
//		for(int i = 0; i<10; i++){
//			System.out.println("Hello");
//			tmpOrder.setProduct(6);
//			tmpOrder.setQuantity(i);
//			dao1.addOrder(tmpOrder);
//			System.out.println("Added");
//
//		}
//		
//		tmpOrder.setQuantity(4);
//		tmpOrder.setProduct(ohMy.getName());
//		dao1.addOrder(tmpOrder);
//		


		Product bananer = productDAO.getProductById(10);
		bananer.setName("Bananer");
		productDAO.updateProduct(bananer);
	}
}
