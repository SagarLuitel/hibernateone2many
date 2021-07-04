package comm.sap.DemoProject;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	
	static SessionFactory factory;
	static {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		MetadataSources metadatasources = new MetadataSources(registry);
		Metadata metadata = metadatasources.buildMetadata();
		factory = metadata.buildSessionFactory();
		
	}
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
