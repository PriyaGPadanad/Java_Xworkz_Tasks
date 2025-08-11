package com.xworkz.student.repository;

import com.xworkz.student.dto.StudentDTO;

import java.util.List;

public interface StudentRepository {
    String save(StudentDTO studentDTO);

    List<StudentDTO> getData();
}
