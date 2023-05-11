package com.likelion.codeup.week4.day18;
import java.util.*;

class Student {
		private String code;
		private int testId;
		private String name;

		public Student(String code, int testId, String name) {
				this.code = code;
				this.testId = testId;
				this.name = name;
		}

		public String getCode() {
				return code;
		}

		public int getTestId() {
				return testId;
		}

		public String getName() {
				return name;
		}
}

public class CodeUp3108 {
		// 멤버변수 => List Student 타입 students 찹조변수 생성 => ArrayList 생성[인스턴스화]
		private List<Student> students = new ArrayList<>();

		// makeAStudent code, testId, name 을 받아와 주는 메서드
		public Student makeAStudent(String code, int testId, String name) {
				return new Student(code, testId, name);
		}

		// isDuplicated boolean type 메서드[중복 코드 확인]
		private boolean isExist(Student pStudent) {
				// 중복 여부 check
				for (Student student : students) {
						// 중복 코드 check
						if(pStudent.getTestId() == student.getTestId()){
								return true;
						}
				}
				// false
				return false;
		}

		//
		private Student getExistStudent(Student pStudent) {

				return new Student("", 0, "");
		}


		// 값을 추가해주는 메서드
		private void addAStudent(Student student) {
				// 값을 추가해주는 내부 코드
				if (!isExist(student)) {
						students.add(student);
				}
		}

		// 값을 제거해주는 메서드
		// pStudent가 students에 몇번째에 있는지 알아야 함
		private void deleteStudent(Student pStudent) {
				// students size 만큼 루프~!
				for (int i = 0; i < students.size(); i++) {
						// 값이 있으면 지우고 없으면 넘어감!
						if(students.get(i).getTestId() == pStudent.getTestId()){
								students.remove(i);
						}
				}
		}

		// 조건에 해당되면 값을 추가하고 아니면 제거해주는 메서드
		public void process(String line) {
				//
				String[] splitted = line.split(" ");
				Student student = makeAStudent(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);

				if ("I".equals(student.getCode())) {
						addAStudent(student);
				}else {
						deleteStudent(student);
				}
		}

		// 출력해주는 메서드
		private void printStudents() {
				for (Student student : students) {
						System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
				}
		}

		//
		private void printSpecificStudents(int[] arr) {
				// 정렬
				Collections.sort(students,new Comparator<Student>() {
						@Override
						public int compare(Student o1, Student o2) {
								return o1.getTestId() - o2.getTestId();
						}
				});

				for (int i = 0; i < arr.length; i++) {
						Student student = students.get(arr[i] - 1);
						System.out.println(student.getTestId() + " " + student.getName());
//            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
				}
		}

		// Main method
		public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				CodeUp3108 codeup3108 = new CodeUp3108();
				int size = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < size; i++) {
						String line = sc.nextLine();
						codeup3108.process(line);
				}
				String[] arr2 = sc.nextLine().split(" ");
				int[] arr3 = new int[arr2.length];
				for (int i = 0; i < arr2.length; i++) {
						arr3[i] = Integer.parseInt(arr2[i]);
				}
				codeup3108.printSpecificStudents(arr3);
		}
}
