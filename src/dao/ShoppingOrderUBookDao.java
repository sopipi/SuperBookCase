package dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import entity.ShoppingOrderUBook;

public class ShoppingOrderUBookDao {
	
	//返回一条订单以及书籍详情
	public ShoppingOrderUBook selectByShoppingOrderId(int shoppingOrderId) {
		String sql = "select book.*,shoppingorder.shoppingOrderId,shoppingorder.orderPrice,shoppingorder.openId from book,shoppingorder where book.isbn = shoppingOrder.isbn and shoppingOrderId = ?;";
		return jdbc.select(sql, new BeanHandler<ShoppingOrderUBook>(ShoppingOrderUBook.class), shoppingOrderId);		
	}
	
	//返回多条书籍详情以及订单信息
	public List<ShoppingOrderUBook> selectListByShoppingOrderId(int shoppingOrderId) {
		String sql = "select book.*,shoppingorder.shoppingOrderId,shoppingorder.orderPrice,shoppingorder.openId from book,shoppingorder where book.isbn = shoppingOrder.isbn and shoppingOrderId = ?;";
		return jdbc.select(sql, new BeanListHandler<ShoppingOrderUBook>(ShoppingOrderUBook.class), shoppingOrderId);
	}
}
