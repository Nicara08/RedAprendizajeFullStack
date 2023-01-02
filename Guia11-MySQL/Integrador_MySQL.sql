/*
CANDADO A
Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)

RESULTADO 2
*/

select Asistencias_por_partido, count(*) as 'cantidad de veces'
from estadistica
group by Asistencias_por_partido
order by (Asistencias_por_partido) desc limit 1; 
;

/*
Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de
datos:
Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
centro o esté comprendida en otras posiciones.

RESULTADO 14043
*/

select sum(j.peso)
from equipo e inner join jugador j on (e.nombre = j.nombre_equipo)
where e.conferencia = 'east' and j.posicion like '%c%';

/*
CANDADO B
Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
jugadores que tiene el equipo Heat.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)

RESULTADO 3
*/

select count(*) as 'cantidad de jugadores'
from estadistica
where Asistencias_por_partido > (select count(*) as 'cantidad de jugadores'
                                 from jugador
                                 where nombre_equipo = 'heat'
                                 group by nombre_equipo);

/*
Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
datos:
La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.

RESULTADO 3480
*/

select count(*) as 'cantidad de juegos'
from partido
where temporada like '%99%'
;

/*
CANDADO C
Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
parte de equipos de la conferencia oeste.
Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
195, y a eso le vamos a sumar 0.9945.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)

RESULTADO 1
*/



select round((((select count(*) as 'cantidad de jugadores'
from jugador j inner join equipo e on (j.nombre_equipo = e.nombre)
where procedencia = 'michigan' and e.conferencia = 'west')/ (select count(*)
from jugador
where peso >= 195))+0.9945)) as 'posicion candado C';

/*
Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
datos:
Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
tapones por partido. Además, este resultado debe ser, donde la división sea central.

RESULTADO 631
*/

select floor((select avg(Puntos_por_partido)
from estadistica
where jugador in (select j.codigo
from equipo e inner join jugador j on (e.nombre = j.nombre_equipo)
where e.division = 'central'))+(select count(*)
from estadistica
where jugador in (select j.codigo
from equipo e inner join jugador j on (e.nombre = j.nombre_equipo)
where e.division = 'central'))+(select sum(Tapones_por_partido)
from estadistica
where jugador in (select j.codigo
from equipo e inner join jugador j on (e.nombre = j.nombre_equipo)
where e.division = 'central'))) as 'candado C';

/*
CANDADO D
Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
resultado debe ser redondeado. Nota: el resultado debe estar redondeado
Este resultado nos dará la posición del candado (1, 2, 3 o 4)

RESULTADO 4
*/

select codigo
from jugador
where nombre = 'corey maggette';

select round((select Tapones_por_partido
from estadistica
where jugador = (select codigo
from jugador
where nombre = 'corey maggette') and temporada = '00/01')) as 'tapones';



/*
Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de
datos:
Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
de todos los jugadores de procedencia argentina.

RESULTADO 191
*/

select codigo
from jugador
where procedencia = 'argentina';

select floor((select sum(Puntos_por_partido)
from estadistica
where jugador in (select codigo
from jugador
where procedencia = 'argentina'))) as 'codigo';