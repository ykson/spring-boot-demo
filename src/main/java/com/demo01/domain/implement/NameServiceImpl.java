package com.demo01.domain.implement;

import com.demo01.domain.service.NameService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = "nameServiceImpl")
public class NameServiceImpl implements NameService {
    @Value("${spring.application.name}")
    private String appName;

    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    //< override functions

    /**
     * Get the name
     */
    @Override
    public String getName() throws Exception {
        return appName;
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    //< private functions

}
