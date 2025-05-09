import animales.*;

import java.util.Arrays;
import java.util.Random;

public class Animales {

    private Animal[] animales= new Animal[16];



    public Animales() {

        Random random = new Random();


        for (int i = 0; i < animales.length; i++) {

            if (i<=3) {
                animales[i] = new Conejo(Constantes.nombresA[random.nextInt(0, 41)], random.nextInt(0, 12),
                        random.nextFloat(0, 2), random.nextBoolean(), random.nextFloat(2, 8),
                        Constantes.nombres[random.nextInt(0, 9)], random.nextInt(1, 6), random.nextInt(1, 3),
                        Constantes.tiposDePelaje[random.nextInt(0, 10)]);

            }else if (i>3 && i<6) {
                animales[i] = new Jirafa(Constantes.nombresA[random.nextInt(0, 41)], random.nextInt(0, 25),
                        random.nextFloat(47, 1180), random.nextBoolean(), random.nextFloat(238, 476),
                        Constantes.nombres[random.nextInt(0, 9)], random.nextInt(1, 6), random.nextInt(1, 3));

            }else if (i>6 && i<9){
                animales[i] = new Leon(Constantes.nombresA[random.nextInt(0,41)], random.nextInt(0,16),
                        random.nextFloat(1,225), random.nextBoolean(), random.nextFloat(30,52),
                        Constantes.nombres[random.nextInt(0,9)], random.nextInt(1,6), random.nextBoolean());
            }else if (i<9&& i<12){
                animales[i]= new Mono(Constantes.nombresA[random.nextInt(0,41)],random.nextInt(1,45),
                        random.nextFloat(1,22), random.nextBoolean(), random.nextFloat(14,28),
                        Constantes.nombres[random.nextInt(0,9)],Constantes.tiposMono[random.nextInt(0,9)],
                        random.nextInt(1,6));
            }else if (i>12 && i<15){
                animales[i] = new Perro(Constantes.nombresA[random.nextInt(0,41)], random.nextInt(0,16),
                        random.nextFloat(1,15), random.nextBoolean(), random.nextFloat(1,2),
                        Constantes.nombres[random.nextInt(0,9)], random.nextInt(1,6),
                        Constantes.razasPerro[random.nextInt(0,9)]);
            }



        }


    }



    @Override
    public String toString() {
        return "Animales: " +
                "animales=" + Arrays.toString(animales);
    }
}
