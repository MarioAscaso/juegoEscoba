Implementad el juego de la escoba con la baraja española NO extendida (es decir, la baraja compuesta por las siguientes cartas de los 4 palos [oros, espadas, copas y bastos]: as (1), dos, tres, cuatro, cinco, seis, siete, sota (8 puntos), caballo (9) y rey (10). Entre paréntesis el valor de las figuras.

Núm. de jugadores: 2.

Se jugará al mejor de 3 sets o rondas. Cada set se terminará cuando uno de los participantes llegue a los 21 puntos. Si los supera, su marcador será 21.

En caso de que haya empate a 20 puntos, ganará aquel que consiga 31 puntos antes.

Seguid estas reglas:
https://www.nhfournier.es/como-jugar/escoba/Enlaces a un sitio externo.

Se define "ronda", o "set", como el período que transcurre desde que se reparten las cartas hasta que se agotan o alguien llega a los 21 puntos.

Guardad el resultado de cada ronda en un fichero stats.bin (binario). Se guardarán los siguientes datos:

jugador (nombre, núm. de escobas conseguidas, false/true si consiguió más oros que el competidor, false/true si consiguió todos los oros, false/true si consiguió tener la mayoría de sietes, false/true si consiguió el 7 de oros, false/true si consiguió la mayoría de las cartas, false/true si consiguió que el competidor obtuviera menos de 10 cartas);
duración de la ronda (busca en internet cómo medir el tiempo en Java).