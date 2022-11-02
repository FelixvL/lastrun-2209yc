
class Demo{ // AE
	public static void main(String[] args){
		Gereedschap h = new HooiVork();
		System.out.println(h.b);
		h.draaien();
	}
}

class Gereedschap{
	int b;
	Gereedschap(){
		System.out.println("in g");
	}
	void draaien(){
		System.out.println("oei duizelig");
	}
}
class HooiVork extends Gereedschap{
	int b = 5;	
	HooiVork(){
		System.out.println("ooit weer" + b);
	}
	void draaien(){
		System.out.println("oei heel duizelig");
	}
}
