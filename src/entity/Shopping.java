package entity;

public class Shopping {
	private int shoppingOrderId;//订单号
	private String openId;//用户
	public Shopping() {
		super();
	}
	public Shopping(int shoppingOrderId, String openId) {
		super();
		this.shoppingOrderId = shoppingOrderId;
		this.openId = openId;
	}
	public int getShoppingId() {
		return shoppingOrderId;
	}
	public void setShoppingId(int shoppingId) {
		this.shoppingOrderId = shoppingId;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	@Override
	public String toString() {
		return "Shopping [shoppingOrderId=" + shoppingOrderId + ", openId=" + openId + "]";
	}
	
}
