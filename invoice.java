package ass2_1;

public class invoice {
	
	private String part_no;
	private String part_desc;
	private int quantity;
    private double pricePerItem;

    public invoice(String part_no ,String part_desc ,int quantity,double price) {
    	this.part_no = part_no;
    	this.part_desc=part_desc;
    	this.quantity = quantity;
    	this.pricePerItem =price;
    	
    	this.quantity = (quantity > 0 ? quantity :0);
    	this.pricePerItem = (pricePerItem < 0 ? pricePerItem :0.0);
    	
    			
    }
    
    
    public void setPart_no(String part_no) {
		this.part_no = part_no;
	}public void setPart_desc(String part_desc) {
		this.part_desc = part_desc;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public String getPart_no() {
		return part_no;
	}
	
     public String getPart_desc() {
		return part_desc;
	}
     
     public double getPricePerItem() {
		return pricePerItem;
	}
     
     public int getQuantity() {
		return quantity;
	}
     
     public double getinvoiceAmount() {
 		
		return quantity*pricePerItem;
 	}
    	 
     }






















   