package org.jmarquezs.DAO;

public interface UsuarioDAO {
	public static boolean readUser(String email, String password) {
		return false;
	}
	public static String readRol(String usuario) {
		return null;
	}
	
	public static void register(String email, String password, String name) {
	}
	
	public static boolean readUserIfExist(String email) {
		return false;
	}
}