package engine;

import engine.physics.Vector;
import engine.physics.Direction;

public class Actor implements Player {
   private Vector velocity;
   private double mass;

   public Actor(Vector veloc, double mass) {
      this.velocity = veloc;
      this.mass = mass;
   }

   public Actor(double mass) {
      this(new Vector(0, 0), mass);
   }

   public double getMass() {
      return this.mass;
   }

   public Vector getVelocity() {
      return this.velocity;
   }

   public Vector getMomentum() {
      return new Vector(this.velocity.getDirection(), this.mass * this.velocity.getMagnitude());
   }

   public Vector getForce(double time) {
      return new Vector(this.velocity.getDirection(), this.getMomentum().getMagnitude() / time);
   }

   public Vector getGravity(Player player) {
      return new Vector(player.getDirectionToward(this), World.G * this.getMass() *
            player.getMass() * Math.pow(this.getDistanceFrom(player), 2));
   }

   public Direction getDirectionToward(Player player) {
      return new Direction(0);
   }

   public double getDistanceFrom(Player player) {
      return 0;
   }
}
