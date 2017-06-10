package in.javapandit.springsession.beforespring.polybeans;

public class PolyBasicApp {

	public static void main(String[] args) {
		Shape shape1 = new PolyCircle();
		shape1.draw();
		
		Shape shape2 = new PolyTriangle();
		shape2.draw();
	}

}
