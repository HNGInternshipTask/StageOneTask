package com.semicolon.StageOneTask.services.implementation;

import com.semicolon.StageOneTask.dto.response.IpapiResponse;
import com.semicolon.StageOneTask.dto.response.VisitorResponse;
import com.semicolon.StageOneTask.exception.InternalServerError;
import com.semicolon.StageOneTask.services.IpAddressService;
import com.semicolon.StageOneTask.utils.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IpAddressServiceImpl implements IpAddressService {


    @Override
    public VisitorResponse getIp() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "java-ipapi-v1.02");

        IpapiResponse ipapiResponse = restTemplate.getForObject(System.getenv("IPAPI_BASE_URL"),IpapiResponse.class,headers);
        if (ipapiResponse == null){
            throw new InternalServerError("Internal Server Error");
        }
        return ModelMapper.map(ipapiResponse);
    }
}
