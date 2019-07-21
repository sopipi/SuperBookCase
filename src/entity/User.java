package entity;
/*
 *  openId     | int(11)   
  | nickName   | varchar(20) 
 */
public class User {
	private String openId;
	private String nickName;
	public User() {
		super();
	}
	public User(String openId, String nickName) {
		super();
		this.openId = openId;
		this.nickName = nickName;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	@Override
	public String toString() {
		return "User [openId=" + openId + ", nickName=" + nickName + "]";
	}
	
	
}
