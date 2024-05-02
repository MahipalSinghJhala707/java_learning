class animal{
	void eat (){
		System.out.println("Eating....");
	}
}

class Dog extends animal{
	void bark(){
		System.out.println("bhaw bhaw  .....");
		
	}
}

class testInheritance{

	public static void main(String[] args){
		Dog x = new Dog();
		x.bark();
		x.eat();
	}
}
