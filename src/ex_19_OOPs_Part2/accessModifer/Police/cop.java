package ex_19_OOPs_Part2.accessModifer.Police;

public class cop {
    public int gun;
    String icard;

    public cop(int gun)
    {
       this.gun =gun;
    }

    protected void canIshoot(){
        System.out.println("yes you can shoot");
    }


}
