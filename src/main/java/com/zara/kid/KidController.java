package com.zara.kid;

import com.zara.man.Man;
import com.zara.man.ManService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class KidController {

    private final KidService kidService;

    @PostMapping("/insertKid")
    public int insertKid(@RequestBody Kid kid) {
        return kidService.insertKid(kid);
    }

    @PutMapping("/updateKid")
    public int updateKid(@RequestBody Kid kid) {
        return kidService.updateKid(kid);
    }

    @DeleteMapping("/deleteKid/{kidId}")
    public int deleteKid(@PathVariable int kidId) {
        return kidService.deleteKid(kidId);
    }

    @GetMapping("/kidList")
    public List<Kid> kidList() {
        return kidService.kidList();
    }

    @GetMapping("/kidTop")
    public List<Kid> kidTop() {
        return kidService.kidTop()  ;
    }

    @GetMapping("/kidBottom")
    public List<Kid> kidBottom() {
        return kidService.kidBottom()  ;
    }
}
