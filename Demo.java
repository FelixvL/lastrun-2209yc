
class Demo{ 
	public static void main(String[] args) throws Exception{
		Doen d = new Doen();
		try{
			d.maken();
		}catch(Exception hoidoeidoei){
			System.out.println("mo");
		}finally{
			System.out.println("so");
		}
		System.out.println("do");
	}
}


class Doen{
	void maken() throws Exception{
		System.out.println("jo");
	}

}

