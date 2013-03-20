package engine.graphics;

public class Line extends Shape {
   private int x1, x2;
   private int y1, y2;

   public Shape(int x1, int y1, int x2, int y2) {
      this.x1 = x1;
      this.x2 = x2;
      this.y1 = y1;
      this.y2 = y2;
   }

   public void draw(GraphicsBackend backend) {
      backend.drawLine(this.x1, this.y1, this.x2, this.y2);
   }
}
