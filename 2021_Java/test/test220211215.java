import java.util.*;
public class test220211215 {

	public static void main(String[] args) {
		String[] name= {"Life","is","too","short"};
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+" ");
		}
		System.out.println();
		
		Scanner input=new Scanner(System.in);
		int[] randomnum=new int[3];
		Random random=new Random();
		int randomchar1=random.nextInt(5)+1;
		randomnum[0]=randomchar1;
		int randomchar2=random.nextInt(5)+1;
		randomnum[1]=randomchar2;
		int randomchar3=random.nextInt(5)+1;
		randomnum[2]=randomchar3;
		
		
		System.out.println(randomnum[0]);
		System.out.println(randomnum[1]);
		System.out.println(randomnum[2]);
		
	int j;
		for (int i = 0; i < randomnum.length; i++) {
				System.out.printf("%d��° ���� ���ڸ� �Է��ϼ���",i+1);
				int firstnum=input.nextInt();
				if(firstnum==randomnum[i])
				{
					if(i==2)
					{
						System.out.println("����!");
						break;
					}
					System.out.println("�¾ҽ��ϴ� ���� ���ڸ� �Է��Ͻÿ�");
					continue;
				}
				else
				{
					for (j = 2; j >=0; j--) {
						if(j==0)
						{
							break;
						}
						System.out.printf("Ʋ�Ƚ��ϴ� ���� ��ȸ %d\n",j);
						System.out.print("���� ���ڸ� �Է��ϼ���");
						firstnum=input.nextInt();
						if(firstnum==randomnum[i])
							break;
					}
					if(j==0)
					{
						System.out.printf("����! ���� ���ڴ� %d %d %d �Դϴ�\n",randomchar1,randomchar2,randomchar3);
						break;
					}
				}
			}
			
		
	}
}
