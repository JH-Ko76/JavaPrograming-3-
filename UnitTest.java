package Chapte__05;

class UnitTest 
{
	public static void main(String[] args) 
	{ //�ڽ� 3���� ���� ����  �����ص� �Լ��̸��� �Ȱ��Ƶ� �� ���ư��� ���� ������ 
		
		High high = new High("���",true);
		high.deccoin();
		System.out.println("��� ���� �������� : "+ high.getcoin());
		
		middle Middle = new middle("�߰�",false);
		Middle.deccoin();
		System.out.println("�߰� ����� �������� : "+ Middle.getcoin());
		
		Low low = new Low("�ϱ�",false);
		System.out.println("���� ����� �������� : "+ low.getcoin());
		
		Chaebeol chae = new Chaebeol("���ش�",false);
		System.out.println("�ش�ȵ��� ���� :" + chae.getcoin());
	}
}
