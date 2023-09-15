/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.charlycimino.ejemplos.colorapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/respuesta")
public class ColorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        // Obtengo los parámetros del cliente        
        String nombre = req.getParameter("nombre");
        String colorFondo = req.getParameter("colorFondo");
        String colorLetra = req.getParameter("colorLetra");
        
        // Le pido al 'requestDispatcher' que redireccione al .jsp
        req.getRequestDispatcher("magia.jsp").forward(req, resp);
    }
}
