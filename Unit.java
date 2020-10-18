package Chapte__05;

abstract class Unit{
	protected String name; // 상속받은 클래스에 한에서만 사용가능 protected
	protected int coin = 100;
	abstract public void deccoin();
	public int getcoin(){
		return coin; //에너지를 가져옴
	}
}