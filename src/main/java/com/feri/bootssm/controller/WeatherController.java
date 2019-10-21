package com.feri.bootssm.controller;

import com.feri.bootssm.entity.Weather;
import com.feri.bootssm.service.WeatherService;
import com.feri.bootssm.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: BootSsm
 * @description:
 * @author: Feri
 * @create: 2019-10-21 10:48
 */
@RestController
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    //新增
    @PostMapping("api/weather/save.do")
    public R save(@RequestBody Weather weather){
        return weatherService.save(weather);
    }
    //查询
    @GetMapping("api/weather/queryall.do")
    public R all(){
        return weatherService.queryAll();
    }
}
