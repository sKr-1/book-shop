package manager.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import manager.entity.Book;

public class BookRowMapper implements RowMapper<Book>{
	
	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book=new Book();
		book.setId(rs.getString(1));
		book.setName(rs.getString(2));
		book.setAuthor(rs.getString(3));
		book.setPrice(rs.getString(4));
		book.setQuantity(rs.getString(5));
		return book;
	}

}
