package entity;

public class ShoppingOrderUBook extends Book{
	private int shoppingOrderId;//订单号
	private String openId;//创建订单用户
	private int orderPrice;//价格信息
	public ShoppingOrderUBook() {
		super();
	}
	public int getShoppingOrderId() {
		return shoppingOrderId;
	}
	public void setShoppingOrderId(int shoppingOrderId) {
		this.shoppingOrderId = shoppingOrderId;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public ShoppingOrderUBook(int shoppingOrderId, String openId, int orderPrice) {
		super();
		this.shoppingOrderId = shoppingOrderId;
		this.openId = openId;
		this.orderPrice = orderPrice;
	}
	@Override
	public String toString() {
		
		return super.toString()+"ShoppingOrderUBook [shoppingOrderId=" + shoppingOrderId + ", openId=" + openId + ", orderPrice="
				+ orderPrice + "]";
	}
	
}
