package com.semicolon.StageOneTask.services;

import com.semicolon.StageOneTask.dto.response.VisitorResponse;

import java.io.IOException;

public interface IpAddressService {


    VisitorResponse getIp() throws IOException;
}
