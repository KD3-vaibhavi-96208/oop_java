package com.sunbeam;
public class InvoiceTest {
    public static void main(String[] args) {

        Invoice inv = new Invoice("P101", "Hard Disk", 2, 3500.50);

        System.out.println("Part Number: " + inv.getPartNumber());
        System.out.println("Description: " + inv.getPartDescription());
        System.out.println("Quantity: " + inv.getQuantity());
        System.out.println("Price per item: " + inv.getPricePerItem());

        System.out.println("Invoice Amount: " + inv.getInvoiceAmount());
    }
}