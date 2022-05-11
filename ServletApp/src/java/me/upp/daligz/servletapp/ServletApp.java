/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.upp.daligz.servletapp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import me.upp.daligz.calculadoraws2.pkgservicio.WSCalc;
import me.upp.daligz.calculadoraws2.pkgservicio.WSCalc_Service;

/**
 *
 * @author Dali
 */
@WebServlet(name = "ServletApp", urlPatterns = {"/calculadora"})
public class ServletApp extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            final String operacion = request.getParameter("operacion");
            final int num1 = Integer.valueOf(request.getParameter("num1"));
            final int num2 = Integer.valueOf(request.getParameter("num2"));
            double result = 0d;
            final WSCalc wsc = new WSCalc_Service().getWSCalcPort();
                    
            if (operacion.equalsIgnoreCase("suma")) {
                result = wsc.suma(num1, num2);
            } else if (operacion.equalsIgnoreCase("multiplicacion")) {
                result = wsc.multiplicar(num1, num2);
            }
            
            out.println("Operacion: " + operacion);
            out.print("<br / >");
            out.println("Num1: " + num1);
            out.print("<br / >");
            out.println("Num2: " + num2);
            out.print("<br / >");
            out.println("Resultado: " + result);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
