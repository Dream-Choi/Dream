import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionApp {
    public void printAry(String [] ary){
        System.out.println("array print start");
       try{
        for(int i=0; i<=ary.length;i++){
            System.out.println(ary[i]);
        }
    } catch(ArrayIndexOutOfBoundsException e){
        e.printStackTrace();
    }
        System.out.println("array print end");
    }
    public String inputStr() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("데이터 입력:");
        String data =null;
        //try{
            data=br.readLine();
        //}catch(IOException e){
        //    e.printStackTrace();
        //}
        return data;
    }
    public void first(int x) throws Exception{
        System.out.println("1st start");
        second(x);
        System.out.println("1st end");
    }
    public void second(int x){
        System.out.println("2nd start");
        try{
           third(x); 
        }catch(Exception e){
            e.printStackTrace();
        }
        
        System.out.println("2nd end");
    }
    public void third(int x)throws Exception{
        System.out.println("3rd start");
        try{
        if(x<0){
            throw new Exception("양수를 입력하세요.");
        }
    } finally{
        System.out.println("3rd end");
        }
    }
}
