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
public class ValleDelCauca implements Estadistica{
    
    @Override
    public String fotoRepresenta() {
        String text = "            <h2 class=\"titulo\">Valle Del Cauca</h2>\n" +
                    "            <div class=\"contenedor-sobre-nosotros\">\n" +
                    "                <img src=\"https://i2.wp.com/www.calibacana.com/wp-content/uploads/valle_del_cauca-990x557.jpg?fit=990%2C557&ssl=1\" alt=\"\" class=\"imagen-about-us\">\n";

        return text;
    }

    @Override
    public String infectadoConfirmado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://pbs.twimg.com/profile_images/1084977896236695552/cuDR6VnS_400x400.jpg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Confirmados</h4>\n" +
                    "                        <p>25.628 Personas Registradas con Covid</p>\n" +
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
                    "                        <p>14.411 Personas Recuperadas Actualmente</p>\n" +
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
                    "                        <p>980 Personas Muertas</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String primerSectorInfectado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://ep01.epimg.net/internacional/imagenes/2019/09/26/colombia/1569453215_221179_1569602784_noticia_normal.jpg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Cali</h4>\n" +
                    "                        <p>7.485 Casos Confirmados</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String segundoSectorInfectado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://upload.wikimedia.org/wikipedia/commons/9/9a/Buga_desde_el_faro.JPG\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Buga</h4>\n" +
                    "                        <p>1.343 Casos Confirmados</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }

    @Override
    public String tercerSectorInfectado() {
        String text = "                <div class=\"card\">\n" +
                    "                    <img src=\"https://supernoticiasdelvalle.com/wp-content/uploads/2016/02/bgde.jpg\" alt=\"\">\n" +
                    "                    <div class=\"contenido-texto-card\">\n" +
                    "                        <h4>Bugalagrande</h4>\n" +
                    "                        <p>1.120 Casos Confirmados</p>\n" +
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
                    "                        <p>23.170 Personas en Casa</p>\n" +
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
                    "                        <p>143 Personas en UCI (Unidad de Cuidados Intensivos)</p>\n" +
                    "                    </div>\n" +
                    "                </div>\n";
        return text;
    }
    
}
