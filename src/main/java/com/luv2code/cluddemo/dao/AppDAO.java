package com.luv2code.cluddemo.dao;

import com.luv2code.cluddemo.entity.Instructor;
import com.luv2code.cluddemo.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);
}
