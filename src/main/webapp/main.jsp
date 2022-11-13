<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>   
<%@ page import= "ParkingSystemDTO.ParkingSystemDto" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<style>
#testImg{
  postiion : relative;
  width: 700px;
  height: 350px;}
button.btn1 {
  position: absolute;
  top: 85px;
  left : 90px;
  <% 
  
  
  %>
}

button.btn2{
position: absolute;
  top: 85px;
  left : 170px; 
}

button.btn3 {
  position: absolute;
  top: 85px;
  left : 250px; 
}

button.btn4 {
  position: absolute;
  top: 85px;
  left : 330px; 
}

button.btn5 {
  position: absolute;
  top: 85px;
  left : 403px; 
}

button.btn6 {
  position: absolute;
  top: 85px;
  left : 480px; 
}
</style>
</head>

<body>
<%
		ArrayList<ParkingSystemDto> list = (ArrayList<ParkingSystemDto>)request.getAttribute("list");

%>
	
<div id="testImg">
  <img src="image/parking.PNG" width="700" height="350" alt="테스트이미지" />
  	<button class="btn1" type="button" name="<%= list.get(0).getParkingAreaNumber() %>" 
  	
<% if(list.get(0).getParking().equals("0")){ %> style="background-color: green" 
  <%	} else if(list.get(0).getParking().equals("1")){ %> style="background-color: red" <% } %>
	
	
  	value="<%= list.get(0).getParkingAreaNumber()%>" onclick="javascript:sensorBtnClick('btn1');">area_1</button>
  	
    <button class="btn2" type="button" name="<%= list.get(1).getParkingAreaNumber() %>"
      <% if(list.get(1).getParking().equals("0")){ %> style="background-color: green" 
  <%	} else if(list.get(1).getParking().equals("1")){ %> style="background-color: red" <% } %>
	
     value="<%= list.get(1).getParkingAreaNumber() %>" onclick="javascript:sensorBtnClick('btn2');">area_2</button>
     
 
    <button class="btn3" type="button" name="<%= list.get(2).getParkingAreaNumber() %>" 
     <% if(list.get(2).getParking().equals("0")){ %> style="background-color: green" 
  <%	} else if(list.get(2).getParking().equals("1")){ %> style="background-color: red" <% } %>
	
    value="<%= list.get(2).getParkingAreaNumber() %>" onclick="javascript:sensorBtnClick('btn3');">area_3</button>
    
    <button class="btn4" type="button" name="<%= list.get(3).getParkingAreaNumber() %>" 
     <% if(list.get(3).getParking().equals("0")){ %> style="background-color: green" 
  <%	} else if(list.get(3).getParking().equals("1")){ %> style="background-color: red" <% } %>
	
    value="<%= list.get(3).getParkingAreaNumber() %>" onclick="javascript:sensorBtnClick('btn4');">area_4</button>
     
    <button class="btn5" type="button" name="<%= list.get(4).getParkingAreaNumber() %>" 
     <% if(list.get(4).getParking().equals("0")){ %> style="background-color: green" 
  <%	} else if(list.get(4).getParking().equals("1")){ %> style="background-color: red" <% } %>
	
    value="<%= list.get(4).getParkingAreaNumber() %>" onclick="javascript:sensorBtnClick('btn5');">area_5</button>
    
    <button class="btn6" type="button" name="<%= list.get(5).getParkingAreaNumber() %>" 
     <% if(list.get(5).getParking().equals("0")){ %> style="background-color: yellow" 
  <%	} else if(list.get(5).getParking().equals("1")){ %> style="background-color: red" <% } %>
	
    value="<%= list.get(5).getParkingAreaNumber() %>" onclick="javascript:sensorBtnClick('btn5');">area_6</button>

</div>

</body>
</html>
