package com.feri.bootssm.controller;

import com.feri.bootssm.entity.Weather;
import com.feri.bootssm.service.WeatherService;
import com.feri.bootssm.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
@Api(value = "实现天气的各种操作",tags = "实现天气的各种操作")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    //新增
    @ApiOperation(value = "实现天气的新增",notes = "实现天气的新增")
    @PostMapping("api/weather/save.do")
    public R save(@ApiParam(value = "天气信息的JSON字符串") @RequestBody Weather weather){
        return weatherService.save(weather);
    }
    //查询
    @ApiOperation(value = "实现全部天气信息的查询",notes = "实现全部天气信息的查询")
    @GetMapping("api/weather/queryall.do")
    public R all(){
        return weatherService.queryAll();
    }
}
