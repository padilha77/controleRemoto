public class ControleRemoto implements Controlador{

    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //métodos especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //métodos implementados da interface Controlador

    @Override   // O @Override em Java serve para indicar ao compilador que um metodo na classe filha tem a intenção de sobrescrever (substituir) um metodo da classe pai ou de uma interface
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------MENU-------");
        System.out.println("\nligado? " + this.isLigado());
        System.out.println("tocando? " + this.isTocando());
        System.out.println("volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+= 10) {
            System.out.print("o");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("\n fechando menu...");
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void aumentarVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void abaixarVolume() {
        if (this.isLigado()) {
            this.setVolume(getVolume() - 5);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !this.isTocando()) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }
    }
}
