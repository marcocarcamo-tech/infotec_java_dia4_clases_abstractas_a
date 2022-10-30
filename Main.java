package tarea_clase_abstracta;

public class Main {
    public static void main(String[] args) {

        // Declaración de las instancias
        Rectangulo rectangulo = new Rectangulo(15, 10);
        Triangulo triangulo = new Triangulo(15, 20);
        Circulo circulo = new Circulo(5);


        // Obteniendo el área a partir de los métodos sobreescritos
        Double areaRectangulo = rectangulo.area();
        Double areaTriangulo = triangulo.area();
        Double areaCirculo = circulo.area();


        //Imprimir en consola el resultado
        System.out.println("El área del rectángulo de 15 x 10 es: " + areaRectangulo);
        System.out.println("El área del triángulo de base 15 y altura 20 es: " + areaTriangulo);
        System.out.println("El área del círculo con radio 5 es: " + areaCirculo);
    }
}
