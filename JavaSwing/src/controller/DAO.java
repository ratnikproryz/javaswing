package controller;
import java.sql.*;
import view.*;
public class DAO {
	private Connection conn;
	public DAO() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost:1433;databaseName=QLDien;";
			Connection conn= DriverManager.getConnection(url,"sa","sa");
            System.out.println("Connected");

		} catch (Exception e) {
			// TODO: handle exception
//			JOptionPane.showMessageDialog(null, ""+e);
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new DAO();
		new FirstView();
	}
}
