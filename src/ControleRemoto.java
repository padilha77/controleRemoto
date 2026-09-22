public class ControleRemoto implements Controlador{

    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //métodos especiais

    public ControleRemoto(int volume, boolean ligado, boolean tocando) {
        this.volume = 0;
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

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void abrirMenu() {

    }

    @Override
    public void fecharMenu() {

    }

    @Override
    public void ligarMudo() {

    }

    @Override
    public void desligarMudo() {

    }

    @Override
    public void aumentarVolume() {

    }

    @Override
    public void abaixarVolume() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }
}
