package gm.cuentas.servicio;

import gm.cuentas.model.Cuenta;
import java.util.List;

public interface ICuentaServicio {
    public List<Cuenta> listaCuenta();

    public Cuenta buscarCuentaPorId(Integer IdCuenta);

    public void guardarCuenta(Cuenta cuenta);

    public void eliminarCuenta(Cuenta cuenta);
}
