package hu.ak_akademia.buddyfinder.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hu.ak_akademia.buddyfinder.dao.PersonDao;
import hu.ak_akademia.buddyfinder.dao.sql.SelectPersonByEmailAndPasswordSqlReader;
import hu.ak_akademia.buddyfinder.dto.Person;
import hu.ak_akademia.buddyfinder.util.PasswordEncrypter;

public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        password = PasswordEncrypter.getSHA512SecurePassword(password, "thisIsSalt");

        Person person = new Person();
        person.setEmail(email);
        person.setPassword(password);

        Person loggedInUser = new PersonDao().readSingle(new SelectPersonByEmailAndPasswordSqlBuilder(), new SelectPersonByEmailAndPasswordSqlWriter(person),
                new SelectPersonByEmailAndPasswordSqlReader());
        if (loggedInUser == null) {
            response.sendRedirect(request.getContextPath() + "/invalidLoginAttempt.html");
        } else {
            HttpSession session = request.getSession(true);
            session.setAttribute("loggedInUser", loggedInUser);
            response.sendRedirect(request.getContextPath() + "/buddyfinder/mainMenu.jsp");
        }
    }

}