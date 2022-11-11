package manager.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import manager.entity.Order;

public class OrderRowMapper implements RowMapper<Order>{
	
	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		Order book=new Order();
		book.setPrime(rs.getInt(1));
		book.setUser(rs.getString(2));
		book.setId(rs.getString(3));
		book.setName(rs.getString(4));
		book.setAuthor(rs.getString(5));
		book.setPrice(rs.getString(6));
		book.setQuantity(rs.getString(7));
		return book;
	}

}
