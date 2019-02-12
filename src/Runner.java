//Written by Rayna Carter
//2019
public class Runner {
    public static void main(String[]args){
        Car myCar= new Car(2019, "A4", "audi");
        System.out.println(myCar.toString());
        myCar.drive(1000);
        System.out.println(myCar.toString());

        Rectangle myRect = new Rectangle(2,2);
        System.out.println(myRect.toString());
        Rectangle myRect1 = new Rectangle(3,4);
        System.out.println(myRect1.toString());
        Rectangle myRect2 = new Rectangle(9,12);
        System.out.println(myRect2.toString());
    }


}
