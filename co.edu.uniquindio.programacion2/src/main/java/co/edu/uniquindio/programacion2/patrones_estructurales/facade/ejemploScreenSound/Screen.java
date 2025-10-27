package co.edu.uniquindio.programacion2.patrones_estructurales.facade.ejemploScreenSound;

// Subsistemas complejos
class Screen {
    public void down() {
        System.out.println("Lowering the screen");
    }

    public void up() {
        System.out.println("Raising the screen");
    }
}
