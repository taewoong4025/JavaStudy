package JavaEx1;

public class ExForeach {
	enum Week{
	��,ȭ,��,��,��,��,��
	}
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		String[] names= {"���","��","�ٳ���","ü��","����","����"};
		
		int sum=0;
		
		for(int k : n) {
			sum+=k;
		}
	System.out.println(sum);
		
		for(String s : names) {
			System.out.println(s);
		}
		
		for(Week w : Week.values() ) {
			System.out.println(w+"����");
		
		}		
	}
}
