package modelo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehiculo {
    private String codigo;
    private String marca;
    private String modelo;
    private double precio;
}