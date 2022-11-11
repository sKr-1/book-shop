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

import manager.dao.BookDao;
import manager.entity.Book;
import manager.entity.Order;
import manager.service.PurchaseService;


@Controller
public class PurchaseController {
	
	@Autowired
	private BookDao bookDao;
	
	@Autowired
	private PurchaseService purchaseService;
	
	@RequestMapping(path="/buyBook/{id}/{user}")
	public String editBooks(@PathVariable("id") String id,@PathVariable("user") String user,Model m,HttpServletRequest httpServletRequest) {
		Book b=bookDao.getBook(id);
//		System.out.println(b.getId()+" "+b.getName()+" "+b.getQuantity()+" "+b.getPrice()+" "+b.getAuthor());
		m.addAttribute("user", user);
		m.addAttribute("b", b);
		System.out.println(user);
		return "order";
	}
	
	@RequestMapping(path="/orderBook/{user}",method=RequestMethod.POST) 
	public RedirectView orderBook(@ModelAttribute("book") Book book,@PathVariable("user") String user,Model m,HttpServletRequest httpServletRequest) {
//		System.out.println(order.getId()+" "+order.getName()+" "+order.getQuantity()+" "+order.getPrice()+" "+order.getAuthor());
		purchaseService.orderBook(book.getId(), user, Integer.parseInt(book.getQuantity()));
		RedirectView view=new RedirectView();
		view.setUrl(httpServletRequest.getContextPath()+"/bookListUser/{user}");
		return view; 
	}
	
	@RequestMapping(path="/showOrder",method=RequestMethod.POST) 
	public String showOrder(Model m) {
		List<Order> orders=purchaseService.fetchOrders();
		m.addAttribute("orders", orders);
		return "cart";
	}
	
	@RequestMapping(path="/showOrderUser/{user}",method=RequestMethod.POST) 
	public String showOrder(@PathVariable("user") String user,Model m) {
		List<Order> data=purchaseService.fetchOrders();
		System.out.println(user);
		List<Order> orders=new ArrayList<>();
		for(Order o:data) {
			if(o.getUser().equals(user)) {
				orders.add(o);
			}
		}
		m.addAttribute("orders", orders);
		
		return "cart";
	}
	
	
}
