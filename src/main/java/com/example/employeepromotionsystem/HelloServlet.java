package com.example.employeepromotionsystem;

import com.example.employeepromotionsystem.dao.EmployeeDao;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message = "hahahaha";

    public void init() {
        try {
            final String URL = "jdbc:mysql://localhost:3306/webproject";
            final String username = "hamza";
            final String password = "1253";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        EmployeeDao e = new EmployeeDao();
        try {
            e.getAll().stream().map(a->a.getFirstName()).forEach(out::println);
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void destroy() {

    }
}