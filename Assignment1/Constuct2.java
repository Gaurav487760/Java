package Assignment1;

public class Constuct2 {
	//no argument constructor
	public Constuct2() {
		System.out.println("I am in constructor");
	}
	//parameterize constructor
	public Constuct2(int a) {
		System.out.println("Value of a"+a);
	}
	public static void main(String[] args) {
		Constuct2 x=new Constuct2();
		Constuct2 a=new Constuct2(56);
	}

}
