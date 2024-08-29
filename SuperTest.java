class A{
	int a=10;

}

class B extends A{
	int a=20;
	void display(){
		System.out.println(a);
	}
}

class SuperTest{
	public static void main(String args[]){
		B b = new B();
		b.display();
	}
}






