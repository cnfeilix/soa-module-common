package top.feilix.soa.common.util;


import java.util.ArrayList;
import java.util.List;

public class ListUtil {

	public static <T> List<T> newArrayList(T... elements) {
		List<T> list = new ArrayList<T>();
		for(T ele : elements) {
			list.add(ele);
		}
		return list;
	}
}
