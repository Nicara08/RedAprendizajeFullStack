select *
from cliente;

select *
from detalle_pedido;

select *
from empleado;

select *
from gama_producto;

select *
from oficina;

select *
from pago;

select *
from pedido;

select *
from producto;

/*
1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
*/

select codigo_oficina, ciudad
from oficina;

/*
2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
*/

select ciudad, telefono
from oficina
where pais = 'españa';

/*
3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un
código de jefe igual a 7.
*/

select nombre, apellido1, apellido2, email
from empleado
where codigo_jefe = 7;

/*
4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
*/

select puesto, nombre, apellido1, apellido2, email
from empleado
order by codigo_jefe limit 1;

/*
5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean
representantes de ventas.
*/

select nombre, apellido1, apellido2, puesto
from empleado
where puesto not like 'representante ventas';

/*
6. Devuelve un listado con el nombre de los todos los clientes españoles.
*/

select nombre_contacto, apellido_contacto, ciudad, region, pais
from cliente
where pais = 'spain';

/*
7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
*/

select estado
from pedido
group by estado;

/*
8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago
en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan
repetidos. Resuelva la consulta:
o Utilizando la función YEAR de MySQL.
o Utilizando la función DATE_FORMAT de MySQL.
o Sin utilizar ninguna de las funciones anteriores.
*/

select codigo_cliente
from pago
where year(fecha_pago) = 2008
group by codigo_cliente;


select codigo_cliente 
from pago
where date_format(fecha_pago, '%y') = 08
group by codigo_cliente;

select codigo_cliente
from pago
where fecha_pago like '2008%'
group by codigo_cliente;

/*
9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
entrega de los pedidos que no han sido entregados a tiempo.
*/

select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega
from pedido
where fecha_esperada < fecha_entrega;

/*
10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de
entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha
esperada.
o Utilizando la función ADDDATE de MySQL.
o Utilizando la función DATEDIFF de MySQL.
*/

select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega 
from pedido
where adddate(fecha_esperada, interval -2 day) >= fecha_entrega;

select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega 
from pedido
where datediff(fecha_esperada, fecha_entrega) >= 2; 

/*
11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
*/

select codigo_pedido, estado, comentarios, fecha_pedido
from pedido
where estado = 'rechazado' and fecha_pedido like '2009%';

/*
12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de
cualquier año.
*/

select *
from pedido
where fecha_entrega like '%-01-%';

/*
13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal.
Ordene el resultado de mayor a menor.
*/

select *
from pago
where forma_pago = 'paypal' and fecha_pago like '2008%'
order by total desc;

/*
14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en
cuenta que no deben aparecer formas de pago repetidas.
*/

select forma_pago
from pago
group by forma_pago;

select distinct forma_pago
from pago;

/*
15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que
tienen más de 100 unidades en stock. El listado deberá estar ordenado por su precio de
venta, mostrando en primer lugar los de mayor precio.
*/

select *
from producto
where gama = 'ornamentales' and cantidad_en_stock >= 100
order by precio_venta desc;

/*
16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo
representante de ventas tenga el código de empleado 11 o 30.
*/

select *
from cliente
where ciudad = 'madrid' and codigo_empleado_rep_ventas in (11, 30);

/*
Consultas multitabla (Composición interna)
Las consultas se deben resolver con INNER JOIN.
1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante
de ventas.
*/

select c.codigo_cliente, c.nombre_cliente, e.codigo_empleado, e.nombre, e.apellido1, e.apellido2
from cliente c inner join empleado e on (e.codigo_empleado = c.codigo_empleado_rep_ventas);

/*
2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus
representantes de ventas.
*/

select c.codigo_cliente, c.nombre_cliente, e.codigo_empleado, e.nombre, e.apellido1, e.apellido2
from cliente c inner join empleado e on (c.codigo_empleado_rep_ventas = e.codigo_empleado)
where c.codigo_cliente in (select c.codigo_cliente
from pago p inner join cliente c on (p.codigo_cliente = c.codigo_cliente)
group by c.codigo_cliente);

/*
3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de
sus representantes de ventas.
*/

select c.codigo_cliente, c.nombre_cliente, e.codigo_empleado, e.nombre, e.apellido1, e.apellido2
from cliente c inner join empleado e on (c.codigo_empleado_rep_ventas = e.codigo_empleado)
where c.codigo_cliente in (select c.codigo_cliente
from cliente c left join pago p on (c.codigo_cliente = p.codigo_cliente)
where p.codigo_cliente is null);

/*
4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes
junto con la ciudad de la oficina a la que pertenece el representante.
*/


select distinct c.codigo_cliente, c.nombre_cliente, p.forma_pago, e.nombre, e.apellido1, e.apellido2, o.ciudad
from pago p inner join cliente c on (P.codigo_cliente = c.codigo_cliente) inner join empleado e on (c.codigo_empleado_rep_ventas = e.codigo_empleado) inner join oficina o on (e.codigo_oficina = o.codigo_oficina);


/*
5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus
representantes junto con la ciudad de la oficina a la que pertenece el representante.
*/

select c.codigo_cliente, c.nombre_cliente, e.codigo_empleado, e.nombre, e.apellido1, e.apellido2, o.ciudad
from cliente c left join pago p on (c.codigo_cliente = p.codigo_cliente) inner join empleado e on (c.codigo_empleado_rep_ventas = e.codigo_empleado) inner join oficina o on (e.codigo_oficina = o.codigo_oficina)
where p.codigo_cliente is null;

/*
6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
*/

select c.codigo_cliente, c.nombre_cliente, c.ciudad, e.codigo_oficina, o.ciudad, o.region, o.pais, o.linea_direccion1
from cliente c inner join empleado e on (c.codigo_empleado_rep_ventas = e.codigo_empleado) inner join oficina o on (e.codigo_oficina = o.codigo_oficina)
where c.ciudad = 'fuenlabrada';

/*
7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad
de la oficina a la que pertenece el representante.
*/

select c.codigo_cliente, c.nombre_cliente, e.codigo_empleado, e.nombre, e.apellido1, o.ciudad
from cliente c inner join empleado e on (c.codigo_empleado_rep_ventas = e.codigo_empleado) inner join oficina o on (e.codigo_oficina = o.codigo_oficina);

/*
8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
*/

select e.codigo_empleado, e.nombre, e.apellido1, e.codigo_jefe, m.nombre as 'nombre jefe', m.apellido1 as 'apellido jefe', m.puesto
from empleado e, empleado m
where e.codigo_jefe = m.codigo_empleado;

/*
9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.
*/

select c.nombre_cliente, p.fecha_esperada, p.fecha_entrega
from pedido p inner join cliente c on (p.codigo_cliente = c.codigo_cliente)
where fecha_entrega > fecha_esperada;

/*
10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.
*/

select c.codigo_cliente, c.nombre_cliente, p.codigo_pedido,  d.codigo_producto, pr.nombre, pr.gama
from cliente c inner join pedido p on (c.codigo_cliente = p.codigo_cliente) inner join detalle_pedido d on (d.codigo_pedido = p.codigo_pedido) inner join producto pr on (d.codigo_producto = pr.codigo_producto)
;

/*
Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN.
1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
*/

select *
from cliente c left join pago p on (c.codigo_cliente = p.codigo_cliente)
where p.codigo_cliente is null;

/*
2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún
pedido.
*/

select *
from cliente c left join pedido p on (c.codigo_cliente = p.codigo_cliente)
where p.codigo_cliente is null;

/*
3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que
no han realizado ningún pedido.
*/

select *
from cliente c left join pago p on (c.codigo_cliente = p.codigo_cliente) left join pedido pe on (c.codigo_cliente = pe.codigo_cliente)
where p.codigo_cliente is null and pe.codigo_cliente is null;

/*
4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina
asociada.
*/

select *
from empleado e left join oficina o on (e.codigo_oficina = o.codigo_oficina)
where o.codigo_oficina is null
;

/*
5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente
asociado.
*/

select * 
from cliente c right join empleado e on (c.codigo_empleado_rep_ventas = e.codigo_empleado)
where c.codigo_empleado_rep_ventas is null;

/*
6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los
que no tienen un cliente asociado.

todos los empleados tienen una oficina asociada
*/

/*
7. Devuelve un listado de los productos que nunca han aparecido en un pedido.
*/

select pr.nombre, pr.gama, p.codigo_pedido
from pedido p inner join detalle_pedido d on (p.codigo_pedido = d.codigo_pedido) right join producto pr on (d.codigo_producto = pr.codigo_producto)
where d.codigo_producto is null;

/*
8. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los
representantes de ventas de algún cliente que haya realizado la compra de algún producto
de la gama Frutales.
*/

select *
from oficina
where codigo_oficina not in (select codigo_oficina
from empleado
where codigo_empleado in (select codigo_empleado_rep_ventas
from cliente
where codigo_cliente in (select distinct codigo_cliente
from pedido
where codigo_pedido in (select codigo_pedido
from detalle_pedido
where codigo_producto in (select codigo_producto
from producto
where gama = 'frutales')))));

/*
9. Devuelve un listado con los clientes que han realizado algún pedido, pero no han realizado
ningún pago.
*/

select *
from pedido pe inner join cliente c on (c.codigo_cliente = pe.codigo_cliente) left join pago pa on (c.codigo_cliente = pa.codigo_cliente)
where pa.codigo_cliente is null;

/*
10. Devuelve un listado con los datos de los empleados que no tienen clientes asociados y el
nombre de su jefe asociado.
*/

select e.codigo_empleado, e.nombre, e.apellido1, e.codigo_jefe, em.nombre as 'nombre jefe', em.apellido1 as 'apellido jefe'
from cliente c right join empleado e on (c.codigo_empleado_rep_ventas = e.codigo_empleado), empleado em
where c.codigo_empleado_rep_ventas is null and e.codigo_jefe in (em.codigo_empleado);

/*
1. ¿Cuántos empleados hay en la compañía?
*/

select count(*) as 'cantidad de empleados'
from empleado;

/*
2. ¿Cuántos clientes tiene cada país?
*/

select pais, count(*) as 'cantidad de clientes'
from cliente
group by pais
order by count(*) desc;

/*
3. ¿Cuál fue el pago medio en 2009?
*/

select avg(total) as 'pago medio en 2009'
from pago
where fecha_pago like '2009%';

/*
4. ¿Cuántos pedidos hay en cada estado? Ordena el resultado de forma descendente por el
número de pedidos.
*/

select c.ciudad, count(*) as 'pedidos'
from pedido pe inner join cliente c on (pe.codigo_cliente = c.codigo_cliente)
group by c.ciudad
order by count(*) desc;

/*
5. Calcula el precio de venta del producto más caro y más barato en una misma consulta.
*/

select min(precio_venta) as 'precio minimo', max(precio_venta) as 'precio maximo'
from producto;

/*
6. Calcula el número de clientes que tiene la empresa.
*/

select count(*) as 'cantidad de clientes'
from cliente;

/*
7. ¿Cuántos clientes tiene la ciudad de Madrid?
*/

select count(*) as 'cant de clientes en madrid'
from cliente
where region = 'madrid';

/*
8. ¿Calcula cuántos clientes tiene cada una de las ciudades que empiezan por M?
*/

select count(*) as 'cant clientes en ciudades que empiece con m'
from cliente
where ciudad like 'm%';

/*
9. Devuelve el nombre de los representantes de ventas y el número de clientes al que atiende
cada uno.
*/

select e.nombre, e.apellido1, c.codigo_cliente
from empleado e inner join cliente c on (e.codigo_empleado = c.codigo_empleado_rep_ventas);

/*
10. Calcula el número de clientes que no tiene asignado representante de ventas.
*/

select *
from cliente c left join empleado e on (c.codigo_empleado_rep_ventas = e.codigo_empleado)
where e.codigo_empleado is null; 

/*
11. Calcula la fecha del primer y último pago realizado por cada uno de los clientes. El listado
deberá mostrar el nombre y los apellidos de cada cliente.
*/

select p.codigo_cliente, c.nombre_cliente, min(p.fecha_pago) as 'primer pago', max(p.fecha_pago) as 'ultimo pago'
from pago p inner join cliente c on (p.codigo_cliente = c.codigo_cliente)
group by p.codigo_cliente;

/*
12. Calcula el número de productos diferentes que hay en cada uno de los pedidos.
*/

select d.codigo_pedido, count(*) as 'cantidad de productos'
from pedido p inner join detalle_pedido d on (p.codigo_pedido = d.codigo_pedido)
group by d.codigo_pedido
order by d.codigo_pedido
;

/*
13. Calcula la suma de la cantidad total de todos los productos que aparecen en cada uno de
los pedidos.
*/

select codigo_pedido, sum(cantidad) as 'total productos'
from detalle_pedido
group by codigo_pedido;

/*
14. Devuelve un listado de los 20 productos más vendidos y el número total de unidades que
se han vendido de cada uno. El listado deberá estar ordenado por el número total de
unidades vendidas.
*/

select d.codigo_producto, p.nombre, sum(d.cantidad) as 'cantidad de productos'
from detalle_pedido d inner join producto p on (d.codigo_producto = p.codigo_producto)
group by codigo_producto
order by sum(d.cantidad) desc limit 20
;

/*
15. La facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el
IVA y el total facturado. La base imponible se calcula sumando el coste del producto por el
número de unidades vendidas de la tabla detalle_pedido. El IVA es el 21 % de la base
imponible, y el total la suma de los dos campos anteriores.
*/

select *, (precio_unidad*cantidad) as 'Base imponible', ((precio_unidad*cantidad)*0.21) as 'IVA', (((precio_unidad*cantidad)*1.21)) as 'Total'
from detalle_pedido;

/*
16. La misma información que en la pregunta anterior, pero agrupada por código de producto.
*/

select codigo_producto, sum(cantidad), sum((precio_unidad*cantidad)) as 'Base imponible', sum(((precio_unidad*cantidad)*0.21)) as 'IVA', sum(((precio_unidad*cantidad)*1.21)) as 'Total'
from detalle_pedido
group by codigo_producto;

/*
17. La misma información que en la pregunta anterior, pero agrupada por código de producto
filtrada por los códigos que empiecen por OR.
*/

select codigo_producto, sum(cantidad), sum((precio_unidad*cantidad)) as 'Base imponible', sum(((precio_unidad*cantidad)*0.21)) as 'IVA', sum(((precio_unidad*cantidad)*1.21)) as 'Total'
from detalle_pedido
where codigo_producto like 'or%'
group by codigo_producto;

/*
18. Lista las ventas totales de los productos que hayan facturado más de 3000 euros. Se
mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (21%
IVA)
*/

select d.codigo_producto, p.nombre, sum(d.cantidad) as 'cantidad de productos', (sum(d.cantidad*d.precio_unidad)) as 'subtotal', ((sum(d.cantidad*d.precio_unidad))*1.21) as 'total c/IVA'
from detalle_pedido d inner join producto p on (d.codigo_producto = p.codigo_producto)
group by codigo_producto
having ((sum(d.cantidad*d.precio_unidad))*1.21) >= 3000;

/*
Subconsultas con operadores básicos de comparación
1. Devuelve el nombre del cliente con mayor límite de crédito.
*/

select nombre_cliente, limite_credito
from cliente
order by limite_credito desc limit 1;

/*
2. Devuelve el nombre del producto que tenga el precio de venta más caro.
*/

select nombre, precio_venta
from producto
order by precio_proveedor desc limit 1;

/*
3. Devuelve el nombre del producto del que se han vendido más unidades. (Tenga en cuenta
que tendrá que calcular cuál es el número total de unidades que se han vendido de cada
producto a partir de los datos de la tabla detalle_pedido. Una vez que sepa cuál es el código
del producto, puede obtener su nombre fácilmente.)
*/

select nombre
from producto
where codigo_producto = (select d.codigo_producto
from detalle_pedido d inner join producto p on (d.codigo_producto = p.codigo_producto)
group by codigo_producto
order by sum(d.cantidad) desc limit 1);

/*
4. Los clientes cuyo límite de crédito sea mayor que los pagos que haya realizado. (Sin utilizar
INNER JOIN).
*/

select cl.nombre_cliente, cl.limite_credito, p.total
from cliente cl, pago p
where p.total = (select max(p1.total) from pago p1 where cl.limite_credito > p1.total);

/*
5. Devuelve el producto que más unidades tiene en stock.
*/

select nombre, cantidad_en_stock
from producto
order by cantidad_en_stock desc limit 1
;

/*
6. Devuelve el producto que menos unidades tiene en stock.
*/

select nombre, cantidad_en_stock
from producto
where cantidad_en_stock != 0
order by cantidad_en_stock limit 1;

/*
7. Devuelve el nombre, los apellidos y el email de los empleados que están a cargo de Alberto
Soria.
*/

select nombre, apellido1, apellido2, email
from empleado
where codigo_jefe = (select codigo_empleado
from empleado
where apellido1 = 'soria' and nombre = 'alberto');

