public class Usuario {
   public static void main(String[] args) {
       Smartv smartTv = new Smartv();


       System.out.println("Tv ligada: " + smartTv.ligada);
       System.out.println("Canal: " + smartTv.canal); 
       System.out.println("Volume: " + smartTv.volume);  

       smartTv.ligar();
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.mudarCanal(8);
       

   }
}
