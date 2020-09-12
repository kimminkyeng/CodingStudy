package Design1;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test4_images extends JFrame{

  public Test4_images() {
    super("패널에 그림 올리기");
    setSize(600,400);
    //setResizable(false);
    setLocationRelativeTo(null);
    
    ImagesPanel imgPanel = new ImagesPanel(new ImageIcon("D:\\java2006\\java\\works\\0824_windowbuilder\\images\\펭수5.jpg").getImage());
    
    add(imgPanel);
    //pack(); 화면이 그림 원본 크기에 맞게 띄워짐.
    
    setVisible(true);
  }
  public static void main(String[] args) {
    new Test4_images();
  }
}


//패널에 그림을 올려주는 클래스(외부클래스)
class ImagesPanel extends JPanel{
  private Image img;
  
  public ImagesPanel(Image img) {
    this.img = img;
    setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
    setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
    setLayout(null);
  }
  
  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null); //패널의 위치를 왼쪽 상단부터 주어지는것.
  }
  
}