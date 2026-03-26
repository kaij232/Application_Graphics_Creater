package Main;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StartWindow {
	JFrame stWin = new JFrame("GrapIner");
JTextField userKB = new JTextField();
	public StartWindow() {
		
		stWin.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		stWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		stWin.setBounds(300,150,200,200);
		stWin.setLayout(new GridLayout(3,3,30,30));
		stWin.add(new JLabel("Write (k,b)"));
		stWin.add(userKB);
		JButton subm = new JButton("Submit");
		subm.addActionListener(new ClickListener());
		stWin.add(subm);
		stWin.setVisible(true);
	}
	public class ClickListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			stWin.hide();
			WorkWindow WW = new WorkWindow(Integer.parseInt(userKB.getText().split(",")[0]),Integer.parseInt( userKB.getText().split(",")[1]));
//			k = Integer.parseInt(userKB.getName().split(",")[0]);
		}
		
	}
}
