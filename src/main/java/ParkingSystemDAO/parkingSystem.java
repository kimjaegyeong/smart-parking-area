package ParkingSystemDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import ParkingSystemDTO.*;

public class parkingSystem {
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private	String url = "jdbc:mysql://localhost:3306/parking_system?characterEncoding=utf-8&serverTimezone=UTC&useSSL=false&useUnicode=true";
	private String user = "capstone";
	private String password = "capstone";
	
	public ArrayList<ParkingSystemDto> selectArea() throws ClassNotFoundException {
		
		try {
			  Connection conn=null;
			 String jdbcUrl = "jdbc:mysql://localhost:3306/parking_system?useUnicode=true&characterEncoding=utf8";
		     String dbId = "capstone";
		     String dbPass = "capstone";
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 conn = DriverManager.getConnection(jdbcUrl,dbId ,dbPass );
			 System.out.println("제대로 연결되었습니다.");
			 
			 
				conn= DriverManager.getConnection(jdbcUrl, dbId, dbPass);
				String sql= " select * from parking_system";
					PreparedStatement pstmt = conn.prepareStatement(sql);

					ResultSet rs= pstmt.executeQuery();
					ArrayList<ParkingSystemDto> list= new ArrayList<ParkingSystemDto>();
					while(rs.next()) {
						String parking_area_number =rs.getString("parking_area_number");  
						String parking = rs.getString("parking"); 
						String disabled = rs.getString("disabled"); 
						
						System.out.println("parking_area_number: "+parking_area_number);
						System.out.println("parking: "+ parking);
						System.out.println("disabled: "+disabled);
				
				ParkingSystemDto dto= new ParkingSystemDto(parking_area_number,parking,disabled);
	
				list.add(dto);
				
				
			}
			rs.close();
			pstmt.close();
			conn.close();
			System.out.println(list.get(0));
			return list; 
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

}
}
