package com.example.webproga;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloNikita", value = "/hello-nick")
public class HelloNikita extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello Nikita</h1>");
        out.println("<img src=\"https://d3avoj45mekucs.cloudfront.net/rojakdaily/media/jessica-chua/entertainment/2018/oct/he110%20channel%20introduction/hello_main.jpg?ext=.jpg\" alt=\"hello\" width=\"150\" height=\"150\">");
        out.println("<br/><a href=\"index.html\">HOME</a>");
        out.println("<br/><a href=\"https://www.instagram.com/drugtvoyvrag/\" target=\"_blank\">INSTAGRAM</a>");
        out.println("</body></html>");
    }

}
