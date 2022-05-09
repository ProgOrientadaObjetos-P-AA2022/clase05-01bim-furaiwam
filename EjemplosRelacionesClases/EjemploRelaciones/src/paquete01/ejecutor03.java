package paquete01;

public class ejecutor03 {
    public static void main(String[] args) {
        String marca = "Del";
        double costo = 34234;
        UnidadDVD unidad = new UnidadDVD(marca, costo );
        String procesador ="Asus";


        // se crea un de tipo UnidadDVD
        Computadora computadora = new Computadora(procesador, unidad);

        System.out.printf("Computadora:\nProcesador: %s\n"
                        + "Unidad de DVD: %s\n"
                        + "Costo de Unidad DVD: %.2f\n",
                computadora.obtenerTipoProcesador(),
                computadora.obtenerUnidadDvd().obtenerMarca(),
                computadora.obtenerUnidadDvd().obtenerCosto());

    }

}


