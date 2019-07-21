package entity;
/*
 * isbn":"9787208061644"
 * publisher":"上海人民出版社"},  
 * binding":"平装"
 * page":"362",
 * author":"卡勒德·胡赛尼（著）李继宏（译）",
 * paper":"胶版纸"
 * title":"追风筝的人"
 * price":"25.00",
 * img":"http://app2.showapi.com/isbn/img1/eaa363cbced8474e992dea310faf176d.jpg"
 * gist":"　　“许多
 */
public class Book {
	private String isbn;//ISBN码
	private String publisher;//出版社
	private String binding;//封装方式
	private String page;//页数
	private String author;//作者
	private String paper;//纸质
	private String title;//标题
	private String price;//价格
	private String img;//图片
	private String gist;//简介
	public Book() {
		super();
	}
	public Book(String isbn, String publisher, String binding, String page, String author, String paper, String title,
			String price, String img, String gist) {
		super();
		this.isbn = isbn;
		this.publisher = publisher;
		this.binding = binding;
		this.page = page;
		this.author = author;
		this.paper = paper;
		this.title = title;
		this.price = price;
		this.img = img;
		this.gist = gist;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getBinding() {
		return binding;
	}
	public void setBinding(String binding) {
		this.binding = binding;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPaper() {
		return paper;
	}
	public void setPaper(String paper) {
		this.paper = paper;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getGist() {
		return gist;
	}
	public void setGist(String gist) {
		this.gist = gist;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", publisher=" + publisher + ", binding=" + binding + ", page=" + page
				+ ", author=" + author + ", paper=" + paper + ", title=" + title + ", price=" + price + ", img=" + img
				+ ", gist=" + gist + "]";
	}
	
}
