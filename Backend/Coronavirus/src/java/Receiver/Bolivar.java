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
public class Bolivar implements Estadistica{
    
    @Override
    public String fotoRepresenta() {
        String text = "            <h2 class=\"titulo\">Bolivar</h2>\n" +
                    "            <div class=\"contenedor-sobre-nosotros\">\n" +
                    "                <img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/Cartagena_de_Indias_desde_el_cerro_La_Popa.jpg/1200px-Cartagena_de_Indias_desde_el_cerro_La_Popa.jpg\" alt=\"\" class=\"imagen-about-us\">\n";

        return text;
    }

    @Override
    public String infectadoConfirmado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://pbs.twimg.com/profile_images/1084977896236695552/cuDR6VnS_400x400.jpg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Confirmados</h4>\n" +
                    "                        <p>18.861 Personas Registradas con Covid</p>\n" +
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
                    "                        <p>13.876 Personas Recuperadas Actualmente</p>\n" +
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
                    "                        <p>596 Personas Muertas</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String primerSectorInfectado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://static.hosteltur.com/app/public/uploads/img/articles/2018/11/01/L_5c1aa2845299b_240290-yellow-street-cartagena.jpg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Cartagena de Indias</h4>\n" +
                    "                        <p>6.813 Casos Confirmados</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String segundoSectorInfectado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://s3.amazonaws.com/rtvc-assets-canalinstitucional.tv/s3fs-public/images/carmen_de_bolivar.jpg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>El Carmen de Bolivar</h4>\n" +
                    "                        <p>1.419 Casos Confirmados</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String tercerSectorInfectado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://www.viajarenverano.com/wp-content/uploads/2015/02/IglArjo.png\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Arjona</h4>\n" +
                    "                        <p>1.054 Casos Confirmados</p>\n" +
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
                    "                        <p>1.541 Personas hospitalizadas</p>\n" +
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
                    "                        <p>17.222 Personas en Casa</p>\n" +
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
                    "                        <p>98 Personas en UCI (Unidad de Cuidados Intensivos)</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }
}
