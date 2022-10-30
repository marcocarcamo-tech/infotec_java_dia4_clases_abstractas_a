package tarea_clase_abstracta;

public class Triangulo extends Figura {
    private Integer base;
    private Integer altura;

    public Triangulo (Integer base, Integer altura){
        this.base = base;
        this.altura = altura;
        
    }

    public Double area(){
        Double area = getArea();
        area = (double) ((this.base * this.altura)/2);
        return area;
    }
}
