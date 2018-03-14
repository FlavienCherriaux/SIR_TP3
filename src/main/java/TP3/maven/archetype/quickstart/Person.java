package TP3.maven.archetype.quickstart;

import java.util.ArrayList;
import java.util.Collection;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

@Entity
public class Person {
	@Id
	private ObjectId id;
	private String name;
	@Reference
	private Collection<Address> addresses;
	
	public Person() {
		super();
		id = new ObjectId();
		addresses = new ArrayList<Address>();
	}

	public Person(String name) {
		this();
		this.name = name;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Collection<Address> addresses) {
		this.addresses = addresses;
	}

	public boolean addAddress(Address a) {
		return addresses.add(a);
	}
	
	public boolean buyArticle(Article a) {
		return a.addBuyer(this);
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
