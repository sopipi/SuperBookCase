package entity;

public class Comment {
	private int commentId;//自增
	private String openId;//发表用户
	private int shppongOrderId;//订单号
	private String commentContent;//评论内容
	public Comment() {
		super();
	}
	public Comment(int commentId, String openId, int shppongOrderId, String commentContent) {
		super();
		this.commentId = commentId;
		this.openId = openId;
		this.shppongOrderId = shppongOrderId;
		this.commentContent = commentContent;
	}
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public int getShppongOrderId() {
		return shppongOrderId;
	}
	public void setShppongOrderId(int shppongOrderId) {
		this.shppongOrderId = shppongOrderId;
	}
	public String getAdvertisementContent() {
		return commentContent;
	}
	public void setAdvertisementContent(String commentContent) {
		this.commentContent = commentContent;
	}
	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", openId=" + openId + ", shppongOrderId=" + shppongOrderId
				+ ", commentContent=" + commentContent + "]";
	}
	
}
