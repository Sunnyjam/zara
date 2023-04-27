package com.zara.woman;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WomanService {
    private final WomanMapper womanMapper;

    public int insertWoman(Woman woman) {
        return womanMapper.insertWoman(woman);
    }

    public int updateWoman(Woman woman) {
        return womanMapper.updateWoman(woman);
    }

    public int deleteWoman(int womanId) {
        return womanMapper.deleteWoman(womanId);
    }

    public List<Woman> womanList() {
        return womanMapper.womanList();
    }

    public List<Woman> womanTop() {
        return womanMapper.womanTop();
    }

    public List<Woman> womanBottom() {
        return womanMapper.womanBottom();
    }
}
