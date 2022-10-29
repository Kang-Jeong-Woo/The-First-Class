package com.first.boiler.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommunityVO {
    private String article_seq;
    private String article_title;
    private String article_file;
    private String article_date;
    private String article_content;
    private String mb_id;
}
