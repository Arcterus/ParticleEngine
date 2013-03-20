package engine.graphics;

public abstract class Shape {
   private Color fill;
   private Color border;

   public void setFill(Color color) {
      this.fill = color;
   }

   public Color getFill() {
      return this.fill;
   }

   public boolean hasFill() {
      return this.fill != null;
   }

   public void setBorder(Color color) {
      this.border = color;
   }

   public Color getBorder() {
      return this.border;
   }

   public boolean hasBorder() {
      return this.border != null;
   }

   public abstract void render(GraphicsBackend backend);
}
