package com.suraj1.example1.service;

import com.suraj1.example1.Entity.Pen;
import com.suraj1.example1.Repository.PenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PenService {

    @Autowired
private PenRepository penRepository;

    public Pen createPen(Pen pen){

        return penRepository.save(pen);
    }

}

