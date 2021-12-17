package ejerciciojava;
public class EjercicioJava {

    public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
        //si es findesemana da igual cuantas bellotas haya
        if(finDeSemana){
            return true;
        }
        //si hay entre cuarenta y sesenta bellotas, exito
        if(numBellotas>=40 && numBellotas<= 60){
            return true;
        }
        return false;
    }
    //nada
    public static void main(String[] args) {
        EjercicioJava ejercicio = new EjercicioJava();
        System.out.println("Ejercicio 01: ARDILLAS");
        System.out.println("30, false:"+ejercicio.fiestaArdillas(30, false));
        System.out.println("50, false:"+ejercicio.fiestaArdillas(50, false));
        System.out.println("70, true:"+ejercicio.fiestaArdillas(70, true));
    }
}
