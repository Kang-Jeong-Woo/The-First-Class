package com.first.boiler.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StatisticsVO {
    private Integer sta_idx;
    private String sta_dong;
    private String sta_category;
    private Integer sta_cnt;
    private String admin_id;
}
