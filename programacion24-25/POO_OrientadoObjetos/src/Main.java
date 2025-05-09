public class Main {
    public static void main(String[] args){

        Mono[]lista=new Mono[10];
        for (int i = 0; i < lista.length; i++) {
            lista[i]=new Mono();


        }
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i ]);

        }

        Mono mono1=new Mono("Copito",18,100,false,"Gorila",20, "javi");
        Mono mono2= new Mono("Amelio",3,8,false,"Chimpance",30,"Belen");
        Mono mono3=new Mono();

        System.out.println(mono1.getCuidador());//le decimos que queremos el nombre del cuidador de mono1
        System.out.println(mono2.getCuidador());//le decimos que queremos el nombre del cuidador de mono2
        System.out.println(mono3.getCuidador());//le decimos que queremos el nombre del cuidador de mono3(new mono 'miMonoPreferido')

        System.out.println(mono1.toString());//sale toda la 'ficha' del mono1
        System.out.println(mono3);//Sale la 'ficha' de 'mono3'('mimonopreferido') por tener implementado el to.String

        mono1.setCuidador("javi"); //aqui no ponemos el println porque los set no devuelven nada, se lo ponemos nosotros
        System.out.println(mono1);//aqui podemos el println porque es de un getter y el getter si devuelve cosas porque tiene informacion de antes

        Mono mono=EntradaSalida.dameMono();
        System.out.println(mono);
    }
}