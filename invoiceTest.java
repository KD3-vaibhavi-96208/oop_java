package ass2_1;

public class invoiceTest {


    public static void main(String[] args) {
    	
    	invoice inv1 = new invoice("1234" , "Hammer" , 2, 14.95);
    	invoice inv2 = new invoice("3564" , "skrew" , -7, -36.21);
    	
    	System.out.println("invoice 1 :" + inv1.getPart_desc());
    	System.out.println("invoice amount :" +inv1.getinvoiceAmount());
    	System.out.println(" invoice 2 :" + inv2.getPart_desc());
    	System.out.println("total amount  $ :" + inv2.getinvoiceAmount());
    	System.out.println("Quantity :" + inv2.getQuantity());
    	System.out.println("Price :" + inv2.getPricePerItem());
    	
    }
      
    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
   