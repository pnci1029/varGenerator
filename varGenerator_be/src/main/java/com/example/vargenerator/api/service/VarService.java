package com.example.vargenerator.api.service;

import com.example.vargenerator.domain.repository.VarHistoryRepository;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class VarService {
    private final VarHistoryRepository varHistoryRepository;

    public void getMain(HttpServletRequest request) {

    }
}
