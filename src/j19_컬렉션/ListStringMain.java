package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ListStringMain {
	
	public static void main(String[] args) {
		String[] strArray = new String[] {"java","python","C++"};
		
		String[] strArray2 = new String[strArray.length + 1];
		
		Map<String,String> map1 = new HashMap<>();
		Map<String,String> map2 = new HashMap<>();
		Map<String,String> map3 = new HashMap<>();
		Map<String,String> map4 = new HashMap<>();
		
		map1.put("a", "홍길동");
		map2.put("b", "김민수");
		map3.put("c", "김철수");
		map4.put("d", "김아무개");
		
		List<Map<String,String>> maplist = new ArrayList();
		maplist.add(map1);
		maplist.add(map2);
		maplist.add(map3);
		maplist.add(map4);
		
		Map<String,String> map = new HashMap<>();
		
		for(int i = 0; i<maplist.size(); i++) {
			map.putAll(maplist.get(i));
		}
		
		for(Map<String,String> list : maplist) {
			System.out.print(list);
		}
		
		System.out.println();
		
		for(Entry<String, String>en : map.entrySet()) {
			System.out.println(en);
			System.out.println("key: " + en.getKey());
			System.out.println("value: " + en.getValue());
		}
		
		//key value
		
		System.out.println();
		
		
		
		for(int i = 0; i < strArray.length; i++) {
			strArray2[i] = strArray[i];
		}
		
		strArray2[strArray.length] = "html";
		
		System.out.println("strArray");
		for(String str : strArray) {
			System.out.println(str);
		}
		
		System.out.println();
		
		System.out.println("strArray2");
		for(String str : strArray2) {
			System.out.println(str);
		}
		
		System.out.println();
		///////////컬렉션//////////////////
		
		//배열과 다른점 -> 객체이다. (Class)임
		
		
		//아래와 동일 와일드카드를 쓸 때는 이렇게 써야함 -> 이렇게 쓰는 걸 추천하지않는다.
//		ArrayList<?> strList = new ArrayList<>();
//		((ArrayList<String>)strList).add("java");
//		strList.add("python");
//		strList.add("C++");
		
		//넣는 만큼 늘어난다.
		//제거하는 동시에 자동으로 index를 정리해준다.
		//자료구조와 알고리즘 ->
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("java");
		strList.add("python");
		strList.add("C");
		strList.add("C++");
		strList.add("C");
		strList.add("C++");
		strList.add("C");
		strList.remove("java");
		strList.add(3, "java");//집어넣을 index번호와 집어넣을 데이터를 집어넣음 add 메소드의 오버로딩
		strList.remove(4);//특정 index안의 값을 제거해줌
		System.out.println(strList);
		
		System.out.println();
		
		for(int i = 0; i <strList.size(); i++) {
			
			System.out.print("["+ i + "]: ");
			System.out.println(strList.get(i));
		}
		
		
		
	}

}
