package com.etiya;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Deloghni Kahve Makinası");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitInStock(3);
        product1.setImageUrl("bilmemne1.jpg");


        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(8);
        product2.setUnitPrice(6500);
        product2.setUnitInStock(4);
        product2.setImageUrl("bilmemne2.jpg");


        Product product3 = new Product();
        product3.setName("Kitchhen Aid Kahve Makinesi");
        product3.setDiscount(9);
        product3.setUnitPrice(4500);
        product3.setUnitInStock(2);
        product3.setImageUrl("bilmemne3.jpg");

        Product[] products ={product1,product2,product3};

        System.out.println("<ul>");
        for(Product product : products){
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05556667788");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Hüseyin");
        individualCustomer.setLastName("Menteşe");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("05554443322");
        corporateCustomer.setTaxNumber("11111111111");
        corporateCustomer.setCustomerNumber("54321");

        Costumer[] customers ={individualCustomer,corporateCustomer};


    }
}