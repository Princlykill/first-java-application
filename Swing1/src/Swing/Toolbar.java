package Swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
	private JButton homeButton;
	private JButton viewButton;
	
	private StringListener textListener;
	
	public Toolbar() {
		setBorder(BorderFactory.createEtchedBorder());
		
		homeButton = new JButton("Home");
		viewButton = new JButton("View");
		

		homeButton.addActionListener(this);
		viewButton.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(homeButton);
		add(viewButton);
	}
	
	public void setStringListener(StringListener listener) {
		this.textListener = listener;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
		
		if (clicked == homeButton) {
			if(textListener != null); {
				textListener.textEmitted("Home\n");
			}
			
		}
		else if (clicked == viewButton) {
			if(textListener != null); {
				textListener.textEmitted("View\n");
			}
		}
		
	}

}
