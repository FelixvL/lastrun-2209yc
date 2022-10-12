
class Demo{ // PE
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
	int lopen(int a){
		System.out.println("kip");
		return 5;
	}
}

/*
overriden
1 signature hetzelfde
2 returntype covariant
3 accessmodifier mag niet vernauwen
4 throws clausule mag covariant bevatten OF NIETS

overload
1 Signature moet anders zijn   (aantal type volgorde)

*/
