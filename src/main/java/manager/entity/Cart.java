package manager.entity;

import javax.persistence.Entity;

@Entity
public class Cart {
	private int prime;
	private String id;
	private String name;
	private String author;
	private String price;
	private int searched;
	
	public Cart() {
		
	}
	public Cart(int prime,String id, String name, String author, String price, int searched) {
		super();
		this.prime=prime;
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.searched = searched;
	}
	
	
	public int getPrime() {
		return prime;
	}


	public void setPrime(int prime) {
		this.prime = prime;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}


	public int getSearched() {
		return searched;
	}

	public void setSearched(int searched) {
		this.searched = searched;
	}
	
	
}
