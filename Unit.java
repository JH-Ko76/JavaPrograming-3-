package Chapte__05;

abstract class Unit{
	protected String name; // ��ӹ��� Ŭ������ �ѿ����� ��밡�� protected
	protected int coin = 100;
	abstract public void deccoin();
	public int getcoin(){
		return coin; //�������� ������
	}
}