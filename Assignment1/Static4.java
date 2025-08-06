package Assignment1;

public class Static4 {
	static int x=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static4 t=new Static4();
		Static4 s=new Static4();
		Static4 y=new Static4();
		s.x=t.x+5;
		t.x=s.x+5;
		System.out.println(s.x);

	}

}
