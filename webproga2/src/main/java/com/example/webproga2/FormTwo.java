package com.example.webproga2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Math.*;

@WebServlet("/form2")
public class FormTwo extends HttpServlet {

    private double getResult(double a, double b, double c, double d)
    {
        return (2*(sqrt(tan(abs(a+c))))+(Math.log(b)/pow(c,d)));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String aVal = req.getParameter("aVal");
        String bVal = req.getParameter("bVal");
        String cVal = req.getParameter("cVal");
        String dVal = req.getParameter("dVal");

        try(PrintWriter out = resp.getWriter()) {
            out.println("<html><body>");
            try {
                double a = Double.parseDouble(aVal);
                double b = Double.parseDouble(bVal);
                double c = Double.parseDouble(cVal);
                double d = Double.parseDouble(dVal);
                double result = getResult(a, b, c, d);
                if (Double.isNaN(result))
                    throw new IllegalArgumentException();
                if (Double.isInfinite(result))
                    throw new ArithmeticException();

                out.println("<img src=\"pic1.png\" alt=\"formula 1\"/>");
                out.println("<h2>Answer for a = " + a + ", b = " + b + ", c = " + c + ", d = " + d + " :</h2>");
                out.println("<h3>" + result + "</h3></br>");
            } catch (NumberFormatException e) {
                out.println("<h1>Error! Received data is not a number!</h1>");
            }
            catch (IllegalArgumentException e){
                out.println("<h1>Error! Result is not a number!</h1>");
            }
            catch (ArithmeticException e) {
                out.println("<h1>Error! Division by zero!</h1>");
            }
            finally {
                out.println("<a href=\"page1.html\"><h2>Back</h2></a>");
                out.println("<a href=\"index.html\"><h2>Home</h2></a>");
                out.println("</body></html>");
            }
        }
    }
}