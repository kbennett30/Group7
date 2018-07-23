import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TheaterData { }

class MTDC {
	
	private Connection connect;
	private Statement state;
    private ResultSet resultSet;
    Scanner user = new Scanner(System.in);
    ArrayList<String> thea = new ArrayList<>();
    
    void connectDatabase() throws SQLException, ClassNotFoundException { 
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/movietheater?serverTimezone=UTC&autoReconnect=true&useSSL=false";
		String user = "root";
		String password = "Qutiedi379*";
		
		try {
			Class.forName(driver);
			connect = DriverManager.getConnection(url, user, password);
			if(!connect.isClosed()) {
				System.out.println("Connecting...");
			}
		}
		catch (ClassNotFoundException e) {
			System.out.println("Driver Missing!");
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Database Connected!");
		}
	}
	
	String m1t1() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 1 && movie = 'Avengers: Infinity War'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m1t2() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 2 && movie = 'Avengers: Infinity War'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m1t3() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 3 && movie = 'Avengers: Infinity War'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m1t4() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 4 && movie = 'Avengers: Infinity War'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m1t5() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 5 && movie = 'Avengers: Infinity War'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m2t1() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 1 && movie = 'Jurrassic World: Fallen Kingdom'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m2t2() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 2 && movie = 'Jurrassic World: Fallen Kingdom'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m2t3() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 3 && movie = 'Jurrassic World: Fallen Kingdom'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m2t4() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 4 && movie = 'Jurrassic World: Fallen Kingdom'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m2t5() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 5 && movie = 'Jurrassic World: Fallen Kingdom'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m3t1() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 1 && movie = 'Ant-Man and the Wasp'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m3t2() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 2 && movie = 'Ant-Man and the Wasp'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m3t3() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 3 && movie = 'Ant-Man and the Wasp'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m3t4() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 4 && movie = 'Ant-Man and the Wasp'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m3t5() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 5 && movie = 'Ant-Man and the Wasp'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m4t1() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 1 && movie = 'Incredibles 2'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m4t2() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 2 && movie = 'Incredibles 2'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m4t3() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 3 && movie = 'Incredibles 2'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m4t4() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 4 && movie = 'Incredibles 2'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m4t5() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 5 && movie = 'Incredibles 2'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m5t1() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 1 && movie = 'BIG: 30th Anniversary(1988)'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m5t2() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 2 && movie = 'BIG: 30th Anniversary(1988)'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m5t3() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 3 && movie = 'BIG: 30th Anniversary(1988)'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m5t4() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 4 && movie = 'BIG: 30th Anniversary(1988)'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
	
	String m5t5() throws SQLException { 
		state = connect.createStatement();
		String movies = "select tod from movietimes where timeID = 5 && movie = 'B&)'";
		resultSet = state.executeQuery(movies);
		String time = null;
		while (resultSet.next()) {
			time = resultSet.getString("tod");
		}
		return time;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	void m1t1Unavail(String seat) throws SQLException {
		String availUpdate = "update m1t1 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m1t2Unavail(String seat) throws SQLException {
		String availUpdate = "update m1t2 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m1t3Unavail(String seat) throws SQLException {
		String availUpdate = "update m1t3 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m1t4Unavail(String seat) throws SQLException {
		String availUpdate = "update m1t4 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m1t5Unavail(String seat) throws SQLException {
		String availUpdate = "update m1t5 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m2t1Unavail(String seat) throws SQLException {
		String availUpdate = "update m2t1 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m2t2Unavail(String seat) throws SQLException {
		String availUpdate = "update m2t2 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m2t3Unavail(String seat) throws SQLException {
		String availUpdate = "update m2t3 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m2t4Unavail(String seat) throws SQLException {
		String availUpdate = "update m2t4 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m2t5Unavail(String seat) throws SQLException {
		String availUpdate = "update m2t5 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m3t1Unavail(String seat) throws SQLException {
		String availUpdate = "update m3t1 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m3t2Unavail(String seat) throws SQLException {
		String availUpdate = "update m3t2 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m3t3Unavail(String seat) throws SQLException {
		String availUpdate = "update m3t3 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m3t4Unavail(String seat) throws SQLException {
		String availUpdate = "update m3t4 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m3t5Unavail(String seat) throws SQLException {
		String availUpdate = "update m3t5 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m4t1Unavail(String seat) throws SQLException {
		String availUpdate = "update m4t1 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m4t2Unavail(String seat) throws SQLException {
		String availUpdate = "update m4t2 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m4t3Unavail(String seat) throws SQLException {
		String availUpdate = "update m4t3 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m4t4Unavail(String seat) throws SQLException {
		String availUpdate = "update m4t4 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m4t5Unavail(String seat) throws SQLException {
		String availUpdate = "update m4t5 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m5t1Unavail(String seat) throws SQLException {
		String availUpdate = "update m5t1 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m5t2Unavail(String seat) throws SQLException {
		String availUpdate = "update m5t2 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m5t3Unavail(String seat) throws SQLException {
		String availUpdate = "update m5t3 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m5t4Unavail(String seat) throws SQLException {
		String availUpdate = "update m5t4 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
	
	void m5t5Unavail(String seat) throws SQLException {
		String availUpdate = "update m5t5 set avail = 'UNAVAILABLE' where coord = ?";
		PreparedStatement unavail = connect.prepareStatement(availUpdate);
		unavail.setString(1, seat);
		unavail.executeUpdate();
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	boolean m1t1Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m1t1 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}	
	
	boolean m1t2Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m1t2 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}	
	
	boolean m1t3Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m1t3 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}	
	
	boolean m1t4Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m1t4 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}	
	
	boolean m1t5Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m1t5 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}	
		
	boolean m2t1Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m2t1 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}	
	
	boolean m2t2Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m2t2 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}	
	
	boolean m2t3ull() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m2t3 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}	
	
	boolean m2t4Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m2t4 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}	
	
	boolean m2t5Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m2t5 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}	

	boolean m3t1Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m3t1 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}	

	boolean m3t2Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m3t2 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}
	
	boolean m3t3Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m3t3 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}
	
	boolean m3t4Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m3t4 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}
	
	boolean m3t5Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m3t5 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}

	boolean m4t1Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m4t1 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}
	
	boolean m4t2Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m4t2 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}

	boolean m4t3Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m4t3 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}

	boolean m4t4Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m4t4 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}

	boolean m4t5Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m4t5 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}

	boolean m5t1Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m5t1 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}
	
	boolean m5t2Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m5t2 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}

	boolean m5t3Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m5t3 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}

	boolean m5t4Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m5t4 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}

	boolean m5t5Full() throws SQLException {
		ArrayList<String> theater = new ArrayList<>();
		state = connect.createStatement();
		String avail = "select avail from m5t5 where avail = 'AVAILABLE'";
		resultSet = state.executeQuery(avail);
		String seats = null;
		while (resultSet.next()){
			seats = resultSet.getString("avail");
			theater.add(seats);
		}
		if (theater.isEmpty()) {
			System.out.println("Theater is Sold Out.");
			return true;
		}return false;	
	}	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private java.sql.Timestamp getTimestamp() {
		java.util.Date current = new java.util.Date();
		return new java.sql.Timestamp(current.getTime());
	}
	
	@SuppressWarnings("unused")
	void transaction() throws SQLException {
		System.out.println("\n\t********Purchase & Confirmation********");
		System.out.print("Enter credit/debit card# (16-digit): ");
		String card = user.next();
		System.out.print("Enter Security Code: ");
		String security = user.next();
		System.out.println("\nCard#: " + card +  "\t   Charged: " + getTimestamp());
		LetterGenerator lg = new LetterGenerator();
		String letters = lg.generate();
		Random random = new Random();
		int numb9 = 100000000 + random.nextInt(899999999);
		String confirm = letters + numb9;
		System.out.println("\nConfirmation Code: " + confirm);
		String transact = "insert into transactions (card, cod, tims) values (?, ?, ?)";
		PreparedStatement recipts = connect.prepareStatement(transact);	
		recipts.setString(1, card);
		recipts.setString(2, confirm);
		recipts.setTimestamp(3, getTimestamp());
		recipts.executeUpdate();
	}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Seats {
	
	String Row;
	int Seat;
	Seats() { }
	
	public Seats(String row, int seat) {
		super();
		this.Row = row;
		this.Seat = seat;
	}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class Seating {
	
	ArrayList<Seats> s = new ArrayList<Seats>();
	
	String add(String row, int seat) {
		Seats element = new Seats(row, seat);
		s.add(element);
		return row + seat;
	}
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
class LetterGenerator {

	ArrayList<String> abc = new ArrayList<>();
	
	void addLetters() {
		abc.add("A"); abc.add("B"); abc.add("C"); abc.add("D"); abc.add("E");
		abc.add("F"); abc.add("G"); abc.add("H"); abc.add("I"); abc.add("J");
		abc.add("K"); abc.add("L"); abc.add("M"); abc.add("N"); abc.add("O");
		abc.add("P"); abc.add("Q"); abc.add("R"); abc.add("S"); abc.add("T");
		abc.add("U"); abc.add("V"); abc.add("W"); abc.add("X"); abc.add("Y"); 
		abc.add("Z");
	}
	
	String generate() {
		addLetters();
		String letter1, letter2, letter3;
			int index1 = (int)(abc.size()*(Math.random()));
			letter1 = abc.get(index1);
			int index2 = (int)(abc.size()*(Math.random()));
			letter2 = abc.get(index2);
			int index3 = (int)(abc.size()*(Math.random()));
			letter3 = abc.get(index3);
		return letter1 + letter2 + letter3;
		}
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////