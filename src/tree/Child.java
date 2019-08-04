package tree;

public class Child implements Cloneable{
	
	private int price;
	private String prodName;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
