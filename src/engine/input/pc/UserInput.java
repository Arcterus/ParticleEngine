package engine.input;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.

public class UserInput implements MouseListener implements KeyListener {
   public UserInput() {
      this.addMouseListener(this);
   }
}