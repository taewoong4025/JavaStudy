package evaluation;

import java.util.Scanner;

public class ktw7 {
   public static void main(String[] args) {
      int p_num; // ����� �ο� ��
      String searchName = null; // �̸� ã�� ���� ����

      Scanner sc = new Scanner(System.in);
      System.out.print("�ο��� >>");
      p_num=sc.nextInt(); //�ο� ��� ������ �Է�
      String[] name = new String[p_num]; //�޴��ο� ����ŭ �̸� �迭 ����
      String[] phoneNumber = new String[p_num]; //�޴� �ο� ����ŭ ��ȭ��ȣ �迭 ����

      for (int i = 0; i < p_num; i++) { // ���� �ο� �� ��ŭ �ݺ� 
         System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
         name[i]=sc.next(); // ���������� �迭�� ��´�.
         phoneNumber[i]=sc.next();
         if(i==(p_num)-1) { // i�� 0,1,2...�����ϰ� p_num-1 �� �������� �ݺ��� �� �����̹Ƿ� ����Ǿ����ϴ�. ���
            System.out.println("����Ǿ����ϴ�.");
         }
      }
      while(true) { // ���� �ݺ����� �˻� ����.

         System.out.println("�˻��� �̸� >>");
         searchName=sc.next(); //�˻��� �̸� ���� ����.
         boolean flag = false;

         if(searchName.equals("�׸�")) { //�׸��� �Է��ϸ� �˻� ����.
            System.out.println("�˻��� �����մϴ�.");
            break;
         }
         else { //�ƴϸ� ��� �˻�
            for (int i = 0; i < p_num; i++) { // ���� �� ��ŭ �ݺ��Ͽ�
               if(searchName.equals(name[i])) { // �Է��� �̸��� �迭�� ��� �̸��� ���ٸ�
                  System.out.println(name[i]+"�� ��ȣ�� "+phoneNumber[i]+"�Դϴ�.");// �̸��� ��ȭ��ȣ ���.
                  flag=true; //�� �� flag ������ true�� �ٲ���.
               }

            }
            if(!flag) { // flag==false ��, �迭�ȿ� �����̸��� ������ �˻����̸� �״�� ���.
               System.out.println(searchName+"��(��) �����ϴ�.");
            }
         }
      }
      sc.close();
   }
}