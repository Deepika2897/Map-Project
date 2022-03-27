package mapProject;

//program using HASHMAP FOR USER-DEFINED DATA TYPE

import java.util.HashMap;
import java.util.Map;

class Employee { 
//declaring variables
int id;    
String name,company,department;    
int salary;   
//constructor
public Employee(int id, String name, String company, String department, int salary) {    
    this.id = id;    
    this.name = name;    
    this.company = company;    
    this.department = department;    
    this.salary = salary;    
}    
}   
//main class
public class  HashMapEmployeeUserDefinedDataType{
public static void main(String[] args) {  
	//using primitive data type(INTEGER) and user-defined data type OR composite data type(BOOK)
    //Creating map of Employee   
   HashMap<Integer,Employee> map=new HashMap<Integer,Employee>();    
    //Creating Employee   
   Employee b1=new Employee(101,"DEEPI","CAPGEMINI","COMPUTER",57667);    
   Employee b2=new Employee(102,"VIJAY","WIPRO","CHEMICAL",87888);    
   Employee b3=new Employee(103,"BISMI","ACCENTURE","DATABASE",43334);    
    //Adding Employee to map   
    map.put(1,b1);  
    map.put(2,b2);  
    map.put(3,b3);
//Traversing map OR iterating map 
    for(Map.Entry<Integer, Employee> entry:map.entrySet()){    
        int key=entry.getKey();  
        Employee b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.name+" "+b.company+" "+b.department+" "+b.salary);   
    }    
}    
}

