package intro_to_array_lists;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	private JFrame frame;
	private JPanel panel;
	private JButton button1;
	private JButton button2; 
	
	public void run() {
	 
		JFrame frame = new JFrame();
		frame.resize(300, 100);
		JPanel panel = new JPanel();
		
		frame.setName("Guest Book");
		button1 = createButton("Add Name");
		button1.setPreferredSize(new Dimension(100,50));
		button1.addActionListener(this);
		
		button2 = createButton("View Names");
		button2.setPreferredSize(new Dimension(100,50));
		button2.addActionListener(this);
		
		panel.add(button1);
		
		panel.add(button2);
		
		frame.add(panel);
	
		//frame.add(button2);
		frame.setVisible(true);
		frame.pack();
		
	}

	
private JButton createButton(String name) {
		
			JButton a = new JButton();
				
		return new JButton(name);
	}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	JButton buttonPressed = (JButton) e.getSource();
	
	ArrayList<String> name = new ArrayList<String>();
	
	String names;
	
	if(buttonPressed == button1)
	{
		names = JOptionPane.showInputDialog("Input your name");
		name.add(names);
		String c =name.get(0);
		System.out.println(c);
	}
	
	System.out.println(name.size());
	name.add("Bob Banders");
	name.add("Sandy Summers");
	name.add("Greg Ganders");
	name.add("Donny Doners");
	
	if(buttonPressed == button2)
	{
		for(int i = 0; i<name.size(); i++)
		{
			String d = name.get(i);
			//JOptionPane.showMessageDialog(null, "Guest #"+ i + ": " + d);
			System.out.println("Guest #"+ i + ": " + d);
		}
	}
	
}

}
