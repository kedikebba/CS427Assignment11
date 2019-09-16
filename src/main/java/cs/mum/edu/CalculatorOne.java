package cs.mum.edu;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorOne extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{String num1 = req.getParameter("add1");
        String num2 = req.getParameter("add1");
        String num3 = req.getParameter("mul1");
        String num4 = req.getParameter("mul2");
        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        int product = Integer.parseInt(num3) * Integer.parseInt(num4);
        PrintWriter out = resp.getWriter();

        out.println(num1 +" + "+num2+" = "+sum);
        out.println(num3 +" + "+num4+" = "+product);
        }catch (Exception e){
            PrintWriter out = resp.getWriter();

            resp.setContentType("text/html");
            out.println("<h3>Invalid Inputs</h3>");
            out.println("<p> The input should be of number Type</p>");
        }
    }
}
