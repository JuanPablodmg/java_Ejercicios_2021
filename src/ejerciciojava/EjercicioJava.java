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
    /**
     * 
     * @param velocidad valores entre 60 y 80
     * @param birthday indica si es cumpleaños
     * @return se devuelve valor 0, 1, 2 dependiendo de tuvelocidad 
     * y si es tu cumpleaños o no
     *///java doc /**
    public int multa (int velocidad, boolean birthday){
        if(birthday){
            //velocidad = velocidad -5;
            velocidad -= 5; // si es mi cumpleaños, me quitan 5 de la velocidad
        }
        if(velocidad <= 60){
            return 0;
        }
        if (60 < velocidad && velocidad <= 80){//si va entre sesenta y ochenta 1
            return 1;//multa pequeña
        }
        return 2;
    }
    public boolean vanidoso(int multiplo){
        if(multiplo % 11 < 2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        //test del primer ejercicio
        EjercicioJava ejercicio = new EjercicioJava();
        System.out.println("Ejercicio 01: ARDILLAS");
        System.out.println("30, false:"+ejercicio.fiestaArdillas(30, false));
        System.out.println("50, false:"+ejercicio.fiestaArdillas(50, false));
        System.out.println("70, true:"+ejercicio.fiestaArdillas(70, true));
        
//test del segundo ejercicio   
        System.out.println("Ejercicio 02: multa");
        System.out.println("60, false:"+ejercicio.multa(60, false));
        System.out.println("65, false:"+ejercicio.multa(65, false));
        System.out.println("65, true:"+ejercicio.multa(65, true));
        
        //test del tercer ejercicio   
        System.out.println("Ejercicio 03: vanidoso");
        System.out.println("22:"+ejercicio.vanidoso(22));
        System.out.println("23:"+ejercicio.vanidoso(23));
        System.out.println("24:"+ejercicio.vanidoso(24));
    }
}
