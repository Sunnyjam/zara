package com.zara.man;

import com.zara.woman.Woman;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ManController {
    private final ManService manService;

    @PostMapping("/insertMan")
    public int insertMan(@RequestBody Man man) {
        return manService.insertMan(man);
    }

    @PutMapping("/updateMan")
    public int updateMan(@RequestBody Man man) {
        return manService.updateMan(man);
    }

    @DeleteMapping("/deleteMan/{manId}")
    public int deleteMan(@PathVariable int manId) {
        return manService.deleteMan(manId);
    }

    @GetMapping("/manList")
    public List<Man> manList() {
        return manService.manList();
    }

    @GetMapping("/manTop")
    public List<Man> manTop() {
        return manService.manTop()  ;
    }

    @GetMapping("/manBottom")
    public List<Man> manBottom() {
        return manService.manBottom()  ;
    }
}
