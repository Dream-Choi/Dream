import java.io.IOException;

public class ExceptionAppMain {

    public static void main(String[] args) throws Exception {
        ExceptionApp app =new ExceptionApp();
        /*app.printAry(new String[]{"Dream", "siat"});
        ///////
        String str=null;
        try {
            str = app.inputStr();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            System.out.println("예외발생과 상관없이 실행되는 블럭");
        }
        System.out.println(str);
        */
        app.first(-1);
    }

}