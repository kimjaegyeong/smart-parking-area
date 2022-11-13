<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<meta name="viewport" content="width=device-width,initial-scale=1.0"/>

<h2>JDBC드라이버 테스트 </h2>

<%
  Connection conn=null;

  try{
	 String jdbcUrl = "jdbc:mysql://localhost:3306/parking_system?useUnicode=true&characterEncoding=utf8";
     String dbId = "capstone";
     String dbPass = "capstone";
	
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 conn = DriverManager.getConnection(jdbcUrl,dbId ,dbPass );
	 out.println("제대로 연결되었습니다.");
	 
	 
		conn= DriverManager.getConnection(jdbcUrl, dbId, dbPass);
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
			
	 
  }catch(Exception e){ 
	 e.printStackTrace();
  }
%>