package com.chuno.test.usecase;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class found {

    @Id
    private String lost_id;

    private String lost_name;
    private String lost_content;
    private String lost_photo;
    private String mem_id;
}
