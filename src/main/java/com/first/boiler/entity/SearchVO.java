package com.first.boiler.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SearchVO {
    private int srch_sql;
    private String srch_dong;
    private String srch_category;
    private int srch_cnt;
}
