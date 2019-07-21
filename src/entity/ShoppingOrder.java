package entity;

import java.util.Date;

public class ShoppingOrder {	 
	 private int shoppingOrderId;//订单号
	 private String openId;//创建订单用户
	 private String isbn;//isbn
	 private int orderStatus;//订单状态
	 private int cabinetId;//格字号
	 private int machineId;//机器号
	 private int orderPrice;//原价
	 private int style;//书籍类别
	 private int oldStatus;//新旧程度
	 private Date datetime;//创建订单时间
	public ShoppingOrder() {
		super();
	}
	
	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public ShoppingOrder(int shoppingOrderId, String openId, String isbn, int orderStatus, int cabinetId, int machineId,
			int orderPrice, int style, int oldStatus, Date datetime) {
		super();
		this.shoppingOrderId = shoppingOrderId;
		this.openId = openId;
		this.isbn = isbn;
		this.orderStatus = orderStatus;
		this.cabinetId = cabinetId;
		this.machineId = machineId;
		this.orderPrice = orderPrice;
		this.style = style;
		this.oldStatus = oldStatus;
		this.datetime = datetime;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}

	public int getStyle() {
		return style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	public int getOldStatus() {
		return oldStatus;
	}

	public void setOldStatus(int oldStatus) {
		this.oldStatus = oldStatus;
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
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getCabinetId() {
		return cabinetId;
	}
	public void setCabinetId(int cabinetId) {
		this.cabinetId = cabinetId;
	}
	public int getMachineId() {
		return machineId;
	}
	public void setMachineId(int machineId) {
		this.machineId = machineId;
	}

	@Override
	public String toString() {
		return "ShoppingOrder [shoppingOrderId=" + shoppingOrderId + ", openId=" + openId + ", isbn=" + isbn
				+ ", orderStatus=" + orderStatus + ", cabinetId=" + cabinetId + ", machineId=" + machineId
				+ ", orderPrice=" + orderPrice + ", style=" + style + ", oldStatus=" + oldStatus + ", datetime="
				+ datetime + "]";
	}
	
	
	 
}
