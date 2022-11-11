package manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import manager.dao.PurchaseDao;
import manager.entity.Order;

@Service
public class PurchaseService {
	
	@Autowired
	PurchaseDao purchaseDao;
	
	public void orderBook(String id,String user,int q) {
		if(q!=0) {
			purchaseDao.addCart(id, user, q);
		}
	}
	
	public List<Order> fetchOrders() {
		return purchaseDao.getOrders();
	}
}
