
class Demo{ // PB
	public static void main(String[] args){

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
	int verstelHoogte(String hoogte){
		System.out.println("ergonomisch!");
		return 7;
	}

}



