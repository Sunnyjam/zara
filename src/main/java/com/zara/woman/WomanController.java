package com.zara.woman;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class WomanController {
    private final WomanService womanService;

    @PostMapping("/insertWoman")
    public int insertWoman(@RequestBody Woman woman) {
        return womanService.insertWoman(woman);
    }

    @PutMapping("/updateWoman")
    public int updateWoman(@RequestBody Woman woman) {
        return womanService.updateWoman(woman);
    }

    @DeleteMapping("/deleteWoman/{womanId}")
    public int deleteWoman(@PathVariable int womanId) {
        return womanService.deleteWoman(womanId);
    }

    @GetMapping("/womanList")
    public List<Woman> womanList() {
        return womanService.womanList();
    }

    @GetMapping("/womanTop")
    public List<Woman> womanTop() {
        return womanService.womanTop();
    }

    @GetMapping("/womanBottom")
    public List<Woman> womanBottom() {
        return womanService.womanBottom();
    }
}
