package hu.ak_akademia.buddyfinder.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hu.ak_akademia.buddyfinder.dao.PersonDao;
import hu.ak_akademia.buddyfinder.dao.sql.CreatePersonSqlBuilder;
import hu.ak_akademia.buddyfinder.dao.sql.CreatePersonSqlWriter;
import hu.ak_akademia.buddyfinder.dto.Gender;
import hu.ak_akademia.buddyfinder.dto.Person;

public class RegisterUser extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String gender = request.getParameter("gender");
        String userName = request.getParameter("userName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        Person person = new Person();
        person.setGender(Gender.fromSign(gender));
        person.setUserName(userName);
        person.setEmail(email);
        person.setPassword(password);

        new PersonDao().create(new CreatePersonSqlBuilder(), new CreatePersonSqlWriter(person));
        response.sendRedirect(request.getContextPath() + "/login.html");
    }

}