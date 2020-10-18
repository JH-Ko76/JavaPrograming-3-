package Chapte__05;

class UnitTest 
{
	public static void main(String[] args) 
	{ //자식 3개를 따로 따로  정의해도 함수이름이 똑같아도 잘 돌아가는 것을 보여줌 
		
		High high = new High("상급",true);
		high.deccoin();
		System.out.println("등급 상의 지원금은 : "+ high.getcoin());
		
		middle Middle = new middle("중간",false);
		Middle.deccoin();
		System.out.println("중간 등급의 지원금은 : "+ Middle.getcoin());
		
		Low low = new Low("하급",false);
		System.out.println("하위 등급의 지원금은 : "+ low.getcoin());
		
		Chaebeol chae = new Chaebeol("미해당",false);
		System.out.println("해당안되지 않음 :" + chae.getcoin());
	}
}
