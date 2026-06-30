package com.example.crud.repository;

import com.example.crud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    List<Student> getStudentsByTechnology(String  technology);

    @Query(nativeQuery = true,value = "SELECT * FROM Student Where gender = :gender AND technology = :technology")

    List<Student> getStudentsByGenderAndTechnology(@Param("gender")  String gender, @Param("technology") String technology);
}
