package in.javapandit.springsession.beforespring.polybeans;

public class PolymorphicApp {

	public static void main(String[] args) {
		
		Drawing drawingOfCircle = new Drawing(new PolyCircle());
		drawingOfCircle.drawShape();
		
		Drawing drawingOfTriangle = new Drawing(new PolyTriangle());
		drawingOfTriangle.drawShape();
	}

}
