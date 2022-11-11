package manager.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import manager.entity.Book;
import manager.entity.Cart;

@Component
public class BookDao {
	@Autowired
	private JdbcTemplate jdbc;
	
	public boolean createBook(Book book) {
		String query="insert into book values(?,?,?,?,?)";
		if(checkForBook(book.getId())==null) {
			int x=jdbc.update(query,book.getId(),book.getName(),book.getAuthor(),book.getPrice(),book.getQuantity());
			return x>0?true:false;
		}
		else {
			return false;
		}
	}
	//check before creating book if it is not present already 
	public Book checkForBook(String id) {
		String sql = "SELECT * FROM book WHERE id= "+ "'"+id+"'";
		try {
			Book b=jdbc.queryForObject(sql, BeanPropertyRowMapper.newInstance(Book.class));
			return b;
		}
		catch (EmptyResultDataAccessException e) {
		    return null;
		}
	}
	
	public void updateBook(Book book) {
		String sql="UPDATE book SET name ="+"'"+book.getName()+"'"+",author ="+"'"+book.getAuthor()+"'"+",price ="+"'"+book.getPrice()+"'"+", quantity ="+"'"+book.getQuantity()+"'"+" WHERE id="+"'"+book.getId()+"'";
		jdbc.execute(sql);
	}
	
	public List<Book> getBooks(){
		String sql = "Select * From book";
		try {
			BookRowMapper brm=new BookRowMapper();
			List<Book> books=jdbc.query(sql, brm);
			return books;
		}
		catch (EmptyResultDataAccessException e) {
		    return null;
		}
	}
	
	public List<Cart> getPopular(){
		String sql = "Select * From freq";
		try {
			CartRowMapper brm=new CartRowMapper();
			List<Cart> books=jdbc.query(sql, brm);
			return books;
		}
		catch (EmptyResultDataAccessException e) {
		    return null;
		}
	}
	
	public void deleteBook(String id) {
		String sql = "DELETE FROM book WHERE id= "+ "'"+id+"'";
		jdbc.execute(sql);
	}
	
	public Book getBook(String id) {
		String sql = "Select * FROM book WHERE id=?";
		BookRowMapper brm=new BookRowMapper();
		try {
			Book book=jdbc.queryForObject(sql,brm,id);
			return book;
		}
		catch (EmptyResultDataAccessException e) {
			System.out.println("lol");
		    return null;
		}
	}
	
	
}
