package daotest;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.ShoppingOrderUBookDao;
import entity.ShoppingOrderUBook;

public class ShoppingOrderUBookDaoTest {
	private ShoppingOrderUBookDao sobookdao = new ShoppingOrderUBookDao();
	@Test
	public void selectByShoppingOrderIdTest() {
		ShoppingOrderUBook sobook = sobookdao.selectByShoppingOrderId(1);
		System.out.println(sobook.toString());
	}

}
