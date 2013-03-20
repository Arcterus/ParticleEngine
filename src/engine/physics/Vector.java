package engine.physics;

public class Vector {
   private Direction direction;
   private double magnitude;

   public Vector(Direction dir, double mag) {
      this.direction = dir;
      this.magnitude = mag;
   }
   
   public Vector(double dir, double mag) {
      this(new Direction(dir), mag);
   }

   public Direction getDirection() {
      return this.direction;
   }

   public double getMagnitude() {
      return this.magnitude;
   }
}
