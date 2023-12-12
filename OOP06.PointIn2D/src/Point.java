
public class Point {
	private int x;
    private int y;
    
    public Point() {
		this.x = 0;
		this.y = 0;
	}
    
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
    
	public double distance() {
		return Math.sqrt((x-0)*(x-0)+(y-0)*(y-0));
	}
    
	public double distance(double a, double b){
		return Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
	}
	
	public double distance(Point point2){
		return Math.sqrt((x-point2.x)*(x-point2.x)+(y-point2.y)*(y-point2.y));
	}
}
