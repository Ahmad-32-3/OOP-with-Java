/*
Filename: W15-16U4A1_MuhammadAhmad_Rectangle
Author: Muhammad Ahmad
Date: Sunday, June 09, 2024
Purpose: To create a program that uses a seperate class to create rectangles and test the area and perimeter of the intersections between these rectangles
*/

// Rectangle test runs
public class Main {
  public static void main (String args[]) {
      Rectangle rectA1 = new Rectangle(-11,3,4,5);
      Rectangle rectA2 = new Rectangle(-8,8,4,3);

      Rectangle rectB1 = new Rectangle(-1,4,2,7);
      Rectangle rectB2 = new Rectangle(-1,6,7,3);

      Rectangle rectC1 = new Rectangle(-9,-4,2,5);
      Rectangle rectC2 = new Rectangle(-8,-6,3,3);

      Rectangle rectD1 = new Rectangle(-2,-2,6,4);
      Rectangle rectD2 = new Rectangle(-1,-2,4,3);

      Rectangle rectE1 = new Rectangle(0,-10,4,5);
      Rectangle rectE2 = new Rectangle(4,-9,1,1);

      Rectangle rectF1 = new Rectangle(11,1,4,2);
      Rectangle rectF2 = new Rectangle(8,3,2,3);

      Rectangle rectG1 = new Rectangle(7,-6,7,4);
      Rectangle rectG2 = new Rectangle(8,-4,5,1);

      Rectangle rectH1 = new Rectangle(-3,-7,2,2);
      Rectangle rectH2 = new Rectangle(-3,-7,2,2);

      System.out.println(rectA1.contains(rectA2) + " " + Rectangle.intersection(rectA1, rectA2).toString() + " " + Rectangle.totalPerimeter(rectA1, rectA2));

      System.out.println(rectB1.contains(rectB2) + " " + Rectangle.intersection(rectB1, rectB2).toString() + " " + Rectangle.totalPerimeter(rectB1, rectB2));

      System.out.println(rectC1.contains(rectC2) + " " + Rectangle.intersection(rectC1, rectC2).toString() + " " + Rectangle.totalPerimeter(rectC1, rectC2));

      System.out.println(rectD1.contains(rectD2) + " " + Rectangle.intersection(rectD1, rectD2).toString() + " " + Rectangle.totalPerimeter(rectD1, rectD2));

      System.out.println(rectE1.contains(rectE2) + " " + Rectangle.intersection(rectE1, rectE2).toString() + " " + Rectangle.totalPerimeter(rectE1, rectE2));

      System.out.println(rectF1.contains(rectF2) + " " + Rectangle.intersection(rectF1, rectF2).toString() + " " + Rectangle.totalPerimeter(rectF1, rectF2));

      System.out.println(rectG1.contains(rectG2) + " " + Rectangle.intersection(rectG1, rectG2).toString() + " " + Rectangle.totalPerimeter(rectG1, rectG2));

      System.out.println(rectH1.contains(rectH2) + " " + Rectangle.intersection(rectH1, rectH2).toString() + " " + Rectangle.totalPerimeter(rectH1, rectH2));


  }
}