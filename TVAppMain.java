import siat.study.oop.abstraction.LgTV;
import siat.study.oop.abstraction.SamsungTV;
import siat.study.oop.abstraction.TV;
import siat.study.oop.factory.TVFactory;

public class TVAppMain {
    public static void main(String[] args) {
        //SamsungTV samsung = new SamsungTV();
        //samsung.powerOn();
        TVFactory factory =TVFactory.getInstance();
        TV tv =factory.getBrand("lg");
        tv.powerOn();
    }
}
