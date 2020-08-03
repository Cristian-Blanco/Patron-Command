/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Command.*;
import Invoker.*;
import Receiver.*;
/**
 *
 * @author Cristian
 */
@WebServlet(name = "LandingPage", urlPatterns = {"/LandingPage"})
public class LandingPage extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        response.setContentType("text/html;charset=UTF-8");              
                
            
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("    <meta charset=\"UTF-8\">\n" +
                        "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                        "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                        "    <title>ColombiaCovid</title>\n" +
                        "    <link rel=\"shortcut icon\" href=\"https://images.vexels.com/media/users/3/193114/isolated/preview/0be3590284a8dc5f1646b64816e2eb6e-covid-stop-badge-by-vexels.png\" type=\"image/x-icon\">\n" +
                        "    <link rel=\"stylesheet\" href=\"css/estilos.css\">\n" +
                        "    <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,700,800&display=swap\" rel=\"stylesheet\">");            
            out.println("</head>");
            out.println("<body>");
            out.println(" <header>\n" +
                    "        <nav>\n" +
                    "            <a href=\"index.jsp\">Inicio</a>\n" +
                    "        </nav>\n" +
                    "        <section class=\"textos-header\">\n" +
                    "            <h1>Covid-19 En Colombia</h1>\n" +
                    "            <h2>Informate de los casos registrados en la actualidad</h2>\n" +
                    "        </section>\n" +
                    "        <div class=\"wave\" style=\"height: 150px; overflow: hidden;\"><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\"\n" +
                    "                style=\"height: 100%; width: 100%;\">\n" +
                    "                <path d=\"M0.00,49.98 C150.00,150.00 349.20,-50.00 500.00,49.98 L500.00,150.00 L0.00,150.00 Z\"\n" +
                    "                    style=\"stroke: none; fill: #fff;\"></path>\n" +
                    "            </svg></div>\n" +
                    "    </header>\n" +
                    "    <main>\n");
            
            if(request.getParameter("city").equals("bogota")){
                Command command = new CantidadInfectado(new Bogota());
                Invoker selection = new Invoker(command);
                out.println("        <section class=\"contenedor sobre-nosotros\">\n" + selection.runPicture());
                
            } else if(request.getParameter("city").equals("atlantico")){
                Command command = new CantidadInfectado(new Atlantico());
                Invoker selection = new Invoker(command);
                out.println("        <section class=\"contenedor sobre-nosotros\">\n" + selection.runPicture());
            } else if(request.getParameter("city").equals("antioquia")){
                Command command = new CantidadInfectado(new Antioquia());
                Invoker selection = new Invoker(command);
                out.println("        <section class=\"contenedor sobre-nosotros\">\n" + selection.runPicture());
            } else if(request.getParameter("city").equals("bolivar")){
                Command command = new CantidadInfectado(new Bolivar());
                Invoker selection = new Invoker(command);
                out.println("        <section class=\"contenedor sobre-nosotros\">\n" + selection.runPicture());
            }   else if(request.getParameter("city").equals("valle")){
                Command command = new CantidadInfectado(new ValleDelCauca());
                Invoker selection = new Invoker(command);
                out.println("        <section class=\"contenedor sobre-nosotros\">\n" + selection.runPicture());
            }
            out.println(//"        <section class=\"contenedor sobre-nosotros\">\n" + //selection.runPicture() +
                    "                <div class=\"contenido-textos\">\n" +
                    "                    <h3><span>1</span>Protegete a ti y a tu familia</h3>\n" +
                    "                    <h3><span>2</span>Usa siempre el tapabocas al salir</h3>\n" +
                    "                    <h3><span>3</span>Evita el contacto con otras personas</h3>\n" +
                    "                    <h3><span>4</span>Lavate siempre las manos</h3>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "        </section>\n" +
                    "        <section class=\"clientes contenedor\">\n" +
                    "            <h2 class=\"titulo\">Informacion</h2>\n");
            
                
            if(request.getParameter("city").equals("bogota")){
                if(request.getParameter("selection").equals("1")){Command command = new CantidadInfectado(new Bogota()); Invoker selection = new Invoker(command); 
                    out.println("            <div class=\"cards\">\n" + selection.correr());
                }
                else if(request.getParameter("selection").equals("2")){Command command = new MostrarSectores(new Bogota()); Invoker selection = new Invoker(command); 
                    out.println("            <div class=\"cards\">\n" + selection.correr());
                }
                else if(request.getParameter("selection").equals("3")){Command command = new CuarentenaPersona(new Bogota()); Invoker selection = new Invoker(command); 
                    out.println("            <div class=\"cards\">\n" + selection.correr());
                }
            }else if(request.getParameter("city").equals("atlantico")){
                if(request.getParameter("selection").equals("1")){Command command = new CantidadInfectado(new Atlantico()); Invoker selection = new Invoker(command); 
                    out.println("            <div class=\"cards\">\n" + selection.correr());
                }
                else if(request.getParameter("selection").equals("2")){Command command = new MostrarSectores(new Atlantico()); Invoker selection = new Invoker(command); 
                    out.println("            <div class=\"cards\">\n" + selection.correr());
                }
                else if(request.getParameter("selection").equals("3")){Command command = new CuarentenaPersona(new Atlantico()); Invoker selection = new Invoker(command); 
                    out.println("            <div class=\"cards\">\n" + selection.correr());
                }
            }else if(request.getParameter("city").equals("antioquia")){
                if(request.getParameter("selection").equals("1")){Command command = new CantidadInfectado(new Antioquia()); Invoker selection = new Invoker(command); 
                    out.println("            <div class=\"cards\">\n" + selection.correr());
                }
                else if(request.getParameter("selection").equals("2")){Command command = new MostrarSectores(new Antioquia()); Invoker selection = new Invoker(command); 
                    out.println("            <div class=\"cards\">\n" + selection.correr());
                }
                else if(request.getParameter("selection").equals("3")){Command command = new CuarentenaPersona(new Antioquia()); Invoker selection = new Invoker(command); 
                    out.println("            <div class=\"cards\">\n" + selection.correr());
                }
            }else if(request.getParameter("city").equals("bolivar")){
                if(request.getParameter("selection").equals("1")){Command command = new CantidadInfectado(new Bolivar()); Invoker selection = new Invoker(command); 
                    out.println("            <div class=\"cards\">\n" + selection.correr());
                }
                else if(request.getParameter("selection").equals("2")){Command command = new MostrarSectores(new Bolivar()); Invoker selection = new Invoker(command); 
                    out.println("            <div class=\"cards\">\n" + selection.correr());
                }
                else if(request.getParameter("selection").equals("3")){Command command = new CuarentenaPersona(new Bolivar()); Invoker selection = new Invoker(command); 
                    out.println("            <div class=\"cards\">\n" + selection.correr());
                }
            }else if(request.getParameter("city").equals("valle")){
                if(request.getParameter("selection").equals("1")){Command command = new CantidadInfectado(new ValleDelCauca()); Invoker selection = new Invoker(command); 
                    out.println("            <div class=\"cards\">\n" + selection.correr());
                }
                else if(request.getParameter("selection").equals("2")){Command command = new MostrarSectores(new ValleDelCauca()); Invoker selection = new Invoker(command); 
                    out.println("            <div class=\"cards\">\n" + selection.correr());
                }
                else if(request.getParameter("selection").equals("3")){Command command = new CuarentenaPersona(new ValleDelCauca()); Invoker selection = new Invoker(command); 
                    out.println("            <div class=\"cards\">\n" + selection.correr());
                }
            }
            
            out.println(//"            <div class=\"cards\">\n" + //selection.correr() +
                    "            </div>\n" +
                    "        </section>\n" +
                    "        <section class=\"portafolio\">\n" +
                    "            <div class=\"contenedor\">\n" +
                    "                <h2 class=\"titulo\">Sintomas</h2>\n" +
                    "                <div class=\"galeria-port\">\n" +
                    "                    <div class=\"imagen-port\">\n" +
                    "                        <img src=\"https://www.tododisca.com/wp-content/uploads/2020/05/temometro-mascarilla.jpg\" alt=\"\">\n" +
                    "                        <div class=\"hover-galeria\">\n" +
                    "                            <img src=\"img/icono1.png\" alt=\"\">\n" +
                    "                            <p>Fiebre</p>\n" +
                    "                        </div>\n" +
                    "                    </div>\n" +
                    "                    <div class=\"imagen-port\">\n" +
                    "                        <img src=\"https://www.pharysol.es/wp-content/uploads/2017/11/tipos-tos-1.png\" alt=\"\">\n" +
                    "                        <div class=\"hover-galeria\">\n" +
                    "                            <img src=\"img/icono1.png\" alt=\"\">\n" +
                    "                            <p>Tos seca</p>\n" +
                    "                        </div>\n" +
                    "                    </div>\n" +
                    "                    <div class=\"imagen-port\">\n" +
                    "                        <img src=\"https://www.eluniversal.com.mx/sites/default/files/FATIGA_CR%C3%93NICA_Drupal%20Main%20Image.var_1580452173.jpg\" alt=\"\">\n" +
                    "                        <div class=\"hover-galeria\">\n" +
                    "                            <img src=\"img/icono1.png\" alt=\"\">\n" +
                    "                            <p>Cansancio</p>\n" +
                    "                        </div>\n" +
                    "                    </div>\n" +
                    "                    <div class=\"imagen-port\">\n" +
                    "                        <img src=\"https://www.webconsultas.com/sites/default/files/styles/wc_adaptive_image__small/public/temas/dolor_de_garganta.jpg\" alt=\"\">\n" +
                    "                        <div class=\"hover-galeria\">\n" +
                    "                            <img src=\"img/icono1.png\" alt=\"\">\n" +
                    "                            <p>Dolor de garganta</p>\n" +
                    "                        </div>\n" +
                    "                    </div>\n" +
                    "                    <div class=\"imagen-port\">\n" +
                    "                        <img src=\"https://sumedico.blob.core.windows.net/images/2019/08/19/migranacefalea-focus-0.22-0.25-983-557.jpg\" alt=\"\">\n" +
                    "                        <div class=\"hover-galeria\">\n" +
                    "                            <img src=\"img/icono1.png\" alt=\"\">\n" +
                    "                            <p>Dolor de cabeza</p>\n" +
                    "                        </div>\n" +
                    "                    </div>\n" +
                    "                    <div class=\"imagen-port\">\n" +
                    "                        <img src=\"https://ichef.bbci.co.uk/news/976/cpsprodpb/3D13/production/_104253651_nariz-gusto.png\" alt=\"\">\n" +
                    "                        <div class=\"hover-galeria\">\n" +
                    "                            <img src=\"img/icono1.png\" alt=\"\">\n" +
                    "                            <p>Perdida del sentido del olfato o gusto</p>\n" +
                    "                        </div>\n" +
                    "                    </div>\n" +
                    "                </div>\n" +
                    "            </div>\n" +
                    "        </section>");
            out.println("</body>");
            out.println("</html>");
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
