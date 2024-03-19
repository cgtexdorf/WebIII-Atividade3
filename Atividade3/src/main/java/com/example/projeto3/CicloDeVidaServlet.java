package com.example.projeto3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ciclo-de-vida")

public class CicloDeVidaServlet extends HelloServlet {

    @Override
    public void init() {
        //instanciar algum recurso
        //é invocado apenas uma vez
        System.out.println("Invocou o método init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException{
        System.out.println("Invocou o método service");
    }

    @Override
    public void destroy(){
        //Liberar recursos usados
        System.out.println("Invocou o método destroy");
    }
}
