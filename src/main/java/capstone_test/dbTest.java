package capstone_test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class dbTest {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private	String url = "jdbc:mysql://localhost:3306/parking_system?characterEncoding=utf-8&serverTimezone=UTC&useSSL=false&useUnicode=true";

	private String user = "capstone";
	private String password = "capstone";

	public dbTest() { 
		try {
			Class.forName(driver);

			System.out.println("test");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void select() {
		
		try {

			Connection conn= DriverManager.getConnection(url, user, password);
			String sql= " select * from parking_system";
			PreparedStatement pstmt = conn.prepareStatement(sql);

			ResultSet rs= pstmt.executeQuery();

			while(rs.next()) {
				String parking_area_number =rs.getString("parking_area_number");  
				String parking = rs.getString("parking"); 
				String disabled = rs.getString("disabled"); 
				
				System.out.println("parking_area_number: "+parking_area_number);
				System.out.println("parking: "+ parking);
				System.out.println("disabled: "+disabled);
			}
			rs.close();
			pstmt.close();
			conn.close();
			
		
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
