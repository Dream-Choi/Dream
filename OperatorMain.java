public class OperatorMain {
    public static void main(String[] args) {
        OperatorApp obj = new OperatorApp();
        obj.example01();
        String returnMsg= obj.example02("red", "green");
        System.out.println("result="+returnMsg);
        String www =obj.example03(3);
        System.out.println("result="+www);
        boolean returnFlag=obj.example04(10);
        String msg = (returnFlag==true)?"사이값 확인":"벗어남";
        System.out.println(msg);
    }
}
