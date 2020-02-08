package com.chuno.test.usecase;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class usecaseDTO {

    private Long lost_id;
    private String lost_name;
    private String lost_content;
    private String lost_photo;

    public usecase toEntity(){
        return usecase.builder()
                .lost_name(lost_name)
                .lost_content(lost_content)
                .lost_photo(lost_photo)
                .build();
    }
}
