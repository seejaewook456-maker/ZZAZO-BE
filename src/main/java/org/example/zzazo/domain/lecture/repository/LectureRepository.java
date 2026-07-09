package org.example.zzazo.domain.lecture.repository;

import org.example.zzazo.domain.lecture.domain.LiberalCategory;
import org.example.zzazo.domain.lecture.entity.Lecture;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LectureRepository extends JpaRepository<Lecture, Long> {

    //교양 과목목록 조회
    @EntityGraph(attributePaths = {"lectureSchedules"})
    List<Lecture> findAllByLiberalCategoryAndSemester(LiberalCategory liberalCategory,int semester);
}