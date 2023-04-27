package com.zara.man;

import com.zara.woman.Woman;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManService {
    private final ManMapper manMapper;

    public int insertMan(Man man) {
        return manMapper.insertMan(man);
    }
    public int updateMan(Man man) {
        return manMapper.updateMan(man);
    }

    public int deleteMan(int manId) {
        return manMapper.deleteMan(manId);
    }

    public List<Man> manList() {
        return manMapper.manList();
    }

    public List<Man> manTop() {
        return manMapper.manTop();
    }

    public List<Man> manBottom() {
        return manMapper.manBottom();
    }
}
