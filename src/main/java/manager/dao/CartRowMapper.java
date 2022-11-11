package manager.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import manager.entity.Cart;

import org.springframework.jdbc.core.RowMapper;

public class CartRowMapper implements RowMapper<Cart> {
	
	public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cart book=new Cart();
		book.setId(rs.getString(1));
		book.setName(rs.getString(2));
		book.setAuthor(rs.getString(3));
		book.setPrice(rs.getString(4));
		book.setSearched(rs.getInt(5));
		return book;
	}

}
