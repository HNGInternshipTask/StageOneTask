package com.semicolon.StageOneTask.services;

import com.semicolon.StageOneTask.dto.request.TemperatureRequest;
import com.semicolon.StageOneTask.dto.response.TemperatureResponse;

public interface TemperatureService {
    TemperatureResponse getTemperature(TemperatureRequest request);
}
