public class smartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume += 1;
    }

    public void diminuirVolume(){
        volume -= 1;
    }

    public void passarCanal(){
        canal += 1;
    }

    public void voltarCanal(){
        canal -= 1;
    }

}
