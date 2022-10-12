
class Demo{ // OY
	public static void main(String[] args){
		Scherm s = new Scherm();
		s.verstelHoogte();
		System.out.println(s.hoogte);
	}
}
class Scherm{
	int hoogte;
	Scherm(){
		System.out.println("Ik zie dingen");
	}
	void verstelHoogte(){
		System.out.println("ff verstellen");
	}

}



