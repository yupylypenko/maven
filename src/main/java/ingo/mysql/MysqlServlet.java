package ingo.mysql;
 

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class MysqlServlet extends HttpServlet {
 
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String username = (String) req.getParameter("username");
    	username = username.toUpperCase();
    	resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("<!DOCTYPE HTML>");
                      
        PrintWriter pw = resp.getWriter();
        pw.println("<title>Мой первый сервлет!</title>");
        pw.println("<H1>Следующая моя стpаница GET!</H1>"); 
        pw.println("<html><body>");
        pw.println("<p>"+username+"</p>");
                
    	pw.print("<form method=\"GET\">");
    	pw.println("<p> Введите имя пользователя: <input type=\"text\" name=\"username\"/></p>");
    	pw.println("<input type=\"submit\" value=\"Отправить!\"/></form>");
    	       
        pw.println("</body></html>");
 
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("<!DOCTYPE HTML>");
                      
        PrintWriter pw = resp.getWriter();
        pw.println("<title>Мой первый сервлет!</title>");
        pw.println("<H1>Следующая моя стpаница POST!</H1>"); 
        pw.println("<html><body>");
        
    	pw.println("<p> Введите имя пользователя: </p>");
    	    	       
        pw.println("</body></html>");
 
    }
    public String concat(String s1, String s2) {
    	return s1 + s2;	
    	
        }
}