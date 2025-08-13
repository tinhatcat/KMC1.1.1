import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import java.awt.Image;


public class miningPanel extends JFrame implements ActionListener {
	
private static final long serialVersionUID = -6064086166669645075L;
public static int mode;
int r = 0;
private JPanel panel3;
private JLabel miningLabel,miningLabel2;
JMenu menu, submenu;  
JMenuItem j1, j2, j3, j4, j5, j6, j7;  


public miningPanel(){

Image icon3 = Toolkit.getDefaultToolkit().getImage("icon3.png");
setIconImage(icon3);

miningLabel = new JLabel("  Close this window to stop program.");
miningLabel2 = new JLabel("     Good luck!");
panel3 = new JPanel(new GridLayout(2, 2));
panel3.add(miningLabel);
panel3.add(miningLabel2);
add(panel3, BorderLayout.CENTER);
setTitle("Kitty Mining...");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(300, 100);
setVisible(true);
}


public void actionPerformed(ActionEvent e2){

////if (e2.getSource() == exitButton2)
////{
////dispose();
////System.exit(0);
////}
}
}