package ru.javawebinar.topjava.web;

import org.slf4j.Logger;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

import static org.slf4j.LoggerFactory.getLogger;


public class MealsServlet extends HttpServlet {

    private static final Logger log = getLogger(MealsServlet.class);
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.debug("redirect to meals");

//        request.getRequestDispatcher("/users.jsp").forward(request, response);
        response.sendRedirect("meals.jsp");
    }

}
