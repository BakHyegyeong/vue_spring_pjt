package com.example.vue_spring_pjt.work.ctrl;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.vue_spring_pjt.work.domain.WorkRequestDTO;
import com.example.vue_spring_pjt.work.domain.WorkResponseDTO;
import com.example.vue_spring_pjt.work.service.WorkService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;





@RestController
public class WorkController {

    @Autowired
    private WorkService workService;
    
    @GetMapping("/works")
    public List<WorkResponseDTO> works() {
        System.out.println(">> debug : Work Ctrl Get : /works");
        List<WorkResponseDTO> result = workService.getWorks();
        return result;
    }

    @PostMapping("/save")
    public String save(@RequestBody WorkRequestDTO params) {
        System.out.println(">> debug : Work Ctrl Post : /save");
        System.out.println(">> debug request params : " + params);

        workService.addWork(params);

        return null;
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        System.out.println(">> debug : Work Ctrl Delete : /delete/id");
        System.out.println(">> debug request id : " + id);
        workService.deleteWork(id);

        return null;
    }

    @GetMapping("/find/{id}")
    public WorkResponseDTO find(@PathVariable("id") Integer id) {
        System.out.println(">> debug : Work Ctrl Get : /find/id");
        System.out.println(">> debug request id : " + id);

        return workService.findWork(id);
    }

    @PatchMapping("/update")
    public String update(@RequestBody WorkRequestDTO params ) {
        System.out.println(">> debug : Work Ctrl Post : /update/id");
        System.out.println(">> debug request id : " + params);

        workService.updateWork(params);
        
        return null;
    }

    // jenkins test
    @GetMapping("/jenkins")
    public String debugMsg() {
        System.out.println(">> debug Work Ctrl Get : /jenkins");
        return "success";
    }
    
    
    
    
    
}
