import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MainScreen extends JPanel{
	//Visual fields
	private JPanel logoPanel;
	private JPanel majorMoviesPanel;
	private JPanel otherMoviesPanel;
	private JLabel welcomeLabel;
	private JButton Movie1;
	private JButton Movie2;
	private JButton Movie3;
	private JButton Movie4;
	private JButton Movie5; 
	private JLabel Movie1Label;
	private JLabel Movie2Label;
	private JLabel Movie3Label;
	private JLabel Movie4Label;
	private JLabel Movie5Label;
	JFrame f;
	
	//Constructor for Main Screen
	MainScreen(JFrame f){
		this.f =f;
		
		//Set Logo Panel
		logoPanel = new JPanel(); //add image later
		logoPanel.setPreferredSize(new Dimension(1000, 50));
		logoPanel.setBackground(Color.blue);	
		welcomeLabel = new JLabel();
		logoPanel.add(welcomeLabel);
		welcomeLabel.setText("Welcome, Choose a movie.");
		welcomeLabel.setFont(new Font("Century Gothic", Font.BOLD, 36));
		
		
		//Major Movies Panel
		majorMoviesPanel = new JPanel();
		majorMoviesPanel.setPreferredSize(new Dimension(900, 350));
		majorMoviesPanel.setBackground(Color.black); 
		Movie1 = new JButton(new ImageIcon("aiw.jpg"));
		Movie1.setBorder(new EmptyBorder(2,2,2,2));
		Movie1.setName("Avengers: Infinity War");
		//System.out.println(System.getProperty("user.dir")); //finding where to store movie photos
		Movie2 = new JButton(new ImageIcon("jw.jpg"));
		Movie2.setBorder(new EmptyBorder(2,2,2,2));
		Movie2.setName("Jurrassic World: Fallen Kingdom");
		majorMoviesPanel.add(Movie1);
		majorMoviesPanel.add(Movie2);
		Movie1.setPreferredSize(new Dimension(300,350));
		Movie2.setPreferredSize(new Dimension(300,350));
		MovieListener m1listener = new MovieListener();
		Movie1.addActionListener(m1listener);
		MovieListener m2listener = new MovieListener();
		Movie2.addActionListener(m2listener);
					

		
		
		//Other Movies Panel
		otherMoviesPanel = new JPanel();
		otherMoviesPanel.setPreferredSize(new Dimension(900, 300));
		otherMoviesPanel.setBackground(Color.black);
		Movie3 = new JButton(new ImageIcon("ant.jpg"));
		Movie3.setBorder(new EmptyBorder(2,2,2,2));
		Movie3.setName("Ant-Man and the Wasp");
		Movie4 = new JButton(new ImageIcon("inc.png"));
		Movie4.setBorder(new EmptyBorder(2,2,2,2));
		Movie4.setName("Incredibles 2");
		Movie5 = new JButton(new ImageIcon("big.jpg"));
		Movie5.setBorder(new EmptyBorder(2,2,2,2));
		Movie5.setName("BIG: 30th Anniversary(1988)");
		Movie3.setBackground(Color.white);
		Movie4.setBackground(Color.white);
		Movie5.setBackground(Color.white);
		Movie3.setPreferredSize(new Dimension(250,300));
		Movie4.setPreferredSize(new Dimension(250,300));
		Movie5.setPreferredSize(new Dimension(250,300));
		otherMoviesPanel.add(Movie3);
		otherMoviesPanel.add(Movie4);
		otherMoviesPanel.add(Movie5);
		MovieListener m3listener = new MovieListener();
		Movie3.addActionListener(m3listener);
		MovieListener m4listener = new MovieListener();
		Movie4.addActionListener(m4listener);
		MovieListener m5listener = new MovieListener();
		Movie5.addActionListener(m5listener);
		
		//Background
		JPanel controls = new JPanel();
		
        GridLayout layout = new GridLayout();
        layout.setVgap(0);
		controls.setLayout(layout);
		setPreferredSize(new Dimension(1000, 800));
		setBackground(Color.black);
		
		
		//Adding all panels to the screen
		add(logoPanel);
		add(majorMoviesPanel);
		add(otherMoviesPanel);

	}
	
	//Activating movie buttons
	private class MovieListener implements ActionListener {
		
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == Movie1) {
				//go to movie1 ticket screen
				MovieTimes panel;
				try {
					panel = new MovieTimes(Movie1.getName(),f);
					f.setContentPane(panel); 
					f.setVisible(true);
				} catch (SQLException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(event.getSource() == Movie2) {
				//go to movie2 ticket screen
				MovieTimes panel;
				try {
					panel = new MovieTimes(Movie2.getName(),f);
					f.setContentPane(panel); 
					f.setVisible(true);
				} catch (SQLException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(event.getSource() == Movie3) {
				//go to movie3 ticket screen
				MovieTimes panel;
				try {
					panel = new MovieTimes(Movie3.getName(),f);
					f.setContentPane(panel); 
					f.setVisible(true);
				} catch (SQLException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(event.getSource() == Movie4) {
				//go to movie4 ticket screen
				MovieTimes panel;
				try {
					panel = new MovieTimes(Movie4.getName(),f);
					f.setContentPane(panel); 
					f.setVisible(true);
				} catch (SQLException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(event.getSource() == Movie5) {
				//go to movie5 ticket screen
				MovieTimes panel;
				try {
					panel = new MovieTimes(Movie5.getName(),f);
					f.setContentPane(panel); 
					f.setVisible(true);
				} catch (SQLException | ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		MTDC data = new MTDC();
		data.connectDatabase();
		JFrame frame = new JFrame("Welcome"); //What it says at top of window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainScreen panel = new MainScreen(frame); 
		frame.getContentPane().add(panel);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.pack(); frame.setVisible(true);
	}
}
