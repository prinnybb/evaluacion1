/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterestServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import evaluacion1.InterestCalculator;

/**
 *
 * @author sebol
 */

public class InterestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros ingresados desde el JSP
        double principal = Double.parseDouble(request.getParameter("principal"));
        double rate = Double.parseDouble(request.getParameter("rate"));
        int years = Integer.parseInt(request.getParameter("years"));

        // Calcular el interés simple utilizando el modelo
        double interest = InterestCalculator.calculateSimpleInterest(principal, rate, years);

        // Configurar los resultados en el objeto request
        request.setAttribute("interest", interest);

        // Redirigir a la página JSP de resultados
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }
}