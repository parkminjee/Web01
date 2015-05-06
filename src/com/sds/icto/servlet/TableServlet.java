package com.sds.icto.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TableServlet
 */
@WebServlet("/TableServlet")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TableServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String row = request.getParameter("r");
		String col = request.getParameter("c");
		
		int nRow;
		if(row == null){
			nRow=3;
		}else{
			nRow= Integer.parseInt(row);
		}
		
		int nCol;
		if(row == null){
			nCol=3;
		}else{
			nCol= Integer.parseInt(col);
		}
		
		response.setContentType("text/html; charset=utf-8");	//한글!!
		PrintWriter out = response.getWriter();
		out.println("<table border='1px' cellspacing ='0' cellpadding='10px'>");
		
		for(int i=0;i<nRow;i++){
			out.println("<tr>");
			for(int j=0;j<nCol;j++){
				out.print("<td>셀("+i+","+j +")</td>");
			}
			out.println("</tr>");
		}
//		out.println("<table border='1px' cellspacing ='0' cellpadding='10px'>");
//		out.println("<tr>");
//		out.println("<td>셀(0,0)</td>");
//		out.println("<td>셀(0,1)</td>");
//		out.println("<td>cell(0,2)</td>");
//		out.println("</tr>");
//		out.println("<tr>");
//		out.println("<td>cell(1,0)</td>");
//		out.println("<td>cell(1,1)</td>");
//		out.println("<td>cell(1,2)</td>");
//		out.println("</tr>");
//		out.println("<tr>");
//		out.println("<td>cell(2,0)</td>");
//		out.println("<td>cell(2,1)</td>");
//		out.println("<td>cell(2,2)</td>");
//		out.println("</tr>");
		out.println("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
