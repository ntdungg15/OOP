//package BT_OOP;
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class StudentManagement {
//
//    // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100) .
//    private Student[] students = new Student[100];
//    private int studentCount = 0;
//
//    /**
//     * sameGroup .
//     *
//     * @param s1 .
//     * @param s2 .
//     * @return .
//     */
//    public static boolean sameGroup(Student s1, Student s2) {
//        // TODO:
//        return s1.getGroup().equals(s2.getGroup());
//    }
//
//    /**
//     * them sinh vien.
//     *
//     * @param newStudent .
//     */
//    public void addStudent(Student newStudent) {
//        // TODO:
//        if (studentCount < 100) {
//            students[studentCount] = new Student(newStudent);
//            studentCount++;
//        }
//    }
//
//    /**
//     * in sinh vien.
//     *
//     * @return .
//     */
//    public String studentsByGroup() {
//        StringBuilder result = new StringBuilder();
//        // Sắp xếp sinh viên theo lớp
//        for (int i = 0; i < studentCount - 1; i++) {
//            for (int j = i + 1; j < studentCount; j++) {
//                if (students[i].getGroup().equals(students[j].getGroup())) {
//                    Student temp = students[i + 1];
//                    students[i + 1] = students[j];
//                    students[j] = temp;
//                    break;
//                }
//            }
//        }
//
//        String currentGroup = "";
//        for (int i = 0; i < studentCount; i++) {
//            if (!students[i].getGroup().equals(currentGroup)) {
//                currentGroup = students[i].getGroup();
//                result.append(currentGroup).append("\n");
//            }
//            result.append(students[i].getInfo()).append("\n");
//        }
//
//        return result.toString();
//    }
//
//    /**
//     * xoa sinh vien.
//     *
//     * @param id .
//     */
//    public void removeStudent(String id) {
//        // TODO:
//        for (int i = 0; i < studentCount; i++) {
//            if (students[i].getId().equals(id)) {
//                for (int j = i; j < studentCount - 1; j++) {
//                    students[j] = students[j + 1];
//                }
//                studentCount--;
//                return;
//            }
//        }
//    }
//
//}