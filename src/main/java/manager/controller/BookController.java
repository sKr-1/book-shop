package manager.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import manager.entity.Book;
import manager.entity.Cart;
import manager.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/addBook")
	public String addBook(Model m) {
		m.addAttribute("title","Add Book");
		return "addBook";
	}
	
	@RequestMapping("/booksList")
	public String bookList(Model m) {
		List<Book> books=bookService.fetchBooks();
		m.addAttribute("title","Book List");
		m.addAttribute("books", books);
		return "bookList";
	}
	
	@RequestMapping("/thresold")
	public String thresoldBookList(Model m) {
		List<Book> data=bookService.fetchBooks();
		List<Book> books=new ArrayList<>();
		for(Book b:data) {
			if(Integer.parseInt(b.getQuantity())<10) {
				books.add(b);
			}
		}
		m.addAttribute("title","Book List");
		m.addAttribute("books", books);
		return "thresold";
	}
	
	@RequestMapping("/popular")
	public String popularBookList(Model m) {
		List<Cart> books=bookService.fetchPopular();
		m.addAttribute("title","Book List");
		m.addAttribute("books", books);
		return "popular";
	}
	
	@RequestMapping("/bookListUser/{user}")
	public String bookListUser(@PathVariable("user")String user,Model m) {
		List<Book> books=bookService.fetchBooks();
		m.addAttribute("title","Book List");
		System.out.println(user);
		m.addAttribute("user",user);
		m.addAttribute("books", books);
		return "bookListUser";
	}
	
	@RequestMapping(path="/removeBook/{id}")
	public RedirectView removeBooks(@PathVariable("id") String id,HttpServletRequest httpServletRequest) {
		bookService.removeBook(id);
		RedirectView view=new RedirectView();
		view.setUrl(httpServletRequest.getContextPath()+"/booksList");
		return view; 
	}
	
	@RequestMapping(path="/editBook/{id}")
	public String editBooks(@PathVariable("id") String id,Model m,HttpServletRequest httpServletRequest) {
		Book book=bookService.fetchBook(id);
		m.addAttribute("book", book);
		return "editBook";
	}
	
	@RequestMapping(path="/updateBook",method=RequestMethod.POST) 
	public RedirectView updateBook(@ModelAttribute("book") Book book,Model model) {
//		System.out.println(book.getId()+" "+book.getName()+" "+book.getQuantity()+" "+book.getPrice()+" "+book.getAuthor());
		this.bookService.updateBook(book);
		RedirectView view=new RedirectView();
		view.setUrl("booksList");
		return view; 
	}
	
	
	@RequestMapping(path="/includeBook",method=RequestMethod.POST) 
	public RedirectView includeBook(@ModelAttribute("includeBook") Book book,Model model) {
//		System.out.println(book.getId()+" "+book.getName()+" "+book.getQuantity()+" "+book.getPrice()+" "+book.getAuthor());
		this.bookService.saveBook(book);
		RedirectView view=new RedirectView();
		view.setUrl("booksList");
		return view; 
	}
	

}
