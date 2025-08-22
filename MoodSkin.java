// MoodSkin.java
// Proyecto: MoodSkin
// Autor: Víctor Moreno Sánchez (vicms)
// Descripción: Clase básica para modelar estados emocionales como "piel" adaptable.

public class MoodSkin {

    // Atributos emocionales básicos
    private int alegria;     // 0 - 100
    private int tristeza;    // 0 - 100
    private int energia;     // 0 - 100
    private int calma;       // 0 - 100

    // Constructor por defecto
    public MoodSkin() {
        this.alegria = 50;
        this.tristeza = 50;
        this.energia = 50;
        this.calma = 50;
    }

    // Constructor personalizado
    public MoodSkin(int alegria, int tristeza, int energia, int calma) {
        this.alegria = alegria;
        this.tristeza = tristeza;
        this.energia = energia;
        this.calma = calma;
    }

    // Getters y Setters
    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = clamp(alegria);
    }

    public int getTristeza() {
        return tristeza;
    }

    public void setTristeza(int tristeza) {
        this.tristeza = clamp(tristeza);
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = clamp(energia);
    }

    public int getCalma() {
        return calma;
    }

    public void setCalma(int calma) {
        this.calma = clamp(calma);
    }

    // Método auxiliar para mantener los valores entre 0 y 100
    private int clamp(int value) {
        return Math.max(0, Math.min(100, value));
    }

    // Método que imprime el "estado actual" del MoodSkin
    public void mostrarEstado() {
        System.out.println("Estado emocional actual:");
        System.out.println("Alegría: " + alegria);
        System.out.println("Tristeza: " + tristeza);
        System.out.println("Energía: " + energia);
        System.out.println("Calma: " + calma);
    }

    // Método de ejemplo para modificar emociones
    public void aplicarEvento(String evento) {
        switch(evento.toLowerCase()) {
            case "exito":
                setAlegria(alegria + 20);
                setEnergia(energia + 10);
                break;
            case "fracaso":
                setTristeza(tristeza + 20);
                setEnergia(energia - 10);
                break;
            case "meditacion":
                setCalma(calma + 30);
                setEnergia(energia + 5);
                break;
            default:
                System.out.println("Evento no reconocido.");
        }
    }
}
