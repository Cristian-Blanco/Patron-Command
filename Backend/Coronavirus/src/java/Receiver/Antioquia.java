/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receiver;

/**
 *
 * @author Cristian
 */
public class Antioquia implements Estadistica{
    
    @Override
    public String fotoRepresenta() {
        String text = "            <h2 class=\"titulo\">Antioquia</h2>\n" +
                    "            <div class=\"contenedor-sobre-nosotros\">\n" +
                    "                <img src=\"https://elturismoencolombia.com/wp-content/uploads/2018/08/jardin_antioquia_parque_libertador_colombia_travel.jpg\" alt=\"\" class=\"imagen-about-us\">\n";

        return text;
    }

    @Override
    public String infectadoConfirmado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://pbs.twimg.com/profile_images/1084977896236695552/cuDR6VnS_400x400.jpg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Confirmados</h4>\n" +
                    "                        <p>35.746 Personas Registradas con Covid</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String infectadoRecuperado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://image.flaticon.com/icons/png/512/1513/1513378.png\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Recuperados</h4>\n" +
                    "                        <p>10.976 Personas Recuperadas Actualmente</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String infectadoMuerto() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://cdn5.dibujos.net/dibujos/pintados/201814/entrada-prohibida-senales-de-trafico-11326379.jpg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Muertos</h4>\n" +
                    "                        <p>537 Personas Muertas</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String primerSectorInfectado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://www.futbolred.com/files/article_main/uploads/2020/05/29/5ed193de4ae3f.jpeg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Medellin</h4>\n" +
                    "                        <p>14.753 Casos Confirmados</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String segundoSectorInfectado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://upload.wikimedia.org/wikipedia/commons/3/33/Bello_panoramica.jpg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Bello</h4>\n" +
                    "                        <p>1.811 Casos Confirmados</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String tercerSectorInfectado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://telemedellin.tv/wp-content/uploads/2020/06/1556821102_600418_1556821337_noticia_normal.jpg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Itagui</h4>\n" +
                    "                        <p>1.524 Casos Confirmados</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String primerHospital() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://image.freepik.com/vector-gratis/dibujos-animados-medicos-pacientes-frente-al-hospital_43633-7246.jpg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Hospital</h4>\n" +
                    "                        <p>2.315 Personas hospitalizadas</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String segundoHospital() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://i.pinimg.com/originals/4a/6e/6b/4a6e6b93100c12532798a4b33a12d9ed.jpg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Cuarentena en Casa</h4>\n" +
                    "                        <p>33.330 Personas en Casa</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String tercerHospital() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://image.freepik.com/vector-gratis/paciente-critico-coronavirus_23-2148541756.jpg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Cuarentena en Casa</h4>\n" +
                    "                        <p>101 Personas en UCI (Unidad de Cuidados Intensivos)</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }
}
