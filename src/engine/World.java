package engine;

// if worlds are visible, this needs to be extended

import java.util.ArrayList;
import engine.physics.Vector;
import engine.physics.Direction;

public class World extends ArrayList<Player> implements Player {
   public static double G = 6.674E-11;

   private ArrayList<Actor> actors;
   private double mass;

   public World(double mass) {
      super();
      this.mass = mass;
      this.actors = new ArrayList<Actor>();
   }

   public double getMass() {
      return this.mass;
   }

   public Vector getVelocity() {
      return new Vector(0, 0);
   }

   public Vector getMomentum() {
      return new Vector(0, 0);
   }

   public Vector getForce(double time) {
      return new Vector(0, 0);
   }

   public Vector getGravity(Player player) {
      return new Vector(player.getDirectionToward(this), World.G * this.getMass() *
            player.getMass() / Math.pow(this.getDistanceFrom(player), 2));
   }

   public Direction getDirectionToward(Player player) {
      return new Direction(Direction.UP);
   }

   public double getDistanceFrom(Player player) {
      return 0;
   }
}
