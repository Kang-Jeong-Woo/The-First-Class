package com.first.boiler.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PopulationVO {
    private String popul_dong;
    private Integer popul_cnt;
    private String admin_id;
}
