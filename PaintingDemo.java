import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
import javax.swing.*;
public class PaintingDemo extends Applet implements MouseMotionListener, ActionListener
{    

  Button b;
  public void init()
  {  
    b = new Button("clear screen");
   //b.setBackground(Color.white);
    add(b);
    b.addActionListener(this);
   addMouseMotionListener(this);  
    setBackground(Color.green);  
  }  
  public void mouseDragged(MouseEvent me)
  {  
    Graphics g=getGraphics();  
    g.setColor(Color.black);  
    g.fillOval(me.getX(),me.getY(),5,5);  
  }  
  public void mouseMoved(MouseEvent me)
  {}

  public void actionPerformed(ActionEvent e){
  setBackground(Color.white); 
  }  
} 
  