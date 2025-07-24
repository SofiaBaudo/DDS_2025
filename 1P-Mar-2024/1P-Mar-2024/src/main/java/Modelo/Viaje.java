package Modelo;

import java.time.LocalDateTime;
import java.util.List;

public class Viaje {
    private Motoquero motoquero;
    private LocalDateTime fechaARealizar;
    private CaminoNoConvencional camino;
    private List<TipoPuntoInteres> intereses;
    private Moto moto;
    private Feedback feedback;
}
