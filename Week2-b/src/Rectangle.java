
public class Rectangle {
	private int height;
	private int width;
	//Constructor    No Argument Constructor
	public Rectangle() {
		height=1;
		width=1;
	}
	public Rectangle(int x) {
		height=x;
		
	}
	public void setHeight(int x) {height=x;}
	public void setWidth(int x) {width=x;}
	public int parameter() {return (height+width)*2;}
	public int area() {return height*width;}

}
