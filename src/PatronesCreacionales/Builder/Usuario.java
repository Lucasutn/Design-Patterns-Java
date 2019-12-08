package PatronesCreacionales.Builder;

public class Usuario {

    private String nombre;
    private String apellido;

    private String email;
    private String telefono;
    private String direccion;

    private Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        
        this.email = "";
        this.telefono = "";
        this.direccion = "";
    }

    public static Usuario Make(String nombre, String apellido){
        return new Usuario(nombre,apellido);
    }

    public Usuario Build(){
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Usuario setEmail(String email) {
        this.email = email;
        return this;
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

    public Usuario setDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    @Override
    public String toString() {
        return  nombre + " " +
                 apellido + " " +
                 email + " " +
                 telefono + " " +
                 direccion ;
    }
}
