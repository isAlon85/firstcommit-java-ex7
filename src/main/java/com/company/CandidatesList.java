package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class CandidatesList {
    private ArrayList<Student> candidates = new ArrayList<>();

    public boolean addStudent(Student student){
        if (candidates.contains(student)) {
            return false;
        }
        candidates.add(student);
        return true;
    }

    public boolean removeStudent(Student student){
        if (!candidates.contains(student)) {
            return false;
        }
        candidates.remove(student);
        return true;
    }

    public ArrayList<Student> filter(String location){
        ArrayList<Student> candidatesFiltered = new ArrayList<>();
        for (Student student : candidates) {
            if (Objects.equals(student.getLocation(), location)) candidatesFiltered.add(student);
        }
        return candidatesFiltered;
    }

    public ArrayList<Student> filter(int remote){
        ArrayList<Student> candidatesFiltered = new ArrayList<>();
        for (Student student : candidates) {
            if (student.getRemote() == remote) candidatesFiltered.add(student);
        }
        return candidatesFiltered;
    }

    public ArrayList<Student> filter(boolean transfer){
        ArrayList<Student> candidatesFiltered = new ArrayList<>();
        for (Student student : candidates) {
            if (student.isTransfer() == transfer) candidatesFiltered.add(student);
        }
        return candidatesFiltered;
    }

    public ArrayList<Student> filter(String location, int remote, boolean transfer){
        ArrayList<Student> candidatesFiltered = new ArrayList<>();
        for (Student student : candidates) {
            if (Objects.equals(student.getLocation(), location) &&
                    student.isTransfer() == transfer &&
                    student.getRemote() == remote) candidatesFiltered.add(student);
        }
        return candidatesFiltered;
    }

    public Student findEmail(String email){
        for (Student student : candidates) {
            if (Objects.equals(student.getEmail(), email)) return student;
        } return null;
    }

    public Student findPhone(String phone){
        for (Student student : candidates) {
            if (Objects.equals(student.getPhone(), phone)) return student;
        } return null;
    }

}
