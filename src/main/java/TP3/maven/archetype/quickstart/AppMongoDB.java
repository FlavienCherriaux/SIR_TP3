package TP3.maven.archetype.quickstart;

import java.net.UnknownHostException;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class AppMongoDB 
{
	public static void main( String[] args ) throws UnknownHostException
	{
		Morphia morphia = new Morphia();
		MongoClient mongo = new MongoClient();
		morphia.map(Person.class).map(Address.class);
		Datastore ds = morphia.createDatastore(mongo, "my_database");

		Person haddock = new Person("Capitaine Haddock");
		Address address1 = new Address("Château de Moulinsart", "12345", "Moulinsart", "Belgique");
		haddock.addAddress(address1);
		Person lebelge = new Person("Le belge");
		Address address2 = new Address("Rue des frites", "10000", "Bruxelles", "Belgique");
		lebelge.addAddress(address1);
		lebelge.addAddress(address2);
		
		Article pipe = new Article("Pipe", 4);
		Article pull = new Article();
		pull.setName("Pull vert");
		
		haddock.buyArticle(pipe);
		pull.addBuyer(lebelge);
		
		ds.save(pipe);
		ds.save(pull);
		ds.save(address1);
		ds.save(address2);
		ds.save(haddock);
		ds.save(lebelge);
		
		System.out.println("Personnes :");
		for (Person e : ds.find(Person.class)) {
			System.err.println(e);
		}
		
		System.out.println("Adresses :");
		for (Address e : ds.find(Address.class)) {
			System.err.println(e);
		}
		
		System.out.println("Articles :");
		for (Article e : ds.find(Article.class)) {
			System.err.println(e);
		}
	}
}
