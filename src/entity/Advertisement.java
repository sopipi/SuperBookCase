package entity;

public class Advertisement {
	private int advertisementId;
	private String advertisementContent;
	public Advertisement() {
		super();
	}
	public Advertisement(int advertisementId, String advertisementContent) {
		super();
		this.advertisementId = advertisementId;
		this.advertisementContent = advertisementContent;
	}
	public int getAdvertisementId() {
		return advertisementId;
	}
	public void setAdvertisementId(int advertisementId) {
		this.advertisementId = advertisementId;
	}
	public String getAdvertisementContent() {
		return advertisementContent;
	}
	public void setAdvertisementContent(String advertisementContent) {
		this.advertisementContent = advertisementContent;
	}
	@Override
	public String toString() {
		return "Advertisement [advertisementId=" + advertisementId + ", advertisementContent=" + advertisementContent
				+ "]";
	}
	
	
}
