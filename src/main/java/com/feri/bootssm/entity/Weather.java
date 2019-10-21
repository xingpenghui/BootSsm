package com.feri.bootssm.entity;

import lombok.Data;

/**
 * @program: BootSsm
 * @description:
 * @author: Feri
 * @create: 2019-10-21 10:25
 */
@Data
public class Weather {
    private int id;
    private String temperature;
    private String weather;
    private String wind;
    private String weak;
    private String date_y;
    private String city;
}