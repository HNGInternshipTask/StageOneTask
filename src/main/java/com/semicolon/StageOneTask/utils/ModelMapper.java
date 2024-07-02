package com.semicolon.StageOneTask.utils;

import com.semicolon.StageOneTask.dto.response.IpapiResponse;
import com.semicolon.StageOneTask.dto.response.VisitorResponse;

public class ModelMapper {
    public static VisitorResponse map(IpapiResponse ipapiResponse) {
        VisitorResponse response = new VisitorResponse();
        response.setClientIp(ipapiResponse.getIp());
        response.setLocation(ipapiResponse.getCity());
        return response;
    }
}
