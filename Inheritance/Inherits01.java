package Inheritance;

class Animal{
	void sound() {
		System.out.println("Animal makes a Sound");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("\t Bark");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("\t Meow");
	}
}
class Cow extends Animal{
	void sound() {
		System.out.println("\t mow");
	}
}
public class Inherits01 {
	public static void main(String[]args) {
		Animal Mypet=new Animal();
		Dog Mydog=new Dog();
		Cat Mycat=new Cat();
		Cow Mycow=new Cow();
		
		Mypet.sound();
		Mydog.sound();
		Mycat.sound();
		Mycow.sound();
	}
}
