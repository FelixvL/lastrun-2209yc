
class Demo{ // OZ
	public static void main(String[] args){
		Scherm s = new Scherm();
		s.verstelHoogte(25);
		System.out.println(s.hoogte);
		new Scherm().verstelHoogte(15);
	}
}
class Scherm{
	boolean hoogte;
	Scherm(){
		System.out.println("Ik zie dingen");
	}
	void verstelHoogte(int hoogte){
		System.out.println("ff verstellen"+hoogte);
	}

}



