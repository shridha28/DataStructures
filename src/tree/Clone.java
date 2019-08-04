package tree;

public class Clone implements Cloneable {

	private String prodID;
	private Child child;
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Clone clone = new Clone();
		clone.setProdID("456");
		Child child = new Child();
		child.setPrice(89);
		child.setProdName("Chips");
		clone.setChild(child);
		
		Clone cloned = (Clone)clone.clone();
		
		System.out.println(cloned.getProdID());
		System.out.println(cloned.getChild().getPrice());
		System.out.println(cloned.getChild().getProdName());
		
		cloned.setProdID("1234");
		cloned.getChild().setPrice(11);;
		cloned.getChild().setProdName("Shoes");
		
		System.out.println("After Cloning");
	
		System.out.println(clone.getProdID());
		System.out.println(clone.getChild().getPrice());
		System.out.println(clone.getChild().getProdName());
		
		System.out.println("Cloned Object");
		
		System.out.println(cloned.getProdID());
		System.out.println(cloned.getChild().getPrice());
		System.out.println(cloned.getChild().getProdName());

	}
	public String getProdID() {
		return prodID;
	}
	public void setProdID(String prodID) {
		this.prodID = prodID;
	}
	public Child getChild() {
		return child;
	}
	public void setChild(Child child) {
		this.child = child;
	}
	
	
	
	  public Object clone() throws CloneNotSupportedException {
	  
	  Clone cloned = (Clone) super.clone();
	  cloned.setChild((Child)cloned.getChild().clone()); return cloned; }
	 

}
