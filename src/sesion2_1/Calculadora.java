package sesion2_1;

public class Calculadora {
	public static int sum(int a, int b) {
		return (a+b);
	}
	public static int resta(int a, int b) {
		return (a-b);
	}
	public static int multiplica(int a, int b) {
		return (a*b);
	}
	public static int divide(int a, int b) {
		if(b==0) {
			return -1;
		}else {
			return (a/b);
		}
	}
}
