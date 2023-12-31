package com.ict01.jpaproject03.dao;

import com.ict01.jpaproject03.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDAO {

  // [1] 전체 학생 정보 조회 (Read ==> SELECT * FROM Table_name;)
  public List<StudentDTO> listStudents();

  // [2] 개인 학생 정보 조회 (READ ==> SELECT * FROM Table_name WHERE id ...)
  public StudentDTO getStudent(int id);


  // [3] 학생 정보 등록 ( Create ==> INSERT )

  public int saveStudent(String name, String email, String address);

  // [4] 학생 정보 수정 ( Update ==> UPDATE )
  public int updateStudent(int id, String name, String email, String address);


  // [5] 학생 정보 삭제
  public int deleteStudent(String id);



}
