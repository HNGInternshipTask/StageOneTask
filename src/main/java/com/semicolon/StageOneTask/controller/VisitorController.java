package com.semicolon.StageOneTask.controller;

import com.semicolon.StageOneTask.dto.request.VisitorRequest;
import com.semicolon.StageOneTask.dto.response.VisitorResponse;
import com.semicolon.StageOneTask.exception.InternalServerError;
import com.semicolon.StageOneTask.services.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class VisitorController {


    @Autowired
    private VisitorService visitorService;

    @GetMapping("/hello")
    public ResponseEntity<?> details(@ModelAttribute VisitorRequest visitorRequest) throws IOException {
        try {
            VisitorResponse response = visitorService.getDetails(visitorRequest);
            return ResponseEntity.ok().body(response);
        }catch (InternalServerError error){
            return ResponseEntity.badRequest().body(error.getMessage());
        }
    }
}

