package com.gyftonikolos.cruddemo.dao;

import com.gyftonikolos.cruddemo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

}
