package encapsulation;

//constructor is nothing but a method, but with the same class name with no return type;
//every time you create the object it will call the constructor;
// if you create two objects it will be called twice;
public class Constructor {
	
	private int age;
	private String name;
	
	//default constructor
    //public Constructor() {
    //}
	
	//here actually this is not a default constructor, bcz we are giving values explicitly
	public Constructor() {
		age =10;
		name = "shyam";
	}
	
	public Constructor(int age) {
		this.age = age;
		name = "shyam";
	}

	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		//this is a KW which represents to the current object, which is calling this method SetName.
		//means indirectly it is obj.name here
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		Constructor obj = new Constructor(); //default constructor
		Constructor obj1 = new Constructor(10); //parameterized constructor
		System.out.println(obj.name +" : "+ obj.age);
		System.out.println(obj1.name +" : "+ obj1.age);
	}

}
