/*
1. Lista el nombre de todos los productos que hay en la tabla producto.
*/

select nombre
from producto;

/*
2. Lista los nombres y los precios de todos los productos de la tabla producto.
*/

select nombre, precio
from producto;

/*
3. Lista todas las columnas de la tabla producto.
*/

select *
from producto;

/*
4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando
el valor del precio.
*/

select nombre, round(precio) as 'Precio'
from producto
order by precio;

/*
5. Lista el código de los fabricantes que tienen productos en la tabla producto.
*/

select f.nombre, count(*) as 'cantidad'
from fabricante f, producto p
where f.codigo = p.codigo_fabricante
group by f.nombre
order by count(*) desc;

/*
6. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar
los repetidos.
*/

select f.nombre
from fabricante f, producto p
where f.codigo = p.codigo_fabricante
group by f.nombre;

/*
7. Lista los nombres de los fabricantes ordenados de forma ascendente.
*/

select nombre
from fabricante
order by nombre;

/*
8. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma
ascendente y en segundo lugar por el precio de forma descendente.
*/

select nombre, precio
from producto
order by nombre, precio desc;

/*
9. Devuelve una lista con las 5 primeras filas de la tabla fabricante.
*/

select nombre
from fabricante limit 5;

/*
10. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas
ORDER BY y LIMIT)
*/

select nombre, precio
from producto
order by precio asc limit 1;

/*
11. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER
BY y LIMIT)
*/

select nombre, precio
from producto
order by precio desc limit 1;

/*
12. Lista el nombre de los productos que tienen un precio menor o igual a $120.
*/

select nombre, precio
from producto
where precio <= 120;

/*
13. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador
BETWEEN.
*/

select *
from producto
where precio between 60 AND 200;

/*
15. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil
en el nombre.
*/

select *
from producto
where nombre like '%portatil%';

/*
16. Devuelve una lista con el código del producto, nombre del producto, código del fabricante
y nombre del fabricante, de todos los productos de la base de datos.
*/

select p.nombre, p.codigo as 'codigo producto', f.codigo as 'Codigo fabricante', f.nombre
from producto p inner join fabricante f on (p.codigo_fabricante = f.codigo);

/*
17. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos
los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por
orden alfabético.
*/

select p.nombre, p.precio, f.nombre
from producto p, fabricante f
where p.codigo_fabricante = f.codigo
order by f.nombre;

select p.nombre, p.precio, f.nombre
from producto p inner join fabricante f on (p.codigo_fabricante = f.codigo)
order by f.nombre;

/*
18. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto
más barato.
*/

select p.nombre, p.precio, f.nombre
from producto p inner join fabricante f on (p.codigo_fabricante = f.codigo)
order by p.precio limit 1;

/*
19. Devuelve una lista de todos los productos del fabricante Lenovo.
*/

select p.nombre, p.precio, p.codigo as 'codigo de producto'
from producto p inner join fabricante f on (p.codigo_fabricante = f.codigo)
where lower(f.nombre)  = 'lenovo';

/*
20. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio
mayor que $200.
*/

select *
from producto p inner join fabricante f on (p.codigo_fabricante = f.codigo)
where f.nombre = 'Crucial' and precio > 200;

/*
21. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard.
Utilizando el operador IN.
*/

select *
from producto p inner join fabricante f on (p.codigo_fabricante = f.codigo)
where f.nombre in ('Asus', 'Hewlett-Packard');

/*
22. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos
los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer
lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden
ascendente)
*/

select p.nombre, p.precio, f.nombre
from producto p inner join fabricante f on (p.codigo_fabricante = f.codigo)
where p.precio >= 180
order by p.precio desc, p.nombre;

/*
23. Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los
productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos
fabricantes que no tienen productos asociados.
*/

select *
from producto p right join fabricante f on (p.codigo_fabricante = f.codigo);

/*
24. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún
producto asociado.
*/

select *
from fabricante f  inner join producto p on (p.codigo_fabricante = f.codigo)
where not exists (select p.codigo_fabricante from producto p where f.codigo = p.codigo_fabricante);

select *
from tienda.fabricante f left join tienda.producto p on (p.codigo_fabricante = f.codigo)
where p.codigo_fabricante is null;

/*
25. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).
*/

select *
from producto
where codigo_fabricante = (select codigo
					       from fabricante
						   where nombre = 'lenovo');

select p.nombre, f.nombre
from producto p, fabricante f
where p.codigo_fabricante = f.codigo and f.nombre = 'lenovo';

/*
26. Devuelve todos los datos de los productos que tienen el mismo precio que el producto
más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).
*/

select *
from producto
where precio = (select precio
			    from producto
				where codigo_fabricante = (select codigo
										   from fabricante
										  where nombre = 'lenovo')
				order by precio desc limit 1);

select *
from producto p, fabricante f
where p.codigo_fabricante = f.codigo and p.precio < (select p.precio 
                                                     from producto p, fabricante f 
											         where p.codigo_fabricante = f.codigo and f.nombre = 'lenovo' 
                                                     order by p.precio desc limit 1) ;

/*
27. Lista el nombre del producto más caro del fabricante Lenovo.
*/

select nombre
from producto
where codigo_fabricante = (select codigo
						   from fabricante
						   where nombre = 'lenovo')
order by precio desc limit 1;


select p.nombre, p.precio, f.nombre
from fabricante f, producto p
where p.codigo_fabricante = f.codigo and p.precio = (select p.precio
										  from fabricante f, producto p
									      where f.codigo = p.codigo_fabricante and lower(f.nombre) = 'lenovo'
                                          order by p.precio desc limit 1);


/*
28. Lista todos los productos del fabricante Asus que tienen un precio superior al precio
medio de todos sus productos.
*/

select *
from fabricante f, producto p
where f.codigo = p.codigo_fabricante and f.nombre = 'asus' and p.precio > (select avg(precio) 
																			from producto p, fabricante f
																			where p.codigo_fabricante = f.codigo and f.nombre = 'asus');
																			

select *
from producto p inner join fabricante f on (p.codigo_fabricante = f.codigo)
where f.nombre = 'asus' and p.precio > (select avg(precio) 
										 from producto p, fabricante f
										 where p.codigo_fabricante = f.codigo and f.nombre = 'asus');
                                         
select *
from producto
where codigo_fabricante = 
(select codigo
from fabricante 
where nombre = 'asus') and precio > 
(select avg(precio)
from producto
where codigo_fabricante = 
(select codigo
from fabricante 
where nombre = 'asus'));

/*
29. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o
NOT IN).
*/

select codigo, nombre
from fabricante
where codigo in (select codigo_fabricante
				 from producto);

select distinct f.codigo, f.nombre
from fabricante f, producto p
where f.codigo in (p.codigo_fabricante);

/*
30. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando
IN o NOT IN).
*/

select nombre
from fabricante
where codigo not in (select codigo_fabricante
				 from producto);
                 
/*
31. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número
de productos que el fabricante Lenovo.
*/

select f.nombre, count(*) as 'cantidad de prod'
from producto p inner join fabricante f on (p.codigo_fabricante = f.codigo)
group by f.nombre
having count(*) =  (select count(*)
				  from producto p inner join fabricante f on (p.codigo_fabricante = f.codigo)
				  where f.nombre = 'lenovo');