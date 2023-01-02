select *
from equipo;

select *
from estadistica;

select *
from jugador;

select *
from partido;

/*
1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
*/

select *
from jugador
order by nombre;

/*
2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
ordenados por nombre alfabéticamente.
*/

select *
from jugador
where posicion = 'c' and peso > 200;

/*
3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
*/

select *
from equipo
order by nombre;

/*
4. Mostrar el nombre de los equipos del este (East).
*/

SELECT 
    *
FROM
    equipo
WHERE
    conferencia IN ('east');

/*
5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
*/

select *
from equipo
where ciudad like 'c%';

/*
6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
*/

select *
from jugador
order by nombre_equipo, nombre;

/*
7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
*/

select *
from jugador
where nombre_equipo = 'raptors'
order by nombre;

/*
8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
*/

select Puntos_por_partido
from estadistica
where jugador = (select codigo
from jugador
where nombre = 'pau gasol');

/*
9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
*/

select Puntos_por_partido
from estadistica
where temporada = '04/05' and jugador = (select codigo
from jugador
where nombre = 'pau gasol');

/*
10. Mostrar el número de puntos de cada jugador en toda su carrera.
*/

select j.nombre, sum(e.Puntos_por_partido)
from estadistica e inner join jugador j on (e.jugador = j.codigo)
where e.jugador in (select codigo
from jugador)
group by j.nombre
order by j.nombre; 

/*
11. Mostrar el número de jugadores de cada equipo.
*/

select nombre_equipo, count(*) as 'cantidad de jugadores'
from jugador
group by nombre_equipo;

/*
12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
*/

select j.nombre, sum(Puntos_por_partido)
from estadistica e inner join jugador j on (e.jugador = j.codigo)
group by j.nombre
order by sum(Puntos_por_partido) desc limit 1;

/*
13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
*/

select j.nombre, j.nombre_equipo, j.altura, e.ciudad, e.conferencia, e.division
from jugador j inner join equipo e on (j.nombre_equipo = e.nombre)
where e.nombre = (select nombre_equipo
from jugador
order by altura desc limit 1) and j.codigo = (select codigo
from jugador
order by altura desc limit 1);

/*
14. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
*/

select equipo_visitante, (sum(puntos_visitante) / count(*)) as 'media'
from partido
where equipo_visitante in (select nombre
from equipo
where division = 'pacific') 
group by equipo_visitante;

select equipo_local, (sum(puntos_local) / count(*)) as 'media'
from partido
where equipo_local in (select nombre
from equipo
where division = 'pacific') 
group by equipo_local;


/*
15. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor
diferencia de puntos.
*/

select equipo_local, equipo_visitante, if(puntos_local < puntos_visitante, (puntos_visitante - puntos_local), (puntos_local - puntos_visitante) ) as 'diferencia'
from partido
order by diferencia desc limit 4
;

/*
16. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
*/

select equipo_visitante, (sum(puntos_visitante) / count(*)) as 'media'
from partido
where equipo_visitante in (select nombre
from equipo
where division = 'pacific') 
group by equipo_visitante;

select equipo_local, (sum(puntos_local) / count(*)) as 'media'
from partido
where equipo_local in (select nombre
from equipo
where division = 'pacific') 
group by equipo_local;

/*
17. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante.
*/

select equipo_local, puntos_local
from partido
;

select equipo_visitante, puntos_visitante
from partido
;

/*
18. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante,
equipo_ganador), en caso de empate sera null.
*/

select codigo, equipo_local, equipo_visitante, puntos_local, puntos_visitante, if(puntos_local<puntos_visitante, equipo_visitante, if(puntos_local>puntos_visitante, equipo_local, null)) as 'equipo ganador'
from partido;
