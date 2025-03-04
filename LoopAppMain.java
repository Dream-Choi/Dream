import siat.study.loop.LoopApp;

public class LoopAppMain {
    public static void main(String[] args) {
        LoopApp app = LoopApp.builder().build();
        //int result=app.sumOneToTen();
       // String result = app.sumStartToEnd(1, 100);
       //String result=app.sumStartToEndWhile(1, 100);
       //String result2=app.sumStartToEndDoWhile(1, 100);
       app.loopBreak(100);
       app.randomSum();
       app.popStr("jslim");
       app.gugudanRow();
       app.gugudanTables();
       app.printIJ();

    }
}
