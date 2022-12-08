package com.first.boiler.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Area_cVO {
    private Integer area_idx;
    private String area_a_name;
    private String area_b_name;
    private String area_name;
    private String area_name_d;
    private Integer lat;
    private String lng;
    private String area_reg_dt;
    private String area_del_dt;
    private Integer area_cnt;
    private String admin_id;
}
