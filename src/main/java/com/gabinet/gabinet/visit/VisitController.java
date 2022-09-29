package com.gabinet.gabinet.visit;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/visit")
@RestController
public class VisitController {

    private final VisitService visitService;

    public VisitController(VisitService visitService) {
        this.visitService = visitService;
    }

    @PostMapping("/add")
    public Visit add(@ModelAttribute Visit visit) {
        return visitService.add(visit);
    }

    @GetMapping("/all")
    public List<Visit> all(){
        return visitService.all();
    }



}
