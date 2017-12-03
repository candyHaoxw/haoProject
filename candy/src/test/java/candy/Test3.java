package candy;

//接口 必须是常量
public interface Test3 {
	public final String a = "a";
	public String b = "b";
	//接口only public, (abstract/default/static) and strictfp are permitted
	public abstract void sayHi();
	
	public static void sayme() {
		
	}
	
	public default void sayyou() {
		
	}
}
