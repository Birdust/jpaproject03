package com.ict01.jpaproject03.dao;

import com.ict01.jpaproject03.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDAO {

  // [1] 전체 학생 정보 조회
  public List<StudentDTO> listStudent();

  // [2] 한 한생 조회
  StudentDTO getStudent(int id);

  // [3] 학생 정보 등록

  public int saveStudent(String name, String email, String address);

  // [4] 학생 정보 수정

  // [5] 학생 정보 삭제


}
