# Reto-yourStore

## Indice

- (#Descripción de la automatización)
- (#Ejecución de la automatización)
  - (#Contexto de la automatización)
  - (#Forma de ejecución)
 
## Descripción de la automatización

La automatización se hace con el lenguaje Java, utilizando el framework Sereneity BDD con un patrón de diseño Screen play.
Esta se desarrolló desde un principio en el navegador Chrome, por lo que para su ejecución se recomienda que se tenga descargado este navegador y actualizado para tener la mayor compatibilidad con el sistema, ya que se usa el web driver proporcionado por bonigarcia, el cual va con la ultima versión del navegador.

## Ejecución de la automatización

## Contexto de la automatización

La automatización se codificó con Java 11 por lo que se recomienda el uso de esta versión para tener la ejecución esperada de esta, esto se puede verificar en IntelliJ, en la parte superior izquierda se encuentra la palabra File, al clickarla se despliega un menú en el cual una de las opciones dice Project Structure.

![Project Structure](https://github.com/user-attachments/assets/5ad1da53-eccc-40cf-8a31-185617592272)

Con la imágen de apoyo puede ser un poco más fácil llegar al lugar en donde podrémos revisar si la versión de Java es la indicada, pues deberíamos quedar con esta pantalla en el Intellij


![SDK](https://github.com/user-attachments/assets/7758f8f0-26ca-4c78-97f2-7693e62d0e55)

Acá en el apartado de SDK podemos ver con que Java se estaría ejecutando desde IntelliJ si este no dice 11 podemos seleccioanrlo ahí mismo, en caso de no poseerlo dará la opción de descargarlo, al hacerlo desde esta opción no hay necesidad de cambiar las variables de entorno del equipo

## Forma de ejecución

La automatización se puede ejecutar desde el mismo IntelliJ, a mano izquierda veremos las carpetas que conforman la automatización

![Carpetas](https://github.com/user-attachments/assets/578d37a3-ac50-4a66-b198-c5073be1b571)

En estas vamos a buscar la que dice src y le daremos doble click

![SRC](https://github.com/user-attachments/assets/80436976-ffc0-4bfb-9ca6-df5fcf6eee59)

![main-test](https://github.com/user-attachments/assets/e730edce-7ade-429d-9337-ccbbd0e7cb28)

Como se puede apreciar en la imagen anterior nos mostrará dos carpetas más, daremos doble click en la que dice test

![test](https://github.com/user-attachments/assets/40ee1649-8547-4984-b962-be8bf516eb50)

![java](https://github.com/user-attachments/assets/3fc10f5d-6172-4b58-b0a5-16125223c9ef)

Ahora nos mostrará dos carpetas más ahora daremos click en la carpeta que dice Java

![com sofka](https://github.com/user-attachments/assets/3b0a5223-d116-489a-b372-505a308e88d4)

![stepDefinitios](https://github.com/user-attachments/assets/af58fd56-684c-48d3-b185-d834f63ac455)

Nos muestra más carpetas, ya estamos cerca de poder ejecutarlo, deberíamos estar viendo las carpetas de la segunda imágen, solo queda abrir una más que es la carpeta llamada runners

![runners](https://github.com/user-attachments/assets/76c99c20-b4ef-40c9-a7b2-379af721e574)

![runners desplegado](https://github.com/user-attachments/assets/5bbcf3a4-2ac9-47f1-be3d-f373f41f65f6)

Ya solo faltaría darle al archivo que lleva por nombre Runner

![runner](https://github.com/user-attachments/assets/cea9b992-4ede-4f00-9cbf-02f8b81303d8)

Al momento de abrir este archivo nos debería abrir un archivo, nos iremos a la parte izquierda del archivo y a la derecha de las carpetas

![Ejecucion](https://github.com/user-attachments/assets/db3eee04-0e7d-4320-8179-bf2e2985c706)

Al momento de darle click a este simbolo de reproducir la automatización iniciará su ejecución con el navegador de chrome


