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
public class svlet extends HttpServlet {
   
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
            out.println("<title>Servlet svlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet svlet at " + request.getContextPath () + "</h1>");
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
       // processRequest(request, response);
//       response.sendRedirect("index.html");
//       request.getRequestDispatcher("index.html").forward(request, response);
//        response.sendRedirect("svlet2");
//       String num = request.getParameter("number");
//       String name = request.getParameter("name");
//       PrintWriter out = response.getWriter();
//       out.println("Hello " + name.toUpperCase());
//       try {
//            int n = Integer.parseInt(num);
//            if(n%2==1){
//                out.println("so " + n + " la so le!");
//            }
//            else{
//                out.println("so " + n + " la so chan!");
//            }
//            
//        } catch (Exception e) {
//            
//            out.println("may bi ham a???");
//        }
        String uname = request.getParameter("uname");
        String psw = request.getParameter("psw");
        PrintWriter out = response.getWriter();
        if(uname.equals("abc") && psw.equals("123")){
            out.println("<h1 style='color:red'>Dang nhap thanh cong!</h1>");
        }
        else{
            System.out.println("try it again");
        }
        
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
        processRequest(request, response);
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
