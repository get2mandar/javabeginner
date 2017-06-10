package in.javapandit.springsession.beforespring.polybeans;

public class Drawing {
	
	private Shape shape;
	
	public Drawing(Shape shape) {
		this.shape = shape;
	}
	
	public void drawShape() {
		System.out.println("drawShape called for " + this.shape.getClass().getSimpleName());
		this.shape.draw();
	}
}
