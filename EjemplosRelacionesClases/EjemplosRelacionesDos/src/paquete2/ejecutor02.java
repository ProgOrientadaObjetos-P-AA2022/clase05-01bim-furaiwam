package paquete2;

public class ejecutor02 {
    public static void main(String[] args) {
        //Crear una persona de Barrio el valle de la ciudad de Loja
        // 2. crear una persona del Barrion Central de la ciudad  de Cuenca
        // 3. crear una persona del Barrion Centenario de la ciudad  de Guayaquil
        Ciudad ciudad1 = new Ciudad("Loja");
        Ciudad ciudad2 = new Ciudad("Cuenca");
        Ciudad ciudad3 = new Ciudad("Guayaquil");



        Barrio barrio1 = new Barrio("Valle", ciudad1);
        Barrio barrio2 = new Barrio("Central", ciudad2);
        Barrio barrio3 = new Barrio("Centenario", ciudad3);


        Persona persona1 = new Persona("René Elizalde", "1100909909", barrio1);
        Persona persona2 = new Persona("Juan roldoz", "1323532525", barrio2);
        Persona persona3 = new Persona("Geordy Perez", "1235235325", barrio3);

        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                        + "ciudad: %s\n",
                persona1.obtenerNombre(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");


        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                        + "ciudad: %s\n",
                persona2.obtenerNombre(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");


        System.out.printf("El barrio de la persona %s es: %s\n Y pertenece a la "
                        + "ciudad: %s\n",
                persona3.obtenerNombre(),
                persona3.obtenerBarrio().obtenerNombre(),
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");

    }
}

