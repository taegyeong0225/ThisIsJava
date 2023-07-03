package ch6;

// MemberService 클래스
public class p304_no15 {	
		String id = "hong";
		String password = "12345";
		p303_no14 member = new p303_no14(id, password);
		boolean login(String id, String password) {
			this.id = id;
			this.password = password;
			if(id.equals("hong") && password.equals("12345"))
				return true;
			else
				return false;
		}
		
		void logout(String id) {
			this.id = id;
			System.out.print(id + "님이 로그아웃 되었습니다.");
		}
		
		
}
