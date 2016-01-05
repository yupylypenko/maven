package ingo.mysql;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MysqlServlet {
    public String concat(String s1, String s2) {
	return s1 + s2;	
	
    }
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
 
        PrintWriter pw = resp.getWriter();
        pw.println("<H1>Hello, world! или Привет мир! Это я!</H1>");
        pw.println("<H1>Следующая моя стpаница 1!</H1>");
 
    }
}