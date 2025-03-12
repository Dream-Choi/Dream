import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import siat.study.oop.domain.constructor.ManagerVO;
import siat.study.oop.domain.constructor.StudentVO;
import siat.study.oop.domain.constructor.TeacherVO;

public class MapApp {
    public Map getMap(){
        Map<String, List> map=new HashMap<>();
        List<StudentVO> stuLst= new ArrayList<>();
        stuLst.add(new StudentVO());
        stuLst.add(new StudentVO());
        List<TeacherVO> teaLst= new ArrayList<>();
        teaLst.add(new TeacherVO());
        teaLst.add(new TeacherVO());
        List<ManagerVO> empLst= new ArrayList<>();
        empLst.add(new ManagerVO());
        empLst.add(new ManagerVO());
        map.put("stu", stuLst);
        map.put("tea", teaLst);
        map.put("emp", empLst);
        return map;
    }
    public Map<String, String> dtoToMap(){
        Map<String, String> map=new HashMap<>();
        map.put("id", "Dream");
        map.put("pwd", "드림");
        map.put("name", "Choi");
        map.put("id", "Siat");
        return map;

    }
}
