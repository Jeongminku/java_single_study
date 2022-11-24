package ch10.Exception.Q;

public class LoginEX07 {

	public static void main(String[] args) {
		
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
	}

	public static void login(String id, String password) throws NotExistIDException07, WrongPasswordException07 {
		//id가 blue가 아니라면 NotExistIDException을 발생시킴
		if(!id.equals("white")) {
			throw new NotExistIDException07("아이디가 존재하지 않습니다.");
		}
		if(!password.equals("12345")) {
			throw new WrongPasswordException07("비밀번호가 틀립니다.");
		}
	}

}
