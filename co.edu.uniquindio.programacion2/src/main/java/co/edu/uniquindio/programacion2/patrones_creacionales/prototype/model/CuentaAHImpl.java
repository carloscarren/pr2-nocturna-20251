package co.edu.uniquindio.programacion2.patrones_creacionales.prototype.model;

import co.edu.uniquindio.programacion2.patrones_creacionales.prototype.services.ICuenta;

public class CuentaAHImpl implements ICuenta {
    private String tipo;
    private double monto;

    public CuentaAHImpl() {
        tipo = "AHORRO";
    }

    public CuentaAHImpl(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public ICuenta clonar() {
        CuentaAHImpl cuenta = null;

        try {
            cuenta = (CuentaAHImpl) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return cuenta;
    }

    @Override
    public String toString() {
        return "CuentaAHImpl [tipo=" + tipo + ", monto=" + monto + "]";
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

}
