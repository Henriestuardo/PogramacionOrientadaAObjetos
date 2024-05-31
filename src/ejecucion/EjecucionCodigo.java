package ejecucion;

import Primercodigo.JugadorFutbol;

public class EjecucionCodigo {
    public static void main(String[] args) {
        JugadorFutbol pepito = new JugadorFutbol();

        JugadorFutbol Juan = new JugadorFutbol(
                "Juan",
                "Delantero",
                "Guatemalteco",
                "Real Madrid",
                12
        );
        System.out.println("Nombre del jugador " + Juan.getNombre());
        pepito.setNombre("pepito");
        System.out.println("Nombre del jugador " + pepito.getNombre());

        System.out.println("Nacionalidad de: " + Juan.getNombre() + " tiene la nacionalidad: " + Juan.getNacionalidad());
        Juan.setNacionalidad("Colombia");
        System.out.println("Nacionalidad de: " + Juan.getNombre() + " tiene la nacionalidad: " + Juan.getNacionalidad());
        Juan.setNacionalidad("Mexico");
        System.out.println("Nacionalidad de: " + Juan.getNombre() + " tiene la nacionalidad: " + Juan.getNacionalidad());



    }
}
