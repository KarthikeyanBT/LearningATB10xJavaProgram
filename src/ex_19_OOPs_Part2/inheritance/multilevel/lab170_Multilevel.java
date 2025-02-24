package ex_19_OOPs_Part2.inheritance.multilevel;

public class lab170_Multilevel {
    public static void main(String[] args) {
        son karthik = new son();
        Father f = new Father();
        GrandFather gf = new GrandFather();
        karthik.home();
        //        Son s1 = new GrandFather();
//        Son s1 = new Father();
        // Son amit = new Son();

        GrandFather g1 = new son();
        GrandFather g2 = new Father();
        Father f2 = new son();
        // Father f3 = new GrandFather();




    }


}
