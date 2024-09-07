package com.example.vargenerator.api.controller;

import com.example.vargenerator.api.service.VarService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequiredArgsConstructor
@RequestMapping("/api/var")
public class VarController {
    private final VarService varService;

    @GetMapping("/")
    public void getMain(HttpServletRequest request) {
        varService.getMain(request);
    }
}
