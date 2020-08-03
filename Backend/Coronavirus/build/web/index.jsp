<%-- 
    Document   : index
    Created on : 3/08/2020, 12:47:59 PM
    Author     : Cristian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>ColombiaCovid</title>
        <link rel="icon"  type="image/png" href="https://images.vexels.com/media/users/3/193114/isolated/preview/0be3590284a8dc5f1646b64816e2eb6e-covid-stop-badge-by-vexels.png">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="css/styles.css">
    </head>
    <body>
       
        <div class="container">
            <form action="LandingPage" class="form">
                <div class="form-header">
                    <h1 class="form-title"><span>Covid-19 en Colombia</span></h1>
                    <h3 class="form-title"><span>Informate ahora mismo</span></h3>
                </div>

                <div class="form-group">
                    <label for="weight" class="form-label">Que Departamento o Ciudad Deseas Ver:</label>
                        <select class="form-control list" id="city" name="city">
                            <option value="bogota">Bogotá</option>
                            <option value="atlantico">Atlántico</option>
                            <option value="antioquia">Antioquia</option>
                            <option value="bolivar">Bolivar</option>
                            <option value="valle">Valle del Cauca</option>
                        </select>
                </div> 

                <div class="form-group">
                <label for="weight" class="form-label">Que informacion deseas ver:</label>
                
                    <select class="form-control list" id="selection" name="selection">
                        <option value="1">Cantidad de Infectados</option>
                        <option value="2">Sectores con más Contagiados</option>
                        <option value="3">Lugar de Cuarentena</option>
                    </select>
                </div> 

                <input type="submit" value="Continuar" class="button-submit">

            </form>
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </body>
</html>
