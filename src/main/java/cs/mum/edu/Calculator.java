package cs.mum.edu;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Calculator extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String num1 = req.getParameter("add1");
            String num2 = req.getParameter("add1");
            String num3 = req.getParameter("mul1");
            String num4 = req.getParameter("mul2");
            int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
            int product = Integer.parseInt(num3) * Integer.parseInt(num4);
            PrintWriter out = resp.getWriter();
            resp.setContentType("text/html");
            out.println("<h3>Solution</h3>");
            out.println("<form action=\"calc\" method=\"GET\">" +
                    "<input type=\"number\" name=\"add1\" value=" + num1 + ">" +
                    "+" +
                    "<input type=\"number\" name=\"add2\" value=" + num2 + ">" +
                    "=" +
                    "<input type=\"number\" name=\"sum\" value=" + sum + ">" +
                    "<br>" + "<br>" +
                    "<input type=\"number\" name=\"mul1\" value=" + num3 + ">" +
                    "*" +
                    "<input type=\"number\" name=\"mul2\" value=" + num4 + ">" +
                    "=" +
                    "<input type=\"number\" name=\"product\" value=" + product + ">" +
                    "<br>" + "<br>" +
                    "<button><a href=\"\">Clear Screen</a></button>" +
                    "</form>"
            );
        }catch (Exception e){
            PrintWriter out = resp.getWriter();

            resp.setContentType("text/html");
            out.println("<h3>Invalid Inputs</h3>");
            out.println("<p> The input should be of number Type</p>");
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }


}
