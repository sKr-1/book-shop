package manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import manager.dao.BookDao;
import manager.entity.Book;
import manager.entity.Cart;

@Service
public class BookService {
	
	@Autowired
	private BookDao bookDao;
	
	//for creating user instance in database
	public boolean saveBook(Book book) {
		if(noNullValue(book)) {
			return bookDao.createBook(book);
		}
		return false;
	}
	public boolean noNullValue(Book book) {
		if(book.getId().equals("")||book.getName().equals("")||book.getAuthor().equals("")||book.getQuantity().equals("")||book.getPrice().equals("")) {
			return false;
		}
		else if(!book.getQuantity().equals("")||!book.getPrice().equals("")) {
			try {
				Integer.parseInt(book.getPrice());
				Integer.parseInt(book.getQuantity());
			}
			catch(NumberFormatException e) { 
		        return false; 
		    } 
		}
		return true;
	}
	
	public void updateBook(Book book) {
		if(noNullValue(book)) {
			bookDao.updateBook(book);
		}
	}
	//fetch all books
	public List<Book> fetchBooks() {
		return bookDao.getBooks();
	}
	
	public List<Cart> fetchPopular() {
		return bookDao.getPopular();
	}
	
	public Book fetchBook(String id) {
		return bookDao.getBook(id);
	}
	
	public void removeBook(String id) {
		bookDao.deleteBook(id);
	}
	


}
