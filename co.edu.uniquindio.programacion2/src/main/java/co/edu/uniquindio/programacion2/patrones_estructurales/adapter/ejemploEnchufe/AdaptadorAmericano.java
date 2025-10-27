package co.edu.uniquindio.programacion2.patrones_estructurales.adapter.ejemploEnchufe;

public class AdaptadorAmericano implements IEnchufeAmericano {
    private EnchufeEuropeo enchufeEuropeo;

    public AdaptadorAmericano(EnchufeEuropeo enchufeEuropeo) {
        this.enchufeEuropeo = enchufeEuropeo;
    }

    @Override
    public void conectar() {
        enchufeEuropeo.enchufar();
    }
}
