package application;

public class Plot {
	int x;
	int y;
	int width;
	int depth;
	
	Plot(){
		this.width = 1;
		this.depth = 1;
	}
	
	Plot(int x, int y, int width, int depth){
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	Plot(Plot otherPlot){
		this.x = otherPlot.x;
		this.y = otherPlot.y;
		this.width = otherPlot.width;
		this.depth = otherPlot.depth;
	}
	
	// need to implement
	public boolean encompasses(Plot plot) {
		return false;
	}
	
	public int getDepth() {
		return this.depth;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	// need to implement
	public boolean overlaps(Plot plot) {
		return false;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	// need to implement based off test cases
	public String toString() {
		return "";
	}
	
}
