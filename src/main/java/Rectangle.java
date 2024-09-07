public class Rectangle {
  
  // 4 private fields
  private int left;
  private int bottom;
  private int width;
  private int height;
  
  // Constructor with no paramters
  public Rectangle () {
    this.left = 0;
    this.bottom = 0;
    this.width = 0;
    this.height = 0;
  }

  // Constructor with 4 parameters (replaces negative width/height with 0)
  public Rectangle (int left, int bottom, int width, int height) {
    this.left = left;
    this.bottom = bottom;

    // If width is less than 0, then set it to 0
    if (width < 0) {
      this.width = 0;
    } else {
      this.width = width;
    }

    // If height is less than 0, then set it to 0
    if (height < 0) {
      this.height = 0;
    } else {
      this.height = height;
    }
  }

  // String method from lesson 
  public String toString() {
    // %d is the placeholder where the value of the corrosponding variable will be placed
      return String.format("base: (%d,%d) w:%d h:%d",
          this.left, this.bottom, this.width, this.height);
  }
  
  // Instance method to calculate area
  public int area() {
    return this.width * this.height;
  }

  // Instance method to calculate perimeter
  public int perimeter() {
    return (this.width * 2) + (2 * this.height);
  }

  // Instance method to see if rectangle fits within explcit parameter
  public boolean contains(Rectangle that) {
    return 
      // check if x coordinate is within the parameter
      (that.left >= this.left) && 
      // check if the y coordinate is within the parameter
      (that.bottom >= this.bottom) && 
      // check if the width is within the parameter (x coordinate plus width)
      ((that.left + that.width) <= (this.left + this.width)) && 
      // check if the height is within the parameter (y coordinate plus height)
      ((that.bottom + that.height) <= (this.bottom + this.height));
  }

  // Class method to find the intersection of two rectangles
  public static Rectangle intersection (Rectangle a, Rectangle b) {

    // Create a rectangle to find the intersection between the two rectangles
    Rectangle overlap = new Rectangle();

    // Find the maximum x-coordinate
    overlap.left = Math.max(a.left, b.left);
    // Find the maximum y-coordinate
    overlap.bottom = Math.max(a.bottom, b.bottom);
    // Find the width of the rectangle
    overlap.width = Math.min(a.left + a.width, b.left + b.width) - overlap.left;
    // Find the height of the rectangle
    overlap.height = Math.min(a.bottom + a.height, b.bottom + b.height) - overlap.bottom;
    
    // If the rectangles do not intersect, set rectangle fields to 0 (disjoint)
    if (overlap.width < 0 || overlap.height < 0) {
      overlap.left = 0;
      overlap.bottom = 0;
      overlap.width = 0;
      overlap.height = 0;
    }

    return overlap;
  }

  // Class method to find the total perimeter of the two rectangles
  public static int totalPerimeter (Rectangle a, Rectangle b) {

    // initialize variables
    int perimeter = 0;

    // Use intersection method to create a rectangle to figure out how the rectangles overlap
    Rectangle overlap = intersection(a,b);
    
    // When rectangle a contains rectangle b, execute the following
    if (a.contains(b)) {
      // Calculate perimeter of rectangle a since it contains rectangle b
      perimeter = (a.width * 2) + (a.height * 2);   
    } 
    // When rectangle b contains rectangle a, execute the following
    else if (b.contains(a)) {
      // calculate perimeter of rectanlge b since it contains rectangle a
      perimeter = (b.width * 2) + (b.height * 2);   
    } else {
    // Add total perimeter and subtract overlapping perimeters when the rectangles are not completely contained within one another
    perimeter = (a.width * 2) + (a.height * 2) + (b.width * 2) + (b.height * 2) - (overlap.width * 2) - (overlap.height * 2);
    }

    // return perimeter
    return perimeter;
  }
}