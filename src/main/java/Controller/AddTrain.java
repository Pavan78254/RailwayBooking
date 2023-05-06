package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.TrainDao;
import Dto.Train;

@WebServlet("/addtrain")
public class AddTrain extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int trainnumber = Integer.parseInt(req.getParameter("tnumber"));
		String trainname = req.getParameter("tname");
		int trainseat = Integer.parseInt(req.getParameter("tseat"));
		String station = req.getParameter("tstation");
		String[] trainstations = station.split(",");
		String price = req.getParameter("tprice");
		String[] trainprice = price.split(",");
		String time = req.getParameter("ttime");
		String[] traintime = time.split(",");
		String days = req.getParameter("tdays");
		String[] traindays = days.split(",");
		
		Train train=new Train();
		train.setNumber(trainnumber);
		train.setName(trainname);
		train.setSeat(trainseat);
		train.setTime(traintime);
		train.setDays(traindays);
		train.setPrice(trainprice);
		train.setStations(trainstations);
		
		
		TrainDao dao=new TrainDao();
		dao.save(train);
		
		resp.getWriter().print("<h1 style='color:green'>Succesfully added the details</h1> ");
		req.getRequestDispatcher("AddRailway.html").include(req, resp);

	
		
		
	}
}
