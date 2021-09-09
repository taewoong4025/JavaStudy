package evaluation;

import java.util.Scanner;

public class ktw7 {
   public static void main(String[] args) {
      int p_num; // 등록할 인원 수
      String searchName = null; // 이름 찾기 위한 변수

      Scanner sc = new Scanner(System.in);
      System.out.print("인원수 >>");
      p_num=sc.nextInt(); //인원 몇명 받을지 입력
      String[] name = new String[p_num]; //받는인원 수만큼 이름 배열 생성
      String[] phoneNumber = new String[p_num]; //받는 인원 수만큼 전화번호 배열 생성

      for (int i = 0; i < p_num; i++) { // 받은 인원 수 만큼 반복 
         System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
         name[i]=sc.next(); // 순차적으로 배열에 담는다.
         phoneNumber[i]=sc.next();
         if(i==(p_num)-1) { // i가 0,1,2...증가하고 p_num-1 과 같아지면 반복문 다 돈것이므로 저장되었습니다. 출력
            System.out.println("저장되었습니다.");
         }
      }
      while(true) { // 무한 반복으로 검색 시작.

         System.out.println("검색할 이름 >>");
         searchName=sc.next(); //검색할 이름 받을 변수.
         boolean flag = false;

         if(searchName.equals("그만")) { //그만을 입력하면 검색 종료.
            System.out.println("검색을 종료합니다.");
            break;
         }
         else { //아니면 계속 검색
            for (int i = 0; i < p_num; i++) { // 받은 수 만큼 반복하여
               if(searchName.equals(name[i])) { // 입력한 이름과 배열에 담긴 이름이 같다면
                  System.out.println(name[i]+"의 번호는 "+phoneNumber[i]+"입니다.");// 이름과 전화번호 출력.
                  flag=true; //이 때 flag 변수를 true로 바꿔줌.
               }

            }
            if(!flag) { // flag==false 즉, 배열안에 같은이름이 없으면 검색한이름 그대로 출력.
               System.out.println(searchName+"이(는) 없습니다.");
            }
         }
      }
      sc.close();
   }
}