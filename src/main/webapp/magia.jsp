<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>ColorApp</title>
        <style>
            body{
                font-size:1.3rem;
                font-family:sans-serif;
                background: ${param.colorFondo};
                color: ${param.colorLetra}
            }
        </style>
    </head>
    <body>
        <h1>Color App</h1>
        <p>Una sencilla app para demostrar el funcionamiento de Java Servlets y JSP</p>
        <h2>Otras cosas que ${nombre} debe aprender</h2>
        <ul>
            <li>HTML y CSS</li>
            <li>Algo de JS</li>
            <li><strong>Git y Github</strong></li>
        </ul>
    </body>
</html>
