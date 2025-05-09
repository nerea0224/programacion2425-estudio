import java.util.Random;

public class ejemplo_arrays {

    public static void main(String[] args) {
        //Declaración
        int temperaturas[] =  new int[30];
        //imprimir valores por defecto
		/*for(int posicion=0; posicion<temperaturas.length;posicion++) {
			System.out.println("Posicion"+ posicion+ ": "+temperaturas[posicion]);
		}*/

        //Generar Aleatorios
        Random random = new Random();
        int aleatorioS = random.nextInt(10);//[0,10)
        int aleatorioIS = random.nextInt(-10,20);//[-10,20)
        double aleatorioDS = random.nextDouble(10);//[0,10)
        double aleatorioDIS = random.nextDouble(10,20);//[10,20)

        int aleatorioMath = (int)(Math.random()*100);
        int limiteInferior= 16;
        int limiteSuperior = 20;
        int aleatorioMathIS = limiteInferior + (int)(Math.random()*(limiteSuperior-limiteInferior));

        //Generar Aleatorios
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i]=random.nextInt(16,21);
        }

		/*//carga manual con E/S
		Scanner lectScanner = new Scanner(System.in);
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Introduce la temperatura del día" + (i+1));
			temperaturas[i]=lectScanner.nextInt();
		}*/

        //procesado: calcular la media
        int suma=0;
        for (int i = 0; i < temperaturas.length; i++) {
            suma+=temperaturas[i];
        }
        System.out.println("La temperatura media es:"+ (float)suma/temperaturas.length);

        //imprimir
        for(int posicion=0; posicion<temperaturas.length;posicion++) {
            System.out.println("Posicion"+ (posicion+1)+ ": "+temperaturas[posicion]);
        }
        System.out.println(temperaturas[temperaturas.length-1]);

    }
}
