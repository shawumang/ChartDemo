package com.chart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class Chart
 */
public class Chart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Chart() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		Gson gsonObj = new Gson();
		Map<Object, Object> map = null;
		List<Map<Object, Object>> list = new ArrayList<Map<Object, Object>>();

		map = new HashMap<Object, Object>();
		map.put("label", "Mercury");
		map.put("y", 3.7);
		list.add(map);
		map = new HashMap<Object, Object>();
		map.put("label", "Venus");
		map.put("y", 8.9);
		list.add(map);
		map = new HashMap<Object, Object>();
		map.put("label", "Earth");
		map.put("y", 9.8);
		list.add(map);
		map = new HashMap<Object, Object>();
		map.put("label", "Mars");
		map.put("y", 3.7);
		list.add(map);
		map = new HashMap<Object, Object>();
		map.put("label", "Jupiter");
		map.put("y", 23.1);
		list.add(map);
		map = new HashMap<Object, Object>();
		map.put("label", "Saturn");
		map.put("y", 9);
		list.add(map);
		map = new HashMap<Object, Object>();
		map.put("label", "Uranus");
		map.put("y", 8.7);
		list.add(map);
		map = new HashMap<Object, Object>();
		map.put("label", "Neptune");
		map.put("y", 11);
		list.add(map);

		String dataPoints1 = gsonObj.toJson(list);
		request.setAttribute("dataPoints1", dataPoints1);

		list = new ArrayList<Map<Object, Object>>();
		map = new HashMap<Object, Object>();
		map.put("label", "Mercury");
		map.put("y", 4.3);
		list.add(map);
		map = new HashMap<Object, Object>();
		map.put("label", "Venus");
		map.put("y", 10.4);
		list.add(map);
		map = new HashMap<Object, Object>();
		map.put("label", "Earth");
		map.put("y", 11.2);
		list.add(map);
		map = new HashMap<Object, Object>();
		map.put("label", "Mars");
		map.put("y", 5);
		list.add(map);
		map = new HashMap<Object, Object>();
		map.put("label", "Jupiter");
		map.put("y", 59.5);
		list.add(map);
		map = new HashMap<Object, Object>();
		map.put("label", "Saturn");
		map.put("y", 35.5);
		list.add(map);
		map = new HashMap<Object, Object>();
		map.put("label", "Uranus");
		map.put("y", 21.3);
		list.add(map);
		map = new HashMap<Object, Object>();
		map.put("label", "Neptune");
		map.put("y", 23.5);
		list.add(map);

		String dataPoints2 = gsonObj.toJson(list);

		request.setAttribute("dataPoints2", dataPoints2);
		RequestDispatcher r = request.getRequestDispatcher("one.jsp");
		r.include(request, response);

	}

//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
//	 *      response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//
//	}

}
