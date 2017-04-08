package in.javapandit.webapp;

import org.hibernate.Session;

import in.javapandit.webapp.model.Publisher;
import in.javapandit.webapp.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        
        Publisher publisher = new Publisher();
        publisher.setPublisherName("Apress");
        
        session.save(publisher);
        session.getTransaction().commit();
        
        System.out.println( "Publisher ID : " + publisher.getPublisherID() );
    }
}
