package Student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StudentVO stu = new StudentVO();
		StudentManagerment stum = new StudentManagerment();
		while (true) {
			System.out.println("1.등록 | 2.출력 | 3. 삭제 | 4. 수정 | 0. 종료");
			int stuInput = sc.nextInt();
			if (stuInput == 0) {
				break;
			}
			switch (stuInput) {
			case 1:
				stum.regist();
				break;
			case 2:
				stum.outPut();
				break;
			case 3:
				stum.delete();
				break;
			case 4:
				stum.insert();
				break;

			}
		}

	}

}
