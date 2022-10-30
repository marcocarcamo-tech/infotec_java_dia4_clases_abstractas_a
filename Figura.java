package tarea_clase_abstracta;

public abstract class Figura {
    private Integer coordenada_x;
    private Integer coordenada_y;
    private Integer ancho;
    private Integer alto;
    private Double perimetro;
    private Double area;


    public Figura(Integer ancho, Integer alto){
        this.ancho = ancho;
        this.alto = alto;

    }

    
}
