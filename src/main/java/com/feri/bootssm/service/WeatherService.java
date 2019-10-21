package com.feri.bootssm.service;

import com.feri.bootssm.entity.Weather;
import com.feri.bootssm.vo.R;

public interface WeatherService {
    R save(Weather weather);
    R queryAll();
}
