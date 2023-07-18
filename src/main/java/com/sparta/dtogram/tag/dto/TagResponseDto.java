package com.sparta.dtogram.tag.dto;

import com.sparta.dtogram.tag.entity.Tag;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TagResponseDto {
    private Long id;
    private String name;

    public TagResponseDto(Tag tag){
        this.id = tag.getId();
        this.name = tag.getName();
    }
}
