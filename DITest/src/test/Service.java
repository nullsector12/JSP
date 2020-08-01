package test;

public class Service {
	
	// Service 클래스는 Dao 클래스에 의존한다. 의존관계가 높음
	// Dao dao = new Dao();
	
	
	// 의존성을 줄인 구성 -> Dao를 인터페이스 구성을 해주고 상위 클래스로 종속해주면 구성에 문제가 없음 (다형성)

	Dao dao; 
	
	// 원래는 객체를 선언하고 생성자를 생성해줘야한다.
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	// MemberDao dao;
	// MemberDao2 dao;
	
	// Spring Framework 에서는  객체 생성 시 설정에 따라 interface에 의존성을 주입해준다.(DI)
	public void print () {
		dao.print();
	}
	
	 
	
}
