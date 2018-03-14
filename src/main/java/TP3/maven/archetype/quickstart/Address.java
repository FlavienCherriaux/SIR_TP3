package TP3.maven.archetype.quickstart;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity
public class Address {
	@Id
	private ObjectId id;
	private String street;
	private String postCode;
	private String city;
	private String country;
	
	public Address() {
		super();
		id = new ObjectId();
	}

	public Address(String street, String postCode, String city, String country) {
		this();
		this.street = street;
		this.postCode = postCode;
		this.city = city;
		this.country = country;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return this.street + "\n" + this.postCode + " " + this.city + "\n" + this.country;
	}
}
