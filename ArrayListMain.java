/*
 Collection API
 -list(중복허용, 순서존재, 객체를 요소로 갖음, 가변길이)
 -set(중복허용안함, 순서존재안함, 객체를 요소로 갖음, 가변길이)

 -map({key:value}가지고있는 자료구조)(컬렉션 api는 아님)


 Wrapper Class:int ->Integer, boolean->Boolean
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import siat.study.oop.domain.constructor.ManagerVO;
import siat.study.oop.domain.constructor.PersonVO;
import siat.study.oop.domain.constructor.StudentVO;
import siat.study.oop.domain.constructor.TeacherVO;

public class ArrayListMain {
    public static void main(String[] args) {
        //Array
        int []ary=new int[5];
        ary[0]=10;
        ary[1]=20;
        ary[2]=30;
        ary[3]=40;
        ary[4]=50;
        System.out.println(ary.length);
        ary[2]=0;
        System.out.println(Arrays.toString(ary));
        System.out.println("------List");
        List lst= new Vector();
        lst.add(new StudentVO());
        lst.add("jslim");
        lst.add(1);
        lst.add(true);
        System.out.println("length:"+lst.size());
        lst.remove(0);
        System.out.println("length:"+lst.size());
        System.out.println("get:"+lst.get(0));
        System.out.println("-----");
        List<String> strLst=new ArrayList();
        strLst.add("siat");
        strLst.add("jslim");
        ///////
        List<PersonVO> perLst = new ArrayList<PersonVO>();
        perLst.add(new StudentVO("Park", "Seoul", "2018"));
        perLst.add(new TeacherVO("jslim","Seoul","java"));
        perLst.add(new ManagerVO("Lee","Seoul","Siat"));
        for(int i=0;i<perLst.size();i++){
            PersonVO obj =perLst.get(i);
            System.out.println(obj.perInfo());
        }
        System.out.println("------enhanced loop");
        for(PersonVO entity:perLst){
            System.out.println(entity.perInfo());
        } 
        System.out.println("-------Iterator");
        Iterator<PersonVO> ite =perLst.iterator();
        while (ite.hasNext()) {
            PersonVO per= ite.next();
            System.out.println(per.perInfo());
        }

    }
}
