--------------------------CREACIÓN BASE DE DATOS NOTAS
Create DATABASE Notas
Use Notas

--------------------------Creacion de la tabla Alumnos
CREATE TABLE  Alumnos(
id_Alumno INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR (20) NOT NULL,
apellido_P VARCHAR (20) NOT NULL,
apellido_M VARCHAR (20) NOT NULL
)

----------------------Creacion de la tabla Alumnos
CREATE TABLE Profesores(
id_Profesor INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(20) NOT NULL,
apellido_P VARCHAR(20) NOT NULL,
apellido_M VARCHAR(20) NOT NULL
)
-----------------------Creacion de la tabla Materias
CREATE TABLE Materias(
id_Materia INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
materia VARCHAR(20) NOT NULL,
id_Profesor INT NOT NULL,
CONSTRAINT fk_profesor FOREIGN KEY (id_Profesor) REFERENCES Profesores(id_Profesor) ON DELETE CASCADE ON UPDATE CASCADE
)

------------------------Creacion de la tabla Calificaciones
CREATE TABLE Calificaciones (
id_Calificacion INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
calificacion INT NOT NULL,
id_Alumno INT NOT NULL,
id_Materia INT NOT NULL,
CONSTRAINT fk_alumno FOREIGN KEY (id_Alumno) REFERENCES Alumnos (id_Alumno) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT fk_materia FOREIGN KEY (id_Materia) REFERENCES Materias (id_Materia) ON DELETE CASCADE ON UPDATE CASCADE 
)

--------------------INSERCIONES TABLAS
show create table Calificaciones
alter table Calificaciones drop fk_alumno  
drop table Alumnos

-----------Agregar Alumnos--------------
INSERT INTO Alumnos VALUES 
(1,'Santos','Ocejo','Flores'),
(2,'Juan', 'Perez', 'Garcia'),
(3,'Jose', 'Diaz', 'Juarez'),
(4,'Pedro', 'Sandoval', 'Juarez'),
(5,'Hugo', 'Zamora', 'Reyes'),
(6,'David', 'Zamora', 'Segura'),
(7,'Daniela', 'Garcia', 'Garcia'),
(8,'Elizabeth', 'Rodriguez', 'Martinez'),
(9,'Elizabeth', 'Rodriguez', 'Martinez'),
(10,'Manuel', 'Ozuna', 'Luevanos'),
(11,'Rubi','Ocejo','Flores'),
(12,'Marco', 'Perez', 'Garcia'),
(13,'Manolo', 'Diaz', 'Juarez'),
(14,'Sergio', 'Sandoval', 'Juarez'),
(15,'Armando', 'Zamora', 'Reyes'),
(16,'Raul', 'Zamora', 'Segura'),
(17,'Tomas', 'Garcia', 'Garcia'),
(18,'Elias', 'Rodriguez', 'Martinez'),
(19,'Tito', 'Rodriguez', 'Martinez'),
(20,'Josue', 'Ozuna', 'Luevanos');

-----------Agregar Profesores--------------
INSERT INTO Profesores VALUES
(1,'Pedro','Madero','Alaniz'),
(2,'Jose','Madero','Panda');

-----------Agregar Materias--------------
INSERT INTO Materias VALUES
 (1, 'Matematicas',4),
 (2,'Programacion',1);
 
-----------Agregar Calificaciones--------------
INSERT INTO Calificaciones VALUES
(1, 98 , 1, 1 ),
(2, 77, 1, 2),

(3, 99 , 2, 1 ),
(4, 70 , 2, 2 ),

(5, 67 , 3, 1 ),
(6, 77 , 3, 2 ),

(7, 88 , 4, 1 ),
(8, 100 , 4, 2 ),

(9, 90 , 5, 1 ),
(10, 90 , 5, 2 ),

(11, 67 , 6, 1 ),
(12, 67 , 6, 2 ),

(13, 87 , 7, 1 ),
(14, 67 , 7, 2 ),

(15, 89 , 8, 1 ),
(16, 67 , 8, 2 ),

(17, 80 , 9, 1 ),
(18, 67 , 9, 2 ),

(19, 60 , 10, 1 ),
(20, 67 , 10, 2 ),

(21, 55 , 11, 1 ),
(22, 67 , 11, 2 ),

(23, 59 , 12, 1 ),
(24, 67 , 12, 2 ),

(25, 90 , 13, 1 ),
(26, 67 , 13, 2 ),

(27, 99 , 14, 1 ),
(28, 67 , 14, 2 ),

(29, 99 , 15, 1 ),
(30, 89 , 15, 2 ),

(31, 90 , 16, 1),
(32, 88 , 16, 2 ),

(33, 100 , 17, 1),
(34, 66 , 17, 2 ),

(35, 82 , 18, 1),
(36, 99 , 18, 2 ),

(37, 87 , 19, 1),
(38, 90 , 19, 2 ),

(39, 88 , 20, 1),
(40, 88 , 20, 2 ),


-----------------Consulta para obtener los mejores 10 promedios----------------------

SELECT A.nombre,
	   A.apellido_P,
	   A.apellido_M,
	   AVG(C.calificacion) AS Promedio
  FROM Alumnos A,
  	   Calificaciones C
 WHERE C.Id_Alumno= A.Id_Alumno
 GROUP BY  A.nombre,A.apellido_P,A.apellido_M
 ORDER BY AVG(C.calificacion) DESC
 LIMIT 10
 
 
 
 
 