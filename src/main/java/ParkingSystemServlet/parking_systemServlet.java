package ParkingSystemServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ParkingSystemDTO.ParkingSystemDto;
import ParkingSystemDAO.*;
/**
 * Servlet implementation class parking_systemServlet
 */
@WebServlet(name = "parking_system", urlPatterns = { "/parking_system" })
public class parking_systemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public parking_systemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		parkingSystem dao= new parkingSystem();
		System.out.println("asdfsd");
		ArrayList<ParkingSystemDto> list = new ArrayList<ParkingSystemDto>();
		
		try {
			list = dao.selectArea();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.setAttribute("list", list);

		request.getRequestDispatcher("main.jsp").forward(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			/*
			parkingSystem dao= new parkingSystem();
			System.out.println("asdfsd");
			ArrayList<ParkingSystemDto> list = new ArrayList<ParkingSystemDto>();
			
			list = dao.selectArea();
			
			System.out.println(list.get(0));
			*/
		}
		
	}


