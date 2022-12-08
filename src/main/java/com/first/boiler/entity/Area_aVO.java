package com.first.boiler.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Area_aVO {
    private Integer area_idx;
    private String area_name;
    private Integer lat;
    private String lng;
    private String area_reg_dt;
    private String area_del_dt;
    private String admin_id;
}
