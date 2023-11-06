/*Concept of writing programs with Data and Methods that act on the data.
 we are making the variables private and the only way of accessing is using methods...
 basically we are binding our data with methods, we can access only through methods,this is called encapsulating.
*/

//Data Hiding
/*
  The concept of data Hiding is going to help us in preventing the data entry issues directly on the web. 
 */
package encapsulation;

class Human{
	
	private int age;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		//this represents to the current object, which is calling the method.
		//means indirectly it is obj.name here
		this.name = name;
	} 
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Human obj = new Human();
		obj.setName("Shyam"); 
		obj.setAge(10);
		
		System.out.println(obj.getName()+" : "+obj.getAge());
	}
}

/* C#
 * using System;
class HelloWorld {
    private double sal;
    private double bonus {private set; get};//here set is private and get is public
    
    public void SetSal(int sal){
        if(sal<20000 || sal>=75000){
            Console.WriteLine("Please check your salary...");
            this.sal = 0;
        }
        else{
            this.sal = sal;
        }
    }
    
    public void SetBonus(int bonus){
        if(bonus<5000 || bonus>=15000){
            Console.WriteLine("Please check your bonus...");
            this.bonus = 0;
        }
        else{
            this.bonus = bonus;
        }
    }
        
    public double GetSalary(){
        return sal;
    }
    
    public double GetBonus(){
        return bonus;
    }
        
    public int Salary(){
        int total = Convert.ToInt32(GetSalary()+GetBonus());
        Console.WriteLine("Total Pay : "+total);
        return total;
    }
    
  static void Main() {
    Console.WriteLine("Hello World");
    
    HelloWorld shyam = new HelloWorld();
    // //shyam.sal = 750000;
    // shyam.bonus = 50000;
    shyam.SetSal(70000);
    shyam.SetBonus(10000);
    int totalPay = shyam.Salary();
    
    HelloWorld sundar = new HelloWorld();
    // sundar.sal = 750000;
    // sundar.bonus = 50000;
    sundar.SetSal(70000);
    sundar.SetBonus(10000);
    totalPay += sundar.Salary();
    Console.WriteLine("Total Amount : "+totalPay);
  }
}
*/
