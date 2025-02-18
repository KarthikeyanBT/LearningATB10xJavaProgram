package ex_18_OOPs_Constructors;

public class Car2 {
String model;
int year;

Car2()
{
    model ="XXX";
    year = 2025;
    System.out.println("DC");
}

Car2(String model_name, int year_created){
    //parameter constructor
    this.model =model_name;
    this.year = year_created;


}


}
