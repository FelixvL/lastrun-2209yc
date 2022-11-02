
class Demo{ // AH
	public static void main(String[] args){
		Go hond = new Hond();
		hond.lopen();
		hond.lopen(25);
		System.out.println(hond.a);
	}
}

interface Go{
	int a;
	public abstract void lopen();
}

class Hond implements Go{

	public void lopen(){
		System.out.println("lopen met" + a);
	}
	void lopen(int r){
		System.out.println("in lopen met r");
		return 17;
	}
}
