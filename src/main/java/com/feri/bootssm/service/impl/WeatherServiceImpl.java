package com.feri.bootssm.service.impl;

import com.feri.bootssm.dao.WeatherDao;
import com.feri.bootssm.entity.Weather;
import com.feri.bootssm.service.WeatherService;
import com.feri.bootssm.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: BootSsm
 * @description:
 * @author: Feri
 * @create: 2019-10-21 10:30
 */
@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private WeatherDao weatherDao;
    @Override
    public R save(Weather weather) {
        if(weatherDao.save(weather)>0){
            return R.setOK("新增天气信息成功");
        }else {
           return R.setERROR();
        }
    }

    @Override
    public R queryAll() {
        return R.setOK(weatherDao.selectAll());
    }
}
