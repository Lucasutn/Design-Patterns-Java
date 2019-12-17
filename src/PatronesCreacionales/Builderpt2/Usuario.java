package PatronesCreacionales.Builderpt2;

public class Usuario {

    private String nombre;
    private String apellido;

    private boolean medioContacto; //Opcional

    private String email;
    private String telefono;
    private String direccion;

    //metodoPago //<- Si y solo los tres attr tienen valor (email,tel,direc)
    //String token

    public BuilderUsuario setMedioContacto(boolean medioContacto) {

        if(!medioContacto){
            throw new IllegalArgumentException("No es posible asignar un valor falso");
        }

        this.medioContacto = medioContacto;
        return new BuilderUsuario(this);

    }

    private Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

        this.medioContacto = false;

        this.email = "";
        this.telefono = "";
        this.direccion = "";
    }

    public static Usuario Make(String nombre, String apellido) {
        return new Usuario(nombre, apellido);
    }


    public String getEmail() {
        return email;
    }


    public String getTelefono() {
        return telefono;
    }

    public Usuario setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public String getDireccion() {
        return direccion;
    }



    @Override
    public String toString() {
        return nombre + " " +
                apellido + " " +
                email + " " +
                telefono + " " +
                direccion;
    }


    public static class BuilderUsuario{

        private Usuario usuario;

        public BuilderUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        public BuilderUsuario setEmail(String email) {
            usuario.email = email;
            return this;
        }

        public BuilderUsuario setTelefono(String telefono) {
            usuario.telefono = telefono;
            return this;
        }

        public BuilderUsuario setDireccion(String direccion) {
            usuario.direccion = direccion;
            return this;
        }

        public Usuario Build() {
            return usuario;
        }



    }
}
