package ex_19_OOPs_Part2.superKeyword;

public class Lab166_Param_C {
    public static void main(String[] args) {
        Mobile iphone = new Mobile("iphone","2008");
        Mobile oneplus = new Mobile("One Plus", "2015");
        Mobile samsung = new Mobile("Ultra 25 AI", "2025");
        System.out.println(iphone.Model_name);
        System.out.println(oneplus.Model_name);
        System.out.println(samsung.Model_name);
        System.out.println(samsung.year_of_launch);
        System.out.println(iphone.year_of_launch);


        samsung.display();
        String model_name_main = samsung.give_Model_name();
        System.out.println(model_name_main);
    }
}
class Mobile {
    String Model_name;
    String year_of_launch;

    Mobile(String Model_name_C, String year_of_launch_C) {
        this.Model_name = Model_name_C;
        this.year_of_launch = year_of_launch_C;

    }

    void display() {
        System.out.println(this.Model_name + "-" + this.year_of_launch);
    }

    String give_Model_name() {
        return this.Model_name;
    }
}
