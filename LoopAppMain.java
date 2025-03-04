import siat.study.loop.LoopApp;

public class LoopAppMain {
    public static void main(String[] args) {
        LoopApp app = LoopApp.builder().build();
        //int result=app.sumOneToTen();
        int result = app.sumStartToEnd(1, 1000);
        System.out.println(result);

    }
}
