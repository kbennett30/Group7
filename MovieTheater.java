import java.sql.SQLException;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class MovieTheater extends JFrame {
	
	MovieTheater(){
		JFrame frame = new JFrame("Welcome"); //What it says at top of window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainScreen panel = new MainScreen(frame); 
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.getContentPane().add(panel);
		frame.pack(); frame.setVisible(true);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		MTDC data = new MTDC();
		data.connectDatabase();
		MovieTheater test = new MovieTheater();
	}
}