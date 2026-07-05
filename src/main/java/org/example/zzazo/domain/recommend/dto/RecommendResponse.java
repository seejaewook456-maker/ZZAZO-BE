package org.example.zzazo.domain.recommend.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.example.zzazo.domain.lecture.domain.LectureClassification;
import org.example.zzazo.global.common.Week;

import java.time.LocalTime;
import java.util.List;

public class RecommendResponse {
    public record RecommendResult(
            int totalCredits,
            Week[] satisfiedFreeDays,
            List<lecture> timetables
    ) {

    }

    public record lecture(
            Long lectureId,
            String lectureName,
            int credit,
            LectureClassification category,
            List<LectureTime> lectureTime
            ) {
        public record LectureTime(
                Week day,
                @JsonFormat(pattern = "HH:mm")
                LocalTime startTime,
                @JsonFormat(pattern = "HH:mm")
                LocalTime endTime
        ) {

        }
    }


}
