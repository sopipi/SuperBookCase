package service;

import dao.ShoppingOrderUBookDao;
import entity.ShoppingOrderUBook;

public class ShoppingOrderUBookService {
	private ShoppingOrderUBookDao dao = new ShoppingOrderUBookDao();
	
	
	//通过订单号返回书籍详情以及订单信息
	public ShoppingOrderUBook selectByShoppingOrderId(int shoppingOrderId) {
		return dao.selectByShoppingOrderId(shoppingOrderId);
	}
}
