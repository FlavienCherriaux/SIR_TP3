package TP3.maven.archetype.quickstart;

import java.util.ArrayList;
import java.util.Collection;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

@Entity
public class Article {
	@Id
	private ObjectId id;
	private String name;
	private int stars;
	@Reference
	private Collection<Person> buyers;
	
	public Article() {
		super();
		id = new ObjectId();
		buyers = new ArrayList<Person>();
	}
	
	public Article(String name, int stars) {
		this();
		this.name = name;
		this.stars = stars;
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
	
	public int getStars() {
		return stars;
	}
	
	public void setStars(int stars) {
		this.stars = stars;
	}

	public Collection<Person> getBuyers() {
		return buyers;
	}

	public void setBuyers(Collection<Person> buyers) {
		this.buyers = buyers;
	}

	public boolean addBuyer(Person e) {
		return buyers.add(e);
	}
	
	@Override
	public String toString() {
		return this.name + ", " + Integer.toString(this.stars) + " étoile" + (stars > 1 ? "s" : "");
	}
}
