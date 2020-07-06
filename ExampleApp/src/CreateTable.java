import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateTable {

	
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			Statement stmt=con.createStatement();
			String query="create table Employees(empid varchar2(10) primary key, ename varchar2(20),email varchar2(20))";
			stmt.executeUpdate(query);
			System.out.println("Table is Created");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
			
		}
		


	}

}
