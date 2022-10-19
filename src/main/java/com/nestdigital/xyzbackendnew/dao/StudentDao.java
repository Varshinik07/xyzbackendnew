package com.nestdigital.xyzbackendnew.dao;

import com.nestdigital.xyzbackendnew.model.StudentModel;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<StudentModel,Integer> {

}
