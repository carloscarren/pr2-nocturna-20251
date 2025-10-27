package co.edu.uniquindio.programacion2.patrones_estructurales.adapter.ejemploEnchufe;

// Uso del adaptador - Adapta interfaces incompatibles para que puedan trabajar juntas.
public class MainAdapter {
    public static void main(String[] args) {
        EnchufeEuropeo enchufeEuropeo = new EnchufeEuropeo();
        IEnchufeAmericano adaptador = new AdaptadorAmericano(enchufeEuropeo);
        adaptador.conectar();  // Salida: "Enchufe europeo conectado."
    }
}
