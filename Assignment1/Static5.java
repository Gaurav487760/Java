package Assignment1;

public class Static5 {
	static int x=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static5 t=new Static5();
		Static5 s=new Static5();
		Static5 y=new Static5();
		s.x=t.x+5;
		t.x=s.x+5;
		y.x=s.x+t.x;
		System.out.println(t.x);

	}

}
