package ingo.mysql;
 

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class MysqlServlet extends HttpServlet {
 
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("<!DOCTYPE HTML>");
                      
        PrintWriter pw = resp.getWriter();
        pw.println("<H1>Hello, world! или Привет мир! Это я!</H1>");
        pw.println("<H1>Следующая моя стpаница!</H1>"); 
        pw.println("<html><body>");
        pw.println("<p> Yurec </p>");
        
    	pw.print("<form method=\"GET\">");
    	pw.println("<p> Введите имя пользователя: <input type=\"text\" name=\"username\"/></p>");
    	pw.println("<input type=\"submit\" value=\"Отправить!\"/></form>");
    	
        pw.print("<form method=\"post\">");
        pw.println("<input type=\"text\" name=\"param1\"/>");
        pw.println("<input type=\"submit\" value=\"CLICK HERE\"/></form>");
        pw.println("</body></html>");
 
    }
    public String concat(String s1, String s2) {
    	return s1 + s2;	
    	
        }
}