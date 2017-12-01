package top.feilix.soa.common.util;

public class ResourceUtil {

	public static String getClasspathRoot() {
		return Thread.currentThread().getContextClassLoader().getResource(System.getProperty("File.separator")).getPath();
	}
	
	public static void main(String[] args) {
		System.out.println(getClasspathRoot());
	}
}
