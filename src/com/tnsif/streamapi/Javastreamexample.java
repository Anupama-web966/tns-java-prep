package com.tnsif.streamapi;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    float price;
    
    // parameter constructor 
    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class Javastreamexample {
public static void main(String[] args) {
	List<Product> pl=new ArrayList<Product>();
	pl.add(new Product(1,"HP",890000));
	pl.add(new Product(1,"Lenova",62000));
	pl.add(new Product(1,"Dell",67000));
	pl.add(new Product(1,"Apple",100000));
	List<Float> pl2=pl.stream().filter(p->p.price>30000)//filter data
         .map(p->p.price)//fetching the price
         .collect(Collectors.toList()); // collecting the as list
System.out.println(pl2);


// to sum the price

double totalprice=pl.stream().collect(Collectors.summingDouble(Product->Product.price));
System.out.println(" total price of the laptops "+ totalprice);

// max and min product price

Product p2=pl.stream().max((o1,o2)->o1.price>o2.price?1:-1).get();
System.out.println(p2.price);


Product p3=pl.stream().min((o1,o2)->o1.price>o2.price?1:-1).get();
System.out.println(p3.price);

// count()

long Count =pl.stream().filter(Product->Product.price<90000).count();
System.out.println(Count);        

}


}

