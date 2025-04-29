package Student;

import java.util.Scanner;

public class StudentManagerment {
    StudentVO[] stus = new StudentVO[10];
    Scanner sc = new Scanner(System.in);
    private int cnt = 0;
    StudentVO stu = new StudentVO();
    
    
    public void outPut() {
        
        if(cnt ==0) {
           System.out.println("출력할 것이 없습니다.");
        }else {         
           for(int i=0;i<cnt;i++) {
              
              if(stus[i].getName().equals("null")) {
                 
              }else {
                 System.out.println("이름 : "+ stus[i].getName()+", 국어점수: " 
                       +stus[i].getKorScore() +", 수학점수 : " +stus[i].getMathScore() + ", 영어점수 : " + stus[i].getEngScore());
              }
           }
        }
     }
    

    public void delete() {
        if (cnt == 0) {
            System.out.println("삭제할 것이 없습니다.");
        } else {
            System.out.println("삭제할 이름을 말하세요.");
            String stuName = sc.next();
            for (int i = 0; i < cnt; i++) {
                if (stus[i].getName().equals(stuName)) {
                    stus[i].setName("null");
                }
            }
        }
    }

}