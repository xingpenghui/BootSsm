package com.feri.bootssm.dao;

import com.feri.bootssm.entity.Weather;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WeatherDao {
    @Insert("insert into t_weather(temperature ,weather ,wind ,weak ,date_y ,city) values(#{temperature} ,#{weather} ,#{wind} ,#{weak} ,#{date_y} ,#{city})")
    int save(Weather weather);
    @Select("select * from t_weather order by id desc")
    @ResultType(Weather.class)
    List<Weather> selectAll();
}
