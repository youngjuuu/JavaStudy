package ch08_collection;

import java.util.ArrayList;

public class CollectionList {

	public static void main(String[] args) {
		/*
		 * 컬렉션 프레임워크는 데이터를 보다 쉽게 다룰 수 있도록 재사용
		 * 재사용 가능한 컬렉션 클래스를 제공함
		 * List, Set, Map
		 * 1. List : 순서대로 객체를 저장하는 구조, 중복된 원소를 허용
		 * 			 원소에 접근하기 위해 인덱스를 사용
		 * 			 대표 : ArrayList, LinkedList
		 * 2. Set  : 중복을 허용하지 않는 객체의 모음
		 * 			 원소의 순서는 보장하지 않음
		 * 			 대표 : HashSet, TreeSet
		 * 3. Map  : 키와 값의 쌍으로 이루어진 객체를 저장하는 구조
		 * 			 키는 중복될 수 없으며 각 키는 하나의 값을 가리킴
		 * 			 대표 : HashMap, TreeMap  */
		
		
		//ArrayList(동적 배열형태)
		ArrayList<String> students = new ArrayList<>();
	//	ArrayList<String> students = new ArrayList<String>(); 오른쪽은 생략가능
		// <> <== 이부분은 제네릭(Generic)이라고 함.
		// 코드에서 타입의 안정성을 보정할 수 있으면 불필요한 캐스팅을 줄이기 위해
		// 제네릭은 객체(참조타입)만 담을 수 있음.
		// Wrapper Class(기본타입을 객체로 만든 클래스 int, boolean..)
		ArrayList<Integer> intList = new ArrayList<>();
		
		//list 기본 메서드 .add(요소) 요소 추가시 사용
		intList.add(5);
		intList.add(10);
		System.out.println(intList);
		students.add("짱구");
		students.add("맹구");
		System.out.println(students);
		
		//.get(인덱스) 해당 인덱스의 값을 리턴
		System.out.println(intList.get(0));
		System.out.println(students.get(0));
		
		//.set(인덱스, 값)해당 인덱스의 값을 변경
		students.set(0, "철수");
		System.out.println(students);
		
		//.contains(값) 리스트안에 해당 값이 존재하면 true, 아닐경우 false 리턴
		System.out.println(students.contains("짱구"));
		System.out.println(students.contains("맹구"));
		
		//.indexOf(값) 리스트 안에 해당 값이 어떤 인덱스에 있는지 리턴없으면 -1
		System.out.println(students.indexOf("짱구"));
		System.out.println(students.indexOf("맹구"));
		
		//.isEmpty() 리스트가 비어 있는지 체크 true/false
		System.out.println(students.isEmpty());
		
		//.size()리스트의 요소 수
		System.out.println(students.size());
		
		//.remove(값) 해당 값이 있으면 삭제 없으면 아무도 안일어남.
		students.remove("짱구");
		
		//.clear() 시스트 비움(size 0됨)
		students.clear();
		System.out.println(students);
		
		
		students.add("강성준");
        students.add("권보성");
        students.add("권유빈");
        students.add("김기찬");
        students.add("김대영");
        students.add("김동우");
        students.add("김동현");
        students.add("김명기");
        students.add("김영주");
        students.add("김유정");
        students.add("김은혜");
        students.add("김휘건");
        students.add("나항진");
        students.add("문성민");
        students.add("박진기");
        students.add("백현진");
        students.add("오정연");
        students.add("유하영");
        students.add("이예진");
        students.add("이용빈");
        students.add("정유진");
        
        
        for(int i= 0; i<students.size();i++) {
        	if(students.contains("김영주")) {
        		System.out.println("김영주님의 출석번호: "+(students.indexOf("김영주")+1));
        		break;
        	}
        }
		//1. 리스트 복사(얕은 복사)
        ArrayList<String> stu = students;
        System.out.println(stu);
        stu.set(0, "성준");
        System.out.println(stu);
		System.out.println(students);
		
		//2. 깊은 복사
		ArrayList<String> stu2 = new ArrayList<String>(stu);
		ArrayList<String> stu3 = new ArrayList<String>();
		
		
		
		

	}

}
