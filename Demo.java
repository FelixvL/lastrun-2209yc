
class Demo{ // AC
	public static void main(String[] args){
		HooiVork h = new HooiVork();
		HooiVork h2 = new HooiVork();
		System.out.println(h.b);
	}
}


class HooiVork{
	int b = 5;
	static {
		System.out.println("iets anders" + b++);
	}
	HooiVork(){
		System.out.println("ooit weer" + ++b);
	}
	{
		System.out.println("in iets" + ++b);
	}
}
