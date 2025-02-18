package ex_18_OOPs_Constructors;

public class byk {
    String Clutch;
    String gear;

    byk(){
        String clutch = "Heavy clutch";
        String gear = "Heavy gear";
    }
    byk(String clutchheavy,String gearheavy){
        this.Clutch = clutchheavy;
        this.gear = gearheavy;
    }
}
