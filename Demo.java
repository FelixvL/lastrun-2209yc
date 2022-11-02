
class Demo{ // AJ
	public static void main(String[] args)throws Exception{
		Go hond = new Hond();
		hond.lopen();
		hond.lopen(25);
		System.out.println(hond.a);
	}
}

interface Go{
	int a = 45;
	public abstract void lopen();
}

class Hond implements Go{

	public void lopen(){
		System.out.println("lopen met" + a);
	}
	int lopen(int r) throws Exception{
		System.out.println("in lopen met r");
		return 17;
	}
}
