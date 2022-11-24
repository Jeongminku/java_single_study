package ch08.Interface.Q;

public class DaoEX {

	public static void dbWork(DataAccessObject7 dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	
	public static void main(String[] args) {
		dbWork(new OracleDao7());
		dbWork(new MySqlDao7());

	}

}
