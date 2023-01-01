package vendingmachine;

public class ProductVO {  //제품명, 가격, 재고량
	private String trade_name; //제품명
	private int price;  //가격
	private int total_stock; //재고량
	private int num; //번호
	
	public ProductVO() {
		
	}
	@Override
	public String toString() {
		return "ProductVO [trade_name=" + trade_name + ", price=" + price + ", total_stock=" + total_stock + ", num="
				+ num + "]";
	}
	public ProductVO(String trade_name, int price, int total_stock ,int num) {
		this.trade_name = trade_name;
		this.price = price;
		this.total_stock = total_stock;
		this.num = num;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTrade_name() {
		return trade_name;
	}
	public void setTrade_name(String trade_name) {
		this.trade_name = trade_name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal_stock() {
		return total_stock;
	}
	public void setTotal_stock(int total_stock) {
		this.total_stock = total_stock;
	}
	
}
