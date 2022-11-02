
class Demo{ // AD
	public static void main(String[] args){
		Gereedschap h = new HooiVork();
		System.out.println(h.b);
	}
}

class Gereedschap{
	int b = 14;
}
class HooiVork extends Gereedschap{
	int b = 5;	
	HooiVork(){
		System.out.println("ooit weer" + b);
	}
}
