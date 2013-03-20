package engine.graphics.Shape;

public interface GraphicsBackend {
   void render(); // called periodically to redraw the screen
   void drawLine(Line line); // does not actually draw a line, adds and renders later
   void drawShape(Shape shape);
   void clearScreen(); // clears the entire screen
}
