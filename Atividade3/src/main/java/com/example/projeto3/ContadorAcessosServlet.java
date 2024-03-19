package com.example.projeto3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/contador")

public class ContadorAcessosServlet extends HttpServlet {

    Integer contador = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        contador++;
        resp.getWriter().println("Número de acessos: " + contador);

    }
}
