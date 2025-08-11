package com.xworkz.student.service;

import com.xworkz.student.dto.StudentDTO;
import com.xworkz.student.repository.StudentRepository;
import com.xworkz.student.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService{
    @Override
    public String validate(StudentDTO studentDTO) {
        System.out.println("Connected to Service");
        if(studentDTO!=null){
            int studentId=studentDTO.getStudentId();
            String name=studentDTO.getName();
            String email=studentDTO.getEmail();
            String phoneNumber=studentDTO.getPhoneNumber();
            String gender=studentDTO.getGender();
            String course=studentDTO.getCourse();
            String department=studentDTO.getDepartment();
            int year=studentDTO.getYear();

            StudentRepository studentRepository=new StudentRepositoryImpl();
            studentRepository.save(studentDTO);
        }
        return "details saved successfully";
    }
}
