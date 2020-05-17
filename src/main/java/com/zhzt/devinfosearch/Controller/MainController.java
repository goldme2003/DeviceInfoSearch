package com.zhzt.devinfosearch.Controller;

import com.zhzt.devinfosearch.Entity.DevInfo;
import com.zhzt.devinfosearch.Repos.DevInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/power-device")
public class MainController {
    @Autowired
    private DevInfoRepository devInfoRepository;

    @GetMapping("/devlist")
    public Page<DevInfo> getPagedDevInfo(@RequestParam("page") int page){
        Pageable pageparam = PageRequest.of(page, 100);

        return devInfoRepository.findAll(pageparam);


    }
}
