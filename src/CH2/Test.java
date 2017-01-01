package CH2;

class Point {

	int x;
	int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

}

class Rec {

	Point lowerLeft;
	Point upperRight;

	public Rec(Point lowerLeft, Point upperRight) {
		super();
		this.lowerLeft = lowerLeft;
		this.upperRight = upperRight;
	}

	public boolean isIntersecting(Rec rectangle) {

		if (rectangle.upperRight.x < this.lowerLeft.x || rectangle.lowerLeft.x > this.upperRight.x
				|| rectangle.upperRight.y < this.lowerLeft.y || rectangle.lowerLeft.y > this.upperRight.y)
			return false;

		else
			return true;

	}

}

public class Test {

	public static void main(String[] args) {
	
		Rec a = new Rec(new Point(0,0),new Point(3,3));
		Rec b = new Rec(new Point(-4,-4),new Point(1,1));
		
		System.out.println(a.isIntersecting(b));
		
	}
	
	
}
