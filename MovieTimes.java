import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class MovieTimes extends JPanel{
	
	private JPanel titlePanel;
	private JPanel timeOnePanel;
	private JPanel timeTwoPanel;
	private JPanel timeThreePanel;
	private JPanel timeFourPanel;
	private JPanel timeFivePanel;
	private JLabel titleLabel;
	private JLabel oneLabel,twoLabel, threeLabel, fourLabel, fiveLabel;
	private JRadioButton time1;
	private JRadioButton time2;
	private JRadioButton time3;
	private JRadioButton time4;
	private JRadioButton time5;
	String MovieName;
	String m1 = "Avengers: Infinity War";
	String m2 = "Jurrassic World: Fallen Kingdom";
	String m3 = "Ant-Man and the Wasp";
	String m4 = "Incredibles 2";
	String m5 = "BIG: 30th Anniversary(1988)";
	String one, two, three, four, five;
	JFrame f;
	JPanel backPanel;
	private JButton back;
	JLabel goBack;
	
	MovieTimes(String MovieName, JFrame f) throws SQLException, ClassNotFoundException{
		this.f =f;
	
		MTDC data = new MTDC();
		data.connectDatabase();
		
		//Option to go back to Main Screen if made incorrect selection
		backPanel = new JPanel();
		backPanel.setPreferredSize(new Dimension(500, 75));
		backPanel.setBackground(Color.gray);
		goBack = new JLabel();
		back = new JButton();
		back.setBackground(Color.gray);
		back.setBorderPainted(false);
		back.add(goBack);
		backPanel.add(back);
		goBack.setText("Go Back");
		goBack.setFont(new Font("Century Gothic", Font.BOLD, 36));
		TimeListener backListener = new TimeListener();
		back.addActionListener(backListener);

		
		// displays movie title
		this.MovieName = MovieName;
		titlePanel = new JPanel();
		titlePanel.setPreferredSize(new Dimension(1000, 50));
		titlePanel.setBackground(Color.blue);	
		titleLabel = new JLabel();
		titlePanel.add(titleLabel);
		titleLabel.setText(MovieName);
		titleLabel.setFont(new Font("Century Gothic", Font.BOLD, 36));
		
		//TimeOnePanel
		timeOnePanel = new JPanel();
		timeOnePanel.setPreferredSize(new Dimension(1000, 100));
		timeOnePanel.setBackground(Color.white);
		oneLabel = new JLabel();
		timeOnePanel.add(oneLabel);
		if (MovieName.equals(m1)) {
			one = data.m1t1();
		}
		if (MovieName.equals(m2)) {
			one = data.m2t1();
		}
		if (MovieName.equals(m3)) {
			one = data.m3t1();
		}
		if (MovieName.equals(m4)) {
			one = data.m4t1();
		}
		if (MovieName.equals(m5)) {
			one = data.m5t1();
		}
		oneLabel.setText(one);
		oneLabel.setFont(new Font("Century Gothic", Font.BOLD, 30));
		time1 = new JRadioButton();
		time1.setBackground(Color.white);
		time1.setName(one); //Need to link time to database
		timeOnePanel.add(time1);
		time1.setPreferredSize(new Dimension(30,30));
		TimeListener t1Listener = new TimeListener();
		time1.addActionListener(t1Listener);
		
		//TimeTwoPanel
		timeTwoPanel = new JPanel();
		timeTwoPanel.setPreferredSize(new Dimension(1000, 100));
		timeTwoPanel.setBackground(Color.white);
		twoLabel = new JLabel();
		timeTwoPanel.add(twoLabel);
		if (MovieName.equals(m1)) {
			two = data.m1t2();
		}
		if (MovieName.equals(m2)) {
			two = data.m2t2();
		}
		if (MovieName.equals(m3)) {
			two = data.m3t2();
		}
		if (MovieName.equals(m4)) {
			two = data.m4t2();
		}
		if (MovieName.equals(m5)) {
			two = data.m5t2();
		}
		twoLabel.setText(two);
		twoLabel.setFont(new Font("Century Gothic", Font.BOLD, 30));
		time2 = new JRadioButton();
		time2.setBackground(Color.white);
		time2.setName(two); //Need to link time to database
		timeTwoPanel.add(time2);
		time2.setPreferredSize(new Dimension(30,30));
		TimeListener t2Listener = new TimeListener();
		time2.addActionListener(t2Listener);
		
		//TimeThreePanel
		timeThreePanel = new JPanel();
		timeThreePanel.setPreferredSize(new Dimension(1000, 100));
		timeThreePanel.setBackground(Color.white);
		threeLabel = new JLabel();
		timeThreePanel.add(threeLabel);
		if (MovieName.equals(m1)) {
			three = data.m1t3();
		}
		if (MovieName.equals(m2)) {
			three = data.m2t3();
		}
		if (MovieName.equals(m3)) {
			three = data.m3t3();
		}
		if (MovieName.equals(m4)) {
			three = data.m4t3();
		}
		if (MovieName.equals(m5)) {
			three = data.m5t3();
		}
		threeLabel.setText(three);
		threeLabel.setFont(new Font("Century Gothic", Font.BOLD, 30));
		time3 = new JRadioButton();
		time3.setBackground(Color.white);
		time3.setName(three); //Need to link time to database
		timeThreePanel.add(time3);
		time3.setPreferredSize(new Dimension(30,30));
		TimeListener t3Listener = new TimeListener();
		time3.addActionListener(t3Listener);
		
		//TimeFourPanel
		timeFourPanel = new JPanel();
		timeFourPanel.setPreferredSize(new Dimension(1000, 100));
		timeFourPanel.setBackground(Color.white);
		fourLabel = new JLabel();
		timeFourPanel.add(fourLabel);
		if (MovieName.equals(m1)) {
			four = data.m1t4();
		}
		if (MovieName.equals(m2)) {
			four = data.m2t4();
		}
		if (MovieName.equals(m3)) {
			four = data.m3t4();
		}
		if (MovieName.equals(m4)) {
			four = data.m4t4();
		}
		if (MovieName.equals(m5)) {
			four = data.m5t4();
		}
		fourLabel.setText(four);
		fourLabel.setFont(new Font("Century Gothic", Font.BOLD, 30));
		time4 = new JRadioButton();
		time4.setBackground(Color.white);
		time4.setName(four); //Need to link time to database
		timeFourPanel.add(time4);
		time4.setPreferredSize(new Dimension(30,30));
		TimeListener t4Listener = new TimeListener();
		time4.addActionListener(t4Listener);
		
		//TimeFivePanel	
		timeFivePanel = new JPanel();
		timeFivePanel.setPreferredSize(new Dimension(1000, 100));
		timeFivePanel.setBackground(Color.white);
		fiveLabel = new JLabel();
		timeFivePanel.add(fiveLabel);
		if (MovieName.equals(m1)) {
			five = data.m1t5();
		}
		if (MovieName.equals(m2)) {
			five = data.m2t5();
		}
		if (MovieName.equals(m3)) {
			five = data.m3t5();
		}
		if (MovieName.equals(m4)) {
			five = data.m4t5();
		}
		if (MovieName.equals(m5)) {
			five = data.m5t5();
		}
		fiveLabel.setText(five);
		fiveLabel.setFont(new Font("Century Gothic", Font.BOLD, 30));
		time5 = new JRadioButton();
		time5.setBackground(Color.white);
		time5.setName(five); //Need to link time to database
		timeFivePanel.add(time5);
		time5.setPreferredSize(new Dimension(30,30));
		TimeListener t5Listener = new TimeListener();
		time5.addActionListener(t5Listener);
		
		//background
		setPreferredSize(new Dimension(1000, 1050));
		setBackground(Color.black);
		
		//adds Panels to screen
		add(titlePanel);
		add(timeOnePanel);
		add(timeTwoPanel);
		add(timeThreePanel);
		add(timeFourPanel);
		add(timeFivePanel);
		add(backPanel);
		
	}
	private class TimeListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(event.getSource() == time1) {
				//goes to seating 
				SeatingScreen panel;
					panel = new SeatingScreen(MovieName,time1.getName(),f);
					f.setContentPane(panel); 
					f.setVisible(true);
			}
			if(event.getSource() == time2) {
				//goes to seating
				SeatingScreen panel;
					panel = new SeatingScreen(MovieName,time2.getName(),f);
					f.setContentPane(panel); 
					f.setVisible(true);
			}
			if(event.getSource() == time3) {
				//goes to seating
				SeatingScreen panel;
					panel = new SeatingScreen(MovieName,time3.getName(),f);
					f.setContentPane(panel); 
					f.setVisible(true);
			}
			if(event.getSource() == time4) {
				//goes to seating
				SeatingScreen panel;
					panel = new SeatingScreen(MovieName,time4.getName(),f);
					f.setContentPane(panel); 
					f.setVisible(true);
			}
			if(event.getSource() == time5) {
				//goes to seating
				SeatingScreen panel;
					panel = new SeatingScreen(MovieName,time5.getName(),f);
					f.setContentPane(panel); 
					f.setVisible(true);
			}
			if(event.getSource() == back) {
				//goes to seating
				MainScreen panel = new MainScreen(f);
				f.setContentPane(panel); 
				f.setVisible(true);
			}
		}
	}
	
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		MTDC data = new MTDC();
		data.connectDatabase();
		JFrame frame = new JFrame("Movie Times");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MovieTimes panel = new MovieTimes("test", frame); 
		frame.getContentPane().add(panel);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.pack(); 
		frame.setVisible(true);
	}
}