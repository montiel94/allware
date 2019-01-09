import java.io.Serializable;
import java.util.logging.Logger;

/**
 * nodo de lista generic
 * @param <E>
 */
public class Nodo<E> implements Serializable {
    /**
     * Nombre : LOGGER.
     * Descripcion : LOGGER de la clase.
     */
    private static final Logger LOGGER = Logger.getLogger(Nodo.class.getName());
    /**
     * proximo nodo.
     */
    private Nodo next;
    /**
     * data dentro del nodo.
     */
    private E data;

    /**
     * constructor del nodo.
     * @param data
     */
    Nodo(E data) {
        this.data = data;
        this.next = null;
    }

    /**
     * ver proximo nodo
     * @return proximo nodo.
     */
    Nodo seeNext() {
        LOGGER.info("entrando al metodo seeNext");
        Nodo nodo= null;
        try {
            nodo =  this.next;
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.info("saliendo del metodo seeNext");
        return nodo;
    }

    /**
     * agregar nodo
     * @param n
     */
    void add(Nodo n){
        LOGGER.info("entrando del metodo add");
        try {
            this.next = n;
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.info("saliendo del metodo add");
    }

    /**
     * ver data del nodo.
     * @return
     */
    Object seeData() {
        LOGGER.info("entrando del metodo seeData");
        Object data = null;
        try {
            data = this.data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        LOGGER.info("saliendo del metodo seeData");
        return data;
    }
}
