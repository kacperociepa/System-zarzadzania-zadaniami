
public class Projekt {
       
    int id;
    String nazwa;
   public Projekt(){
        this.id=0;
        this.nazwa="brak";
   }
   public Projekt(int a, String b){
        this.id=a;
        this.nazwa=b;
    }
   public void wyswietlInfo(){
       System.out.println("Projekt ID: "+ id + " Nazwa: "+ nazwa);
   }
}
