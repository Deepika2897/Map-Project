
package mapProject;
//program using HASHMAP FOR USER-DEFINED DATA TYPE

import java.util.HashMap;
import java.util.Map;

class Book { 
//declaring variables
int id;    
String name,author,publisher;    
int quantity;   
//constructor
public Book(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}   
//main class
public class  HashMapEx2UserDefinedDataType{
public static void main(String[] args) {  
	//using primitive data type(INTEGER) and user-defined data type OR composite data type(BOOK)
    //Creating map of Books    
   HashMap<Integer,Book> map=new HashMap<Integer,Book>();    
    //Creating Books    
   Book b1=new Book(101,"JAVA PROGRAMMING","JAMES GHOSLING","SISCO",5);    
   Book b2=new Book(102,"LEARN PHYTHON","D CREW","HILLOC",10);    
   Book b3=new Book(103,"HTML FRONT END","JISCOTIN","VILINTY",4);    
    //Adding Books to map   
    map.put(1,b1);  
    map.put(2,b2);  
    map.put(3,b3);
//Traversing map OR iterating map 
    for(Map.Entry<Integer, Book> entry:map.entrySet()){    
        int key=entry.getKey();  
        Book b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
    }    
}    
}
