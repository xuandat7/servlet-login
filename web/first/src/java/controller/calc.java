/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author xuandat7
 */
public class calc extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
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
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet calc</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet calc at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
//        processRequest(request, response);
//        request.getRequestDispatcher("calc.html").forward(request, response);
        
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
//        processRequest(request, response);
//        request.getRequestDispatcher("calc.html").forward(request, response);
//        response.setContentType("charset=UTF-8");
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");
        String dau = request.getParameter("dau");
        PrintWriter out = response.getWriter();
        try {
            double n1, n2;
            n1 = Double.parseDouble(num1);
            n2 = Double.parseDouble(num2);
            if(dau != null)
                out.println("<h1>" + tinh(n1, n2, dau) + "</h1>");
            else{
                out.println("<h1> hay chon phep tinh cua ban </h1>");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private String tinh(double num1, double num2, String dau){
        switch (dau) {
            case "-":
                return "Hieu: " + String.format("%.2f", num1-num2);
            case "*":
                return "Tich: " + String.format("%.2f", num1*num2);
            case "/":
                try {
                    return "Thuong: " + String.format("%.2f", num1/num2);
            } catch (Exception e) {
                    System.out.println(e);
            }
            default:
                return "Tong: " + String.format("%.2f", num1+num2);
        }
    }
    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
