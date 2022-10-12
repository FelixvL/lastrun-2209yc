
class Demo{ // PC
	public static void main(String[] args){
		Dier d = new Kip();
		d.lopen();
	}
}
class Dier{
	void lopen(){
		System.out.println("Dier");
	}
}

class Kip extends Dier{
	int lopen(){
		System.out.println("kip");
	}
}

