package engine;

import engine.physics.Vector;
import engine.physics.Direction;

public interface Player {
   double getMass();
   Vector getVelocity();
   Vector getMomentum();
   Vector getForce(double time);
   Vector getGravity(Player player);
   Direction getDirectionToward(Player player);
   double getDistanceFrom(Player player);
}
