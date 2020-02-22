package PatronesEstructurales.VirtualProxy;

public class ProxyServicio implements IServicio {

    private IServicio servicio; //Costoso, eso solo como ejemplo, voy a considerar este objeto como costoso
    private Usuario usuario;

    public ProxyServicio(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void escribir() {

        this.obtenerServicio().escribir();

    }

    @Override
    public void leer() {

        this.obtenerServicio().leer();

    }

    @Override
    public void actualizar() {

        this.obtenerServicio().actualizar();

    }

    @Override
    public void eliminar() {

        this.obtenerServicio().eliminar();

    }

    private IServicio obtenerServicio(){

        if(this.servicio == null){
            this.servicio = new Servicio();
        }

        return this.servicio;
    }
}
