### Modelos: Curso / Tema

un curso puede tener varios temas: "1 a muchos"

## la clase curso tiene los atributos id_curso, nombre, 
modalidad, fecha_finalización, listaDeTemas

la clase tema tiene los atributos id_tema, nombre, descripcion

A partir de esto, el estudiante desea desarrollar una API 
que le permita realizar las siguientes acciones:

//Crear un nuevo curso
//Crear temas y asociar a un curso
//Obtener todos los cursos
//Obtener todos los temas de un determinado curso
//Obtener todos los cursos que contengan como nombre la palabra “Java”
// (puede contener otras palabras, por ejemplo, Introducción a Java, 
Java avanzado, Java para principiantes, etc).
//Modificar los datos de un curso
//Modificar los datos de un determinado tema


Todas las consignas

//Ejercicio Nº 1 – Estudiante de Programación
//
//Un estudiante de programación desea llevar control de los temas que aprendió
// en diferentes cursos para luego poderlos incluir en su curriculum vitae.
// Para ello, creó una base de datos llamada cursos.
// A partir de la creación de la base de datos, empezó con el desarrollo de una aplicación 
y realizó el modelado de dos clases: Curso
// y Tema, en donde un curso puede contener varios temas (relación 1 a muchos).
//
//La clase curso tiene los siguientes atributos: id_curso, nombre, modalidad,
fecha_finalización, listaDeTemas
//La clase tema tiene los siguientes atributos: id_tema, nombre, descripcion
//A partir de esto, el estudiante desea desarrollar una API que le permita realizar 
las siguientes acciones:
//
//Crear un nuevo curso
//Crear temas y asociar a un curso
//Obtener todos los cursos
//Obtener todos los temas de un determinado curso
//Obtener todos los cursos que contengan como nombre la palabra “Java”
// (puede contener otras palabras, por ejemplo, Introducción a Java, Java avanzado, Java para principiantes, etc).
//Modificar los datos de un curso
//Modificar los datos de un determinado tema
//Para realizar cada uno de los endpoints considerar los métodos HTTP correspondientes según
// la acción que sea necesaria llevar a cabo. Al mismo tiempo, contemplar el uso de DTOs para las respuestas y
// todas las buenas prácticas que creas que puedan ser aplicadas. Utilizar JPA + Hibernate
// para el CRUD de datos en una base de datos MySQL.