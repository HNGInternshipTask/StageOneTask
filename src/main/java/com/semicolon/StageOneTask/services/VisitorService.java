package com.semicolon.StageOneTask.services;

import com.semicolon.StageOneTask.dto.request.VisitorRequest;
import com.semicolon.StageOneTask.dto.response.VisitorResponse;

import java.io.IOException;

public interface VisitorService {
    VisitorResponse getDetails(VisitorRequest request) throws IOException;
}
