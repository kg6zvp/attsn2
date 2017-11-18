package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPATest {
    private static EntityManager em;
    public static void main(String[] args) {
    		EntityManagerFactory emf = Persistence
    				.createEntityManagerFactory("scanData");
    		em = emf.createEntityManager();
    		
    		createScan("now", "test", "test", "test", 9.999, 8.888, 6.5 , 5.5 , 4.5 , 5, 6, 7, "Mac", "jsolum", "notes");
    		createScan("now", "test", "test", "test", 9.999, 8.888, 6.5 , 5.5 , 4.5 , 5, 6, 7, "Linux", "jochs", "notes");
    		createScan("now", "test", "test", "test", 9.999, 8.888, 6.5 , 5.5 , 4.5 , 5, 6, 7, "PC", "carmacost", "notes");
    }
    
    private static void createScan(String timestamp, String wapName, String building, String room, Double upload, Double download, Double ping, Double lat, Double lon, Integer channel, Integer RSSI, Integer util, String device, String reporter, String notes ) {
    		em.getTransaction().begin();
    		Scan scan = new Scan(timestamp, wapName, building, room, upload, download, ping, lat, lon, channel, RSSI, util, device, reporter, notes);
    		em.persist(scan);
    		em.getTransaction().commit();
    	
    }
    
    
    
/* 
 
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("EmployeePU");
        em = emf.createEntityManager();
 
        createEmployee(1, "Ravi", "Raj", "Textile");
        createEmployee(2, "Amit", "Raj", "IT");
        createEmployee(3, "Nitish", "Kumar", "Marketing");
 
    }
 
    private static void createEmployee(int id, String firstName,
            String lastName, String dept) {
        em.getTransaction().begin();
        emp = new Employee(id, firstName, lastName, dept);
        em.persist(emp);
        em.getTransaction().commit();
    }
    */
}