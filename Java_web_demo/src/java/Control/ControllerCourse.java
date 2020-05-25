/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.DataProcess;
import com.sun.xml.xsom.impl.scd.Iterators;
import entty.Course;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "ControllerCourse", urlPatterns = {"/ControllerCourse"})
public class ControllerCourse extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        String action = request.getParameter("ac");
        if ("add".equals(action)) {
            String id = request.getParameter("txtid");
            String name = request.getParameter("txtname");
            String category = request.getParameter("txtcategory");
            String topic = request.getParameter("txttopic");
            String start = request.getParameter("txtstart");
            String end = request.getParameter("txtend");
            DataProcess dt = new DataProcess();
            if (dt.addCourse(id, name, category, topic, start, end)) {
                request.setAttribute("courseList", null);
                RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/home.jsp");

                dispatcher.forward(request, response);

            } else {
                RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/Erorr.jsp");
                dispatcher.forward(request, response);
            }
        }
        if ("view".equals(action)) {
            DataProcess dt = new DataProcess();
            ArrayList<Course> list = dt.getData();
            request.setAttribute("courseList", list);
            RequestDispatcher rd = request.getRequestDispatcher("/ListCourse.jsp");
            rd.forward(request, response);
        }
        if ("upDate".equals(action)) {
            String id = request.getParameter("txtid");
            String name = request.getParameter("txtname");
            String category = request.getParameter("txtcategory");
            String topic = request.getParameter("txttopic");
            String start = request.getParameter("txtstart");
            String end = request.getParameter("txtend");
            DataProcess dt = new DataProcess();
            if (dt.editCourse(id, name, category, topic, start, end)) {
                request.setAttribute("courseList", null);
                RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/ListCourse.jsp");

                dispatcher.forward(request, response);

            } else {
                RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/Erorr.jsp");
                dispatcher.forward(request, response);
            }
        }
        if ("edit".equals(action)) {
            String id = request.getParameter("id");
            DataProcess dt = new DataProcess();
            Course c = dt.getbyID(id);
            request.setAttribute("courseDeltail", c);
            RequestDispatcher rd = request.getServletContext().getRequestDispatcher("/editCourse.jsp");
            rd.forward(request, response);
        }
        if ("delete".equals(action)) {
            String id = request.getParameter("id");

            DataProcess dt = new DataProcess();

            if (dt.deleteCourse(id)) {
                request.setAttribute("courseList", null);
                RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/ListCourse.jsp");

                dispatcher.forward(request, response);

            }
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
