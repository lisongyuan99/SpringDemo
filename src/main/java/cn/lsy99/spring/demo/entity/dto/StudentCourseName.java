package cn.lsy99.spring.demo.entity.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentCourseName {
    private String studentName;
    private String courseName;
    private int score;
}
