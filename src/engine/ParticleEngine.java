package engine;

public class ParticleEngine implements Engine {
   private World world;
   
   public ParticleEngine(double mass) {
      this.world = new World(mass);
   }
   
   
}