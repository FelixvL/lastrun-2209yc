
class Demo{ // AA
	public static void main(String[] args){
		System.out.println(args.length);
		Bezem b = new Bezem();
		Bezem b2 = new Bezem();
		System.out.println(b.a);
	}
}

class Bezem{
	int a = hoi();
	static int hoi(){
		System.out.println("in hoi");
		return 17;
	}
}
