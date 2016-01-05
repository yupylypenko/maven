package ingo.mysql;
 

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class MysqlServlet extends HttpServlet {
 
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String number1 = (String) req.getParameter("action1");
    	String number2 = (String) req.getParameter("action2");
    	String result = "";
    	
    	result = number1+number2;
    	    	
    	resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("<!DOCTYPE HTML>");
                      
        PrintWriter pw = resp.getWriter();
        pw.println("<title>Мой первый сервлет!</title>");
        pw.println("<H1>Следующая моя стpаница GET!</H1>"); 
        pw.println("<html><body>");
        pw.println("<div>");        
    	pw.print("<form method=\"POST\">");
    	pw.println("<p> Введите имя пользователя: <input type=\"text\" name=\"param\"/></p>");
    	pw.println("<input type=\"submit\" value=\"Отправить!\"/></form>");
    	pw.println("</div>");
    	pw.println("<div>");        
    	pw.print("<form method=\"GET\">");
    	pw.println("<p> Введите первую цифру: <input type=\"text\" name=\"action1\"/></p>");
    	pw.println("<p> Введите вторую цифру: <input type=\"text\" name=\"action2\"/></p>");
    	pw.println("<p> Результат: <input name=\"result\" type=\"text\" readonly=\"readonly\"/ value="+result+"></p>");
    	pw.println("<hr />");
    	pw.println("<input name=\"plus\" type=\"submit\" value=\"+\"></input>");

    	pw.println("</form>");
    	pw.println("</div>");
        pw.println("</body></html>");
 
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String param = (String) req.getParameter("param");
    	param = param.toUpperCase();
    	resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("<!DOCTYPE HTML>");
                      
        PrintWriter pw = resp.getWriter();
        pw.println("<title>Мой первый сервлет!</title>");
        pw.println("<H1>Следующая моя стpаница POST!</H1>"); 
        pw.println("<html><body>");
        
    	pw.println("<p>"+param+"</p>");
    	    	       
        pw.println("</body></html>");
 
    }
    public String concat(String s1, String s2) {
    	return s1 + s2;	
    	
        }
}