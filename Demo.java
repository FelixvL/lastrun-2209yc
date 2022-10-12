
class Demo{ // PF
	public static void main(String[] args){
		Boerderderij bd = new Boerderij();
		Dier d = bd.fokken();
		d.lopen();
	}
}
class Boerderij{
	Dier fokken(){
		System.out.println("er wordt een dier gemaakt");
		return new Kip();
	}
}
class Dier{
	Dier(){
		System.out.println("aha Dier");
	}
	void lopen(){
		System.out.println("lopen in dier");
	}
}
class Kip extends Dier{
	Kip(){
		System.out.println("aha Kip");
	}
	void lopen(){
		System.out.println("lopen in Kip");
	}
	int lopen(int a){
		System.out.println("kip");
		return 5;
	}
}


