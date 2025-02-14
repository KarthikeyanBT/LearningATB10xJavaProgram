package ex_17_OOPs;

public class Lab161_Cats {
    public static void main(String[] args) {
        cats c1 = new cats();
        c1.running();
        cats c2 = null;
        new cats();
        c2.running();//nullpointexception
    }
}
class cats {
void running()
{
 System.out.println("running");
}
}
