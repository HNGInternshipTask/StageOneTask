package com.semicolon.StageOneTask.dto.response;


import com.semicolon.StageOneTask.dto.request.MainWeatherData;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TemperatureResponse {

    private MainWeatherData main;
}
