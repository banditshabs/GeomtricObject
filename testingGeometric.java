import java.util.ArrayList;

public class testingGeometric {
	public static void main(String[] args) {
	
		GeometricObject c1 = new Circle(14);
		GeometricObject c2 = new Circle(23);
		GeometricObject t1 = new Rectangle(12, 13);
		GeometricObject t2 = new Rectangle(52, 46);
		GeometricObject s1 = new Square(25,"black");
		
		System.out.println("What is the maximum of circles \n" + c1.toString() +"\n"+ c2.toString());
		System.out.println("Maximum of the two is...");
		System.out.println(GeometricObject.max(c1, c2).toString());
		System.out.println("What is the maximum of rectangles \n" + t1.toString() +"\n"+ t2.toString());
		System.out.println("Maximum of the two is... ");
		System.out.println(GeometricObject.max(t1, t2).toString());
		System.out.println("");
		
		ArrayList<GeometricObject> array = new ArrayList<GeometricObject>();
		
		array.add(c1);
		array.add(c2);
		array.add(t1);
		array.add(t2);
		array.add(s1);
		
		
		for(GeometricObject f :array) {
			//System.out.println(f);
			if(f instanceof Colorable) {
				Square s = (Square) f;
				s.howToColor();
				System.out.println(f);
		}
			
		}
	}
}
