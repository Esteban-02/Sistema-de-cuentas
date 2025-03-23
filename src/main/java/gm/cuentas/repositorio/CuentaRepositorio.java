package gm.cuentas.repositorio;

import gm.cuentas.model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepositorio extends JpaRepository <Cuenta, Integer> {

}
