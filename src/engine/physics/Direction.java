package engine.physics;

public class Direction {
   public static int UP = 0;
   public static int DOWN = 180;
   public static int LEFT = 270;
   public static int RIGHT = 90;

   private double degrees;

   public Direction(double deg) {
      this.degrees = deg;
   }

   public double getDegrees() {
      return this.degrees;
   }

   public double getRadians() {
      return this.degrees * (Math.PI / 180);
   }
}
