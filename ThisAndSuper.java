package encapsulation;

//this() method executes the constructor of same class
//and super() method executes the constructor of super(parent) class.

//every class in java by default extends object class
//every constructor by default consists super method.
class A extends Object
{
	public A() 
	{
		super();
		System.out.println("in A");
	}
	public A(int n)
	{
		super();
		System.out.println("in A int");
	}
}
class B extends A
{
	public B()
	{
//		super();
		super(5);
		System.out.println("in B");
	}
	public B(int n)
	{
//		super();   //call default constructor of super class
//		super(n);
		this();
		System.out.println("in B int");
	}
}
public class ThisAndSuper {

	public static void main(String[] args) {
		B obj = new B(5);

	}

}
