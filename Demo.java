
class Demo{ // PA
	public static void main(String[] args){
		Scherm s = new Scherm();
		s.verstelHoogte(25);
		System.out.println(s.hoogte);
		new Scherm().verstelHoogte(15);
	}
}
class Scherm{
	int hoogte;
	Scherm(){
		hoogte += 12;
		System.out.println("Ik zie dingen");
	}
	Scherm(int a){
			System.out.println("nog meer dingen");
	}
	void verstelHoogte(int hoogte){
		hoogte = hoogte;
		System.out.println("ff verstellen"+hoogte);
	}
	void verstelHoogte(String hoogte){
		System.out.println("ergonomisch!");
	}

}



