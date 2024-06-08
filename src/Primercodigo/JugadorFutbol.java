package Primercodigo;

public class JugadorFutbol {

    private String nombre;
    private String posicion;
    private String nacionalidad;
    private String equipoActual;
    private int numeroCamiseta;
    private int cambiaNacionalidad;


    public JugadorFutbol(){

    }

    public JugadorFutbol(String nombre, String posicion, String nacionalidad, String equipoActual, int numeroCamiseta) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.nacionalidad = nacionalidad;
        this.equipoActual = equipoActual;
        this.numeroCamiseta = numeroCamiseta;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        if (this.cambiaNacionalidad > 1){
            System.out.println("Solo es permitido 1 cambio de nacionalidad");
        }else{
            this.nacionalidad = nacionalidad;
            cambiaNacionalidad ++;
        }

    }

    public String getEquipoActual() {
        return equipoActual;
    }

    public void setEquipoActual(String equipoActual) {
        this.equipoActual = equipoActual;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public void patearBalon(){
        System.out.println();
    }
}
