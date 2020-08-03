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
public class Atlantico implements Estadistica{
    
    @Override
    public String fotoRepresenta() {
        String text = "            <h2 class=\"titulo\">Atlantico</h2>\n" +
                    "            <div class=\"contenedor-sobre-nosotros\">\n" +
                    "                <img src=\"https://upload.wikimedia.org/wikipedia/commons/1/19/Barranquilla_nocturna.jpg\" alt=\"\" class=\"imagen-about-us\">\n";

        return text;
    }

    @Override
    public String infectadoConfirmado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://pbs.twimg.com/profile_images/1084977896236695552/cuDR6VnS_400x400.jpg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Confirmados</h4>\n" +
                    "                        <p>53.131 Personas Registradas con Covid</p>\n" +
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
                    "                        <p>38.624 Personas Recuperadas Actualmente</p>\n" +
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
                    "                        <p>2.545 Personas Muertas</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String primerSectorInfectado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://static.iris.net.co/dinero/upload/images/2020/5/4/285951_1.jpg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Barranquilla</h4>\n" +
                    "                        <p>4.206 Casos Confirmados</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String segundoSectorInfectado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://www.mantenimientoaires.com/images/municipios/aires-servicio-tecnico-Malambo.jpg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Malambo</h4>\n" +
                    "                        <p>2.107 Casos Confirmados</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String tercerSectorInfectado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://www.eltiempo.com/files/image_640_428/files/crop/uploads/2017/04/03/58e26290bea9a.r_1491231545062.63-176-3000-1644.jpeg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Puerto Colombia</h4>\n" +
                    "                        <p>1.514 Casos Confirmados</p>\n" +
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
                    "                        <p>3.215 Personas hospitalizadas</p>\n" +
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
                    "                        <p>49.800 Personas en Casa</p>\n" +
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
                    "                        <p>116 Personas en UCI (Unidad de Cuidados Intensivos)</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }
    
}
