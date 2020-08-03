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
public class Bogota implements Estadistica{

    @Override
    public String fotoRepresenta() {
        String text = "            <h2 class=\"titulo\">Bogota</h2>\n" +
                    "            <div class=\"contenedor-sobre-nosotros\">\n" +
                    "                <img src=\"https://blogapi.uber.com/wp-content/uploads/2018/09/CO_X-lugares-para-visitar-en-Bogota%CC%81-que-no-te-puedes-perder-.jpg\" alt=\"\" class=\"imagen-about-us\">\n";

        return text;
    }

    @Override
    public String infectadoConfirmado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://pbs.twimg.com/profile_images/1084977896236695552/cuDR6VnS_400x400.jpg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Confirmados</h4>\n" +
                    "                        <p>105.000 Personas Registradas con Covid</p>\n" +
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
                    "                        <p>48.624 Personas Recuperadas Actualmente</p>\n" +
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
                    "                        <p>2.828 Personas Muertas</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String primerSectorInfectado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://upload.wikimedia.org/wikipedia/commons/8/8c/Avenida_de_Las_Am%C3%A9ricas_estaci%C3%B3n_Mundo_Aventura_de_Transmilenio.JPG\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Keneddy</h4>\n" +
                    "                        <p>18.248 Casos Confirmados</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String segundoSectorInfectado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://upload.wikimedia.org/wikipedia/commons/1/15/Ciclorruta_calle_111_alameda_r%C3%ADo_Molinos.JPG\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Suba</h4>\n" +
                    "                        <p>12.428 Casos Confirmados</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String tercerSectorInfectado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://www.eltiempo.com/uploads/2019/03/26/5c9a39e86230c.jpeg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Bosa</h4>\n" +
                    "                        <p>5.517 Casos Confirmados</p>\n" +
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
                    "                        <p>6.787 Personas hospitalizadas</p>\n" +
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
                    "                        <p>97.493 Personas en Casa</p>\n" +
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
                    "                        <p>720 Personas en UCI (unidad de Cuidados Intensivos)</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }
    
}
