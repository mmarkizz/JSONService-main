package com.example.JSONService.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="files")
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "files_id_seq")
    @SequenceGenerator(name = "files_id_seq", sequenceName = "files_id_seq", allocationSize = 1)
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "creation_date", nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    @CreationTimestamp
    private LocalDateTime creationDate;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "file_content", nullable = false)
    private String fileContent;

    @Column(name = "title", nullable = false)
    private String title;


}
