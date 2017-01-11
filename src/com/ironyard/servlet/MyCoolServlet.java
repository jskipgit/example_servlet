package com.ironyard.servlet;


import com.ironyard.data.Person;

import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jasonskipper on 1/11/17.
 */
public class MyCoolServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        // get data from form
        String myFirstName = request.getParameter("firstName");
        String myLastName = request.getParameter("lastName");
        String myAge = request.getParameter("age");

        // create person object
        Person p = new Person();
        p.setFirstName(myFirstName);
        p.setLastName(myLastName);
        int tmpAge = Integer.parseInt(myAge);
        p.setAge(tmpAge);

        request.setAttribute("person",p);
        // forward to display JSP
        String nextJSP = "/helloData.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        String currentTime = df.format(dateobj);
        request.setAttribute("curTime", currentTime);


        // forward to display JSP
        String nextJSP = "/helloData.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request,response);
    }
}
