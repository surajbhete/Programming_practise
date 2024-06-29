package com.suraj1.example1.Controller;
import com.suraj1.example1.Entity.Pen;
import com.suraj1.example1.service.PenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pen")
public class Controller {

    @Autowired
    private PenService penService;

    @PostMapping
    public Pen createPen(@RequestBody Pen pen) {

        return penService.createPen(pen);

    }

}
