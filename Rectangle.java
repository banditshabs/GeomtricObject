public class Rectangle extends GeometricObject {
  private double width;
  private double height;

    /** Construct a rectangle with width and height */
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  
  /**Return width*/
  public double getWidth() {
    return width;
  }

  /**Set a new width*/
  public void setWidth(double width) {
    this.width = width;
  }

  /**Return height*/
  public double getHeight() {
    return height;
  }

  /**Set a new height*/
  public void setHeight(double height) {
    this.height = height;
  }

  /**Implement the getArea method in GeometricObject*/
  @Override
  public double getArea() {
    return width*height;
  }

  /**Implement the getPerimeter method in GeometricObject*/
  @Override
  public double getPerimeter() {
    return 2*(width + height);
  }
  
  @Override
  public boolean equals(Object obj) {
	  double x1 = this.height;
	  double x2 = this.width;
	  double y1 = ((Rectangle) obj).getHeight();
	  double y2 = ((Rectangle) obj).getWidth();
	  
	  if((x1==y1)&&(x2==y2)) {
		  return true;
	  } else {
		  return false;
	  }
  }
  
  @Override
  public String toString() {
	  return "RECTANGLE: Height= " + this.height + ", Width=" + this.width
			  + ", Area= " + this.getArea() + ", Perimeter= " + this.getPerimeter();
  }

}

