public class Cliente {

    //Atributos
    private String nif;
    private String nombre;
    private String telefono;
    private String direccion;

    /**
     * Método constructor que asignará los valores introducidos como parámetros de entrada
     * a los atributos del cliente.
     * @param nif Identificador del cliente, es un conjunto de números que se almacenarán como String
     * @param nombre Hace referencia al nombre que recibe el cliente.
     * @param telefono Es el numero de telefono del cliente.
     * @param direccion La direccion local del cliente, es decir, la calle.
     */
    public Cliente(String nif, String nombre, String telefono, String direccion) {
        this.nif = nif;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Devuelve el atributo 'nif' del cliente.
     * @return nif
     */
    public String getNif() {
        return nif;
    }

    /**
     * Asigna el String 'nif' introducido como parametro de entrada al atributo 'nif' del cliente.
     * @param nif
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Devuelve el atributo 'nombre' del cliente.
     * @return nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna el String 'nombre' introducido como parametro de entrada al atributo 'nombre' del cliente.
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el atributo 'telefono' del cliente.
     * @return telefono.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Asigna el String 'telefono' introducido como parametro de entrada al atributo 'telefono' del cliente.
     * @param telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    /**
     * Devuelve el atributo 'direccion' del cliente.
     * @return direccion.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Asigna el String 'direccion' introducido como parametro de entrada al atributo 'direccion' del cliente.
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nif='" + nif + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
