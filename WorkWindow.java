package Main;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WorkWindow {
JFrame wW = new JFrame("GrapIner");
Color black = new Color(0);
private int k;
private int b;
JButton e = new JButton("e");
public WorkWindow(int k_, int b_) {
	wW.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	wW.setBounds(300,150,200,200);
	wW.setLayout(new GridLayout(150,150,1, 1));
	this.k = k_;
	this.b = b_;
	for(int i = 0; i < AnalizYravn.getCoord(k,b).length;i++) {
		
	}
	
	wW.setVisible(true);
}
}
