
class Demo{ // PH
	public static void main(String[] args){
		D d = new D();
		A y = d.en();
		y.c();
	}
}
class A{
	void c(){
		System.out.println("in c");
	}
}

class D{
	A en(){
		System.out.println("in en");
		return new A();
	}
}
