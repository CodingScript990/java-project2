package com.likelion.week2.day8;

public class ClassInSchoolTest {
		public static void main(String[] args) {
				// ClassInSchool 인스턴스화 = Call[반, 선생님, 학생]
				ClassInSchool classInSchool = new ClassInSchool();
				classInSchool.no = 1;

				// Class Add => Teacher
				classInSchool.teacher = new Teacher();
				classInSchool.teacher.name = "선생님";
				classInSchool.teacher.age = 30;
				classInSchool.teacher.address = "경기도 어딘가";

				// Class Add => student
				classInSchool.students = new Student[30];
				// Student 를 사용할려면 현 Student 배열 생태가 아니라 인스턴스화로 하고자 하는 index 에게
				// Student 인스턴스화로 초기화 작업을 하고, 원하는 타입으로 값을 부여하고 호출하면됨!
				// [주의] 절대로 [] 인 상태로 call 할 생각하지말고, () 인 생태로 type 을 부를 것!
				classInSchool.students[0] = new Student();
				classInSchool.students[0].name = "학생1";

				// output
				System.out.println("classInSchool 1반 선생님 이름 : " + classInSchool.teacher.name);
				System.out.printf("%d반 담임 선생님 성함은 %s이고, 학생 이름은 %s입니다.", classInSchool.no, classInSchool.teacher, classInSchool.students[0].name);
		}
}
