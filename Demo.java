
class Demo{ // AF
	public static void main(String[] args){
		Gereedschap h = new HooiVork();
		System.out.println(h.b);
		h.draaien();
	}
}

class Gereedschap{
	final int b;
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
		this(4);
		System.out.println("ooit weer" + b);
	}
	HooiVork(int b){
		System.out.println("tweede");
	}
	void draaien(){
		System.out.println("oei heel duizelig");
	}
}
