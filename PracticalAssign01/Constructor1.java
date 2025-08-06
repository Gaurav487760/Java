package PracticalAssign01;

import Assignment1.Construct1;

public class Constructor1 {
	public Constructor1() {
		System.out.println("I am in constructor");
	}
	//parameterize constructor
	public Constructor1(int a) {
		System.out.println("Value of a"+a);
	}
	public static void main(String[] args) {
		Constructor1 x=new Constructor1();
	}

}
