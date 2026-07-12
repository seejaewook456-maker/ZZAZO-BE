package org.example.zzazo.domain.timetable.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "lecture")
public class Lecture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lecture_id")
    private Long lectureId;

    @Column(name = "lecture_name", nullable = false)
    private String lectureName;

    @Column(name = "credit", nullable = false)
    private int credit;

    @Column(name = "course_classification", nullable = false, length = 50)
    private String courseClassification;

    @Column(name = "liberal_category", length = 50)
    private String liberalCategory;

    @Column(name = "lecture_year", nullable = false)
    private int lectureYear;

    @Column(name = "semester", nullable = false)
    private int semester;

    @Column(name = "grade", nullable = false)
    private int grade;

    @Column(name = "classroom", length = 50)
    private String classroom;

    @Column(name = "professor", length = 50)
    private String professor;

    @Column(name = "course_code", nullable = false)
    private String courseCode;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    protected Lecture() {
    }

    public Lecture(
            String lectureName,
            int credit,
            String courseClassification,
            String liberalCategory,
            int lectureYear,
            int semester,
            int grade,
            String classroom,
            String professor,
            String courseCode
    ) {
        this.lectureName = lectureName;
        this.credit = credit;
        this.courseClassification = courseClassification;
        this.liberalCategory = liberalCategory;
        this.lectureYear = lectureYear;
        this.semester = semester;
        this.grade = grade;
        this.classroom = classroom;
        this.professor = professor;
        this.courseCode = courseCode;
    }

    public Long getLectureId() {
        return lectureId;
    }
}
