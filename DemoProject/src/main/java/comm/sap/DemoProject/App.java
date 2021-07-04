package comm.sap.DemoProject;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Book book1 = new Book("Java in Sction", "Kathy", 485);
        Book book2 = new Book("Machine Learning", "Vince", 985);
        Book book3 = new Book("learn forever", "Perry", 414);
        
        Set<Book> bookList = new HashSet<>(Arrays.asList(book1,book2,book3));
        Publisher publisher = new Publisher();
        publisher.setPublisherName("McDonalds");
        publisher.setBook(bookList);
        session.save(publisher);
        
       transaction.commit();


        
        session.close();
        
        
        
    }
}
