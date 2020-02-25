package PatronesDeComportamiento.State;

public class Auto implements IEstadoAuto {

    private IEstadoAuto autoEncendido;
    private IEstadoAuto autoMovimiento;
    private IEstadoAuto autoApagago;

    private IEstadoAuto estadoActual;

    public Auto() {

        this.autoEncendido = new AutoEncender(this);
        this.autoMovimiento = new AutoManejar(this);
        this.autoApagago = new AutoApagar(this);

        this.estadoActual = this.autoApagago;
    }

    @Override
    public void encender() {

        this.estadoActual.encender();

    }

    @Override
    public void manejar() {

        this.estadoActual.manejar();
    }

    @Override
    public void apagar() {

        this.estadoActual.apagar();

    }

    public IEstadoAuto getAutoEncendido() {
        return autoEncendido;
    }

    public void setAutoEncendido(IEstadoAuto autoEncendido) {

        this.autoEncendido = autoEncendido;

    }

    public IEstadoAuto getAutoMovimiento() {

        return autoMovimiento;

    }

    public void setAutoMovimiento(IEstadoAuto autoMovimiento) {

        this.autoMovimiento = autoMovimiento;

    }


    public IEstadoAuto getAutoApagago() {

        return autoApagago;

    }

    public void setAutoApagago(IEstadoAuto autoApagago) {

        this.autoApagago = autoApagago;

    }


    public IEstadoAuto getEstadoActual() {

        return estadoActual;

    }

    public void setEstadoActual(IEstadoAuto estadoActual) {

        this.estadoActual = estadoActual;

    }

}
