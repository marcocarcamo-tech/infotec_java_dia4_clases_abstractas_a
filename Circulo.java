package tarea_clase_abstracta;

public class Circulo extends Figura{
    private Double pi = 3.1415;
    private Integer radio;

    public Circulo (Integer radio){
        this.radio = radio;
    }

    public Double area(){
        Double area = getArea();
        area = (double) (pi * (Math.pow(radio, 2)));
        return area;
    }

    
}
