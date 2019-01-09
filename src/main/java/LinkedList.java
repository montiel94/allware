import java.io.Serializable;
import java.util.logging.Logger;

/**
 * lista linkeada generica creada por mi.
 * @param <E> tipo de dato a utilizar en la lista linkeada.
 */
public class LinkedList<E> implements Serializable {
    /**
     * Nombre : LOGGER.
     * Descripcion : LOGGER de la clase.
     */
    private static final Logger LOGGER = Logger.getLogger(LinkedList.class.getName());
    /**
     * nodo cabezera.
     */
    private Nodo head;

    /**
     * constructor
     */
    LinkedList() {
        head = null;
    }

    /**
     * agregar nodo
     * @param o nodo de tipo generic.
     */
    void add(E o) {
        LOGGER.info("entrando al metodo add");
        try {
            if (head == null) {
                head = new Nodo<E>(o);
            } else {
                Nodo temp = head;
                Nodo nuevo = new Nodo<E>(o);
                nuevo.add(temp);
                head = nuevo;
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        LOGGER.info("saliendo del metodo add");
    }

    /**
     * ver nodo
     * @param index posicion a mostrar
     * @return objeto en la posicion index.
     */
    Object see(int  index){
        LOGGER.info("entrando al metodo see");
        Nodo temp = head;
        try {
            for (int i = 0; i < index; i++) {
                temp = temp.seeNext();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.info("saliendo del metodo see");
        return temp.seeData();
    }

    /**
     * ver todos los nodos
     * @param index posicion a mostrar
     * @return objeto en la posicion index.
     */
    void seeAll(){
        LOGGER.info("entrando al metodo seeAll");
        try {
            Nodo recorrido = this.head;
            while(recorrido!=null) {
                System.out.println(recorrido.seeData());
                recorrido = recorrido.seeNext();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.info("saliendo del metodo seeAll");
    }
    public static void main(String[] args){

        System.out.println("Iniciando");
        try {
            System.out.println("lista generica de Integer , lista linkeada generica creada por mi");
            LinkedList list = new LinkedList<Integer>();
            System.out.println("agregando numeros");
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            System.out.println("numeros agregados :");
            list.seeAll();
            list = new LinkedList<String>();
            System.out.println("agregando strings con nueva instacia");
            list.add("aa");
            list.add("bb");
            list.add("cc");
            list.add("dd");
            list.add("dd");
            System.out.println("strings agregados :");
            list.seeAll();
            System.out.println("LinkedList java.util");
            java.util.LinkedList listJava = new java.util.LinkedList<String>();
            System.out.println("agregando strings con nueva instacia");
            listJava.add("Rams");
            listJava.add("Posa");
            listJava.add("Chinni");
            System.out.println("strings agregados : " +listJava);
            listJava = new java.util.LinkedList<Integer>();
            System.out.println("agregando integers con nueva instacia");
            listJava.add(2011);
            listJava.add(2012);
            listJava.add(2013);
            System.out.println("integers agregados : " +listJava);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
