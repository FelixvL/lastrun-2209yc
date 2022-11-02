
class Demo{ // AB
	public static void main(String[] args){
		HooiVork h = new HooiVork();
		HooiVork h2 = new HooiVork();
	}
}

class Bezem{
	int a = hoi();
	static int hoi(){
		System.out.println("in hoi");
		return 17;
	}
}
class HooiVork{
	{
		System.out.println("in iets");
	}
	static {
		System.out.println("iets anders");
	}
	HooiVork(){
		System.out.println("ooit weer");
	}
}
