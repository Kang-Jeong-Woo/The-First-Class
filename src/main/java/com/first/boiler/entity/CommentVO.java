package com.first.boiler.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommentVO {
    private String cmt_seq;
    private String article_seq;
    private String cmt_content;
    private String cmt_date;
    private String md_id;
}
