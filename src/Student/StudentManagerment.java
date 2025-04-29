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
    
    public void regist() {
    	   //수정시 scanner 이쪽에서
    	      System.out.println("이름:");
    	      String name = sc.next();
    	      System.out.println("국어:");
    	      int korScore = sc.nextInt();
    	      System.out.println("수학:");
    	      int mathScore = sc.nextInt();
    	      System.out.println("영어:");
    	      int engScore = sc.nextInt();
    	      stus[cnt] = new StudentVO();
    	      stus[cnt].setName(name);
    	      stus[cnt].setKorScore(korScore);
    	      stus[cnt].setMathScore(mathScore);
    	      stus[cnt].setEngScore(engScore);
    	      cnt++;
    	   }


    	public void insert() {
    	      if(cnt ==0) {
    	         System.out.println("수정할 것이 없습니다.");
    	      }
    	      else {         
    	         System.out.println("이름");
    	         String stuName = sc.next();
    	         System.out.println("국어점수");
    	         int korScore = sc.nextInt();
    	         System.out.println("수학점수");
    	         int mathScore = sc.nextInt();
    	         System.out.println("영어점수");
    	         int engScore = sc.nextInt();
    	         for(int i=0; i< cnt; i++) {
    	            if(stus[i].getName().equals(stuName)) {
    	               stus[i].setName(stuName);
    	               stus[i].setKorScore(korScore);
    	               stus[i].setMathScore(mathScore);
    	               stus[i].setEngScore(engScore);
    	            }
    	         }
    	      }
    	   }


}