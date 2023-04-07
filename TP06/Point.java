package TP06;

public class Point {
      int x;
      int y;
      public Point(){
            this.x = 0;
            this.y = 0;
      }

      public Point(int x, int y){
            this.x = x;
            this.y = y;
      }

      // double distance(Point anotherPoint){
      //       int xDiff = this.x - anotherPoint.x;

      //       return 0;
      // }
}

class Circle{
      Point center;
      Point p;

      public Circle (Point p1, Point p2){
            this.center = p1;
            this.p = p2;
      } 

      public Double length(){
            double radius = radius();
            return 2*Math.PI*radius;
      } 
      public Double radius(){
            return Math.sqrt((Math.pow(center.x-p.x, 2)+Math.pow(center.y-p.y, 2)));
      }
      public Double surface(){
            double radius = radius();
            return Math.PI*radius*radius;
      }
     
      public static void main(String[] args) {
            Point center;
            Point p;
            
            center = new Point(2, 1);       // center of circle
            p = new Point(4, 1);       // New second point

            Circle c = new Circle(center, p);
            System.out.printf("The length of the circle is %.2f\n",c.length());
            System.out.printf("The radius of the circle is %.2f\n",c.radius());
            System.out.printf("The surface of the circle is %.2f\n",c.surface());
      }

}


