public class Lista {

    private int longitud;
    private Cliente[] listaClientes;

    //Cuando antes de añadir un cliente longitud = longitud + 1
    public Lista(int longitud) {
        this.longitud = longitud;
        listaClientes = new Cliente[longitud];

    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    //Estos métodos deben ir aquí? Sí, esta clase es como el arrayList
    //Debe operar con clientes e ignorar que existe un controlador.

    public void addCliente(Cliente cliente){
        longitud = longitud + 1;
        //Aquí copiamos y pegamos la lista en sí misma con el último cliente añadido
    }

    public void removeCliente(Cliente nif){
        longitud = longitud - 1;
        //Aquí copiamos y pegamos la lista sin copiar el que contiene el nif de entrada
    }

    public String mostrarClientes(){
        //Recorremos la lista y hacemos un .toString de cada cliente
        String acumulador ="";
        //acumulador = acumulador+" "+listaClientes[n].toString;
        return acumulador;
    }

}
