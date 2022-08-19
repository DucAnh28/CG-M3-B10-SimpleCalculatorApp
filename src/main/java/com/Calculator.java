package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "Calculator",urlPatterns = "/Calculator")
public class Calculator extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Float first = Float.parseFloat(req.getParameter("first"));
        Float second = Float.parseFloat(req.getParameter("second"));

        String operator = req.getParameter("Operator");
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("Result: ");
        try {
            float result = calculator(first, second, operator);
            writer.println(first + " " + operator + " " + second + " = " + result);
        } catch (Exception e){
            writer.println(e.getMessage());
        }
        writer.println("</html>");
    }

    public float calculator(float first, float second, String operator) {
        switch (operator) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                if (second != 0)
                    return first / second;
                else throw new RuntimeException("Can't devide by Zero");
            default:
                throw new RuntimeException("invalid operation");
        }
    }
}
