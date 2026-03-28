package datos;
public class Almacenar {

    // Vector para alamacenar 10 datos 
    public static Personaje[] misCorredores = new Personaje[10];
    public static int contador = 0;

    public static boolean registrar(Personaje nuevo) {
        if (contador < 10) {
            // verificar ID
            for (int i = 0; i < contador; i++) {
                if (misCorredores[i].getCarnet().equals(nuevo.getCarnet())) {
                    return false; 
                }
            }
            misCorredores[contador] = nuevo;
            contador++;
            return true;
        }
        return false;
    }
}
    

