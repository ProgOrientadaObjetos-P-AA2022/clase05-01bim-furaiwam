package paquete01;

public class ejecutoe02 {
    public static void main(String[] args) {
        // se crea un de tipo UnidadDVD
        String marca = "Toshiba";
        double costo=23;
        UnidadDVD unidad = new UnidadDVD(marca,costo);

        // se crea el objeto de tipo Computadora
        String procesador = "Intel";

        Computadora computadora = new Computadora(procesador, unidad);
        System.out.printf("Computadora:\nProcesador: %s\n"
                        + "Unidad de DVD: %s\n",
                computadora.obtenerTipoProcesador(),
                computadora.obtenerUnidadDvd().obtenerMarca());

        UnidadDVD unidad2 = new UnidadDVD("Sony", 30.0);
        computadora.establecerUnidadDvd(unidad2);
        System.out.printf("Computadora:\nProcesador: %s\n"
                        + "Unidad de DVD: %s\n",
                computadora.obtenerTipoProcesador(),
                computadora.obtenerUnidadDvd().obtenerMarca());
    }

}

