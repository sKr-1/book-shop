package manager.entity;

import javax.persistence.Entity;


@Entity
public class Book {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String name;
	private String author;
	private String price;
	private String quantity;
	
	public Book() {
		
	}
	
	public Book(String id, String name, String author, String price,String quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.quantity=quantity;
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
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	
}
