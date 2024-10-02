package com.TechQuest.TechQuest.domain.model.entities;

import com.riwi.TechQuest.domain.model.enums.Difficulty;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name="difficulty", nullable = false)
    private Difficulty difficulty;

    @Column(name = "progress", nullable = false, length = 100)
    private Float progress;

    @JoinColumn(name = "teacher_id", referencedColumnName = "id", nullable = false)
    private UserEntity teacher_id;

    @JoinColumn(name = "student_id", referencedColumnName = "id", nullable = false)
    private UserEntity student_id;
}
