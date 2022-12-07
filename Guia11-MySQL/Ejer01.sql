
/*
1. Obtener los datos completos de los empleados.
*/

SELECT *
from empleado;

/*
2. Obtener los datos completos de los departamentos.
*/

select *
from departamento;

/*
3. Listar el nombre de los departamentos. 
*/

select nombre_depto
from departamento;

/*
4. Obtener el nombre y salario de todos los empleados.
*/

select  nombre, salario
from	empleado;

/*
5. Listar todas las comisiones.
*/

select comision
from empleado;

/*
6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.
*/

select	*
from	empleado
where cargo = 'Secretaria';

/*
7. Obtener los datos de los empleados vendedores, ordenados por nombre
alfabéticamente.
*/

select	*
from	empleado
order by nombre;

/*
8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a
mayor.
*/

select nombre, cargo, salario
from	empleado
order by salario;

/*
9. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las
respectivas tablas de empleados.
*/

select nombre, cargo
from empleado;

/*
10. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado
por comisión de menor a mayor.
*/

select nombre, salario, comision
from empleado
where id_depto = 2000
order by comision;

/*
11. Obtener el valor total a pagar que resulta de sumar el salario y la comisión de los
empleados del departamento 3000 una bonificación de 500, en orden alfabético del
empleado.
*/

select nombre, salario + comision + 500 as 'total a pagar'
from empleado   
where id_depto = 3000
order by nombre;

/*
12. Muestra los empleados cuyo nombre empiece con la letra J.
*/

select nombre
from empleado
where nombre like 'j%';

/*
13. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos
empleados que tienen comisión superior a 1000.
*/

select nombre, salario, comision, salario + comision as 'Salario total'
from empleado
where comision >= 1000;

/*
14. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen
comisión.
*/

select nombre, salario, comision, salario + comision as 'Salario total'
from empleado
where comision = 0;

/*
15. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.
*/

select *
from empleado
where comision > salario;

/*
16. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.
*/

select *
from empleado
where comision <= (salario*0.3);

/*
17. Hallar los empleados cuyo nombre no contiene la cadena “MA”
*/

select *
from empleado
where nombre not like '%MA%';

/*
18. Obtener los nombres de los departamentos que sean “Ventas” ni “Investigación” ni
‘Mantenimiento.
*/

select nombre, cargo, id_depto
from empleado
where cargo = 'vendedor' or cargo = 'investigador' or cargo = 'mecanico';

select nombre, cargo, id_depto
from empleado
where cargo in ('vendedor', 'mecanico', 'investigador');

/*
19. Ahora obtener los nombres de los departamentos que no sean “Ventas” ni
“Investigación” ni ‘Mantenimiento.
*/

select nombre, cargo, id_depto
from empleado
where cargo not in ('vendedor', 'mecanico', 'investigador');

/*
20. Mostrar el salario más alto de la empresa.
*/

select max(salario) 
from empleado;

select *
from empleado
where salario = (select max(salario) 
from empleado);

/*
21. Mostrar el nombre del último empleado de la lista por orden alfabético.
*/

select *
from empleado
order by nombre desc limit 1;

select *
from empleado
where id_empleado in (802);

/*
22. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
*/

select max(salario) as 'max', min(salario) as 'min', max(salario) - min(salario) as 'diferencia' 
from empleado;

/*
22. Hallar el salario más alto, el más bajo y la diferencia entre ellos.
*/

select max(salario) as 'max', min(salario) as 'min', max(salario) - min(salario) as 'diferencia' 
from empleado;

select *
from empleado
where salario = (select	max(salario) from empleado) or salario = (select	min(salario) from empleado) ;

/*
23. Hallar el salario promedio por departamento.
*/

select id_depto, avg(salario), count(*)
from empleado
group by id_depto
order by count(*);

/*
24. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de
empleados de esos departamentos.
*/

select id_depto, count(*)
from empleado
group by id_depto
having count(*) >= 3
order by count(*);

/*
25. Mostrar el código y nombre de cada jefe, junto al número de empleados que dirige.
Solo los que tengan más de dos empleados (2 incluido).
*/

select cod_jefe, count(*) as 'cantidad de empleados'
from empleado
group by cod_jefe
having count(*) >= 2;


/*
26. Hallar los departamentos que no tienen empleados
*/

select d.id_depto, count(*) as 'cantidad de empleados'
from empleado e, departamento d
where d.id_depto = e.id_depto
group by id_depto
having count(*) = 0;

/*
27. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la
empresa. Ordenarlo por departamento.
*/

select *
from empleado
where salario >= (select avg(salario) from empleado)
order by id_depto;