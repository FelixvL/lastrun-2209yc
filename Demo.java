
class Demo{ // AG
	public static void main(String[] args){
		Go hond = new Hond();
		hond.lopen();
		System.out.println(hond.a);
	}
}

interface Go{
	int a = 25;
	void lopen();
}

class Hond implements Go{

	void lopen(){
		System.out.println("lopen met" + a);
	}
}
