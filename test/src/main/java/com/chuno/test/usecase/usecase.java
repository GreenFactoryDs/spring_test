package com.chuno.test.usecase;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor //기본 생성자
public class usecase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lost_id;

    private String lost_name;
    private String lost_content;
    private String lost_photo;

    @Builder
    public usecase(String lost_name, String lost_content,String lost_photo) {
        this.lost_content= lost_content;
        this.lost_name = lost_name;
        this.lost_photo = lost_photo;
    }
}
