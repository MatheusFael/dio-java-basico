public  class Smartv {


    boolean ligada = false;
    int canal  = 1;
    int volume  = 25;


    public void  ligar(){
        ligada  = true;
    }


    public void mudarCanal(int novoCanal){
        canal = novoCanal;

        System.out.println("Canal: " + canal);
    }


    public void aumentarVolumeCanal(){
        canal++;
        System.out.println("Canal: " + canal);
    }

    public void diminuirVolumeCanal(){
        canal--;
        System.out.println("Canal: " + canal);
    }

    public void  desligar(){
        ligada  = false;
    }

    public void  aumentarVolume(){
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume: " + volume);
    }
}