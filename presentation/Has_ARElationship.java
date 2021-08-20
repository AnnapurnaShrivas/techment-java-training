package com.techment.presentation;


 class Address {  
String city,state,country;  
  
public Address(String city, String state, String country) {  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  
  
} 

public class Has_ARElationship {  
int id;  
String name;  
Address address;  
  
public Has_ARElationship(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}  
  
public static void main(String[] args) {  
Address address1=new Address("Bilaspur","CG","india");  
Address address2=new Address("Bhilai","CG","india");  
  
Has_ARElationship e=new Has_ARElationship(111,"varun",address1);  
Has_ARElationship e2=new Has_ARElationship(112,"arun",address2);  
      
e.display();  
e2.display();  
      
}  
} 