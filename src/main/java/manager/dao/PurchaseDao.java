package manager.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import manager.entity.Book;
import manager.entity.Cart;
import manager.entity.Order;
import manager.service.BookService;

@Component
public class PurchaseDao {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private JdbcTemplate jdbc;
	
	public void addCart(String id,String user,int q) {
		Book book=bookService.fetchBook(id);
		System.out.println(book);
		 
		String query="insert into cart(user,id,name,author,price,quantity) values(?,?,?,?,?,?)";
		if(q<=Integer.parseInt(book.getQuantity())){
			jdbc.update(query,user,book.getId(),book.getName(),book.getAuthor(),book.getPrice(),book.getQuantity());
			String sql="insert into freq values(?,?,?,?,?)";
			book.setQuantity((Integer.parseInt(book.getQuantity())-q)+"");
			bookService.updateBook(book);
			Cart c=checkForBook(id);
			if(c==null) {
				jdbc.update(sql,book.getId(),book.getName(),book.getAuthor(),book.getPrice(),1);
			}
			else {
				String que="UPDATE freq SET searched ="+"'"+(c.getSearched()+1)+"'"+" WHERE id="+"'"+id+"'";
				jdbc.execute(que);
			}
		}
	}
	//check before creating book if it is not present already 
	public Cart checkForBook(String id) {
		String sql = "SELECT * FROM freq WHERE id= "+ "'"+id+"'";
		try {
			Cart b=jdbc.queryForObject(sql, BeanPropertyRowMapper.newInstance(Cart.class));
			return b;
		}
		catch (EmptyResultDataAccessException e) {
		    return null;
		}
	}
	
	public List<Order> getOrders(){
		String sql = "Select * From cart";
		try {
			OrderRowMapper brm=new OrderRowMapper();
			List<Order> orders=jdbc.query(sql, brm);
			return orders;
		}
		catch (EmptyResultDataAccessException e) {
		    return null;
		}
	}
}
