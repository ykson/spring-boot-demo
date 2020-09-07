package com.demo01.domain.implement;

import com.demo01.domain.service.NameService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = "nameServiceImpl")
public class NameServiceImpl implements NameService {
    @Value("${spring.application.name}")
    private String appName;
    @Value("${test.your_name}")
    private String yourName;

    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    //< override functions

    /**
     * Get the name
     */
    @Override
    public String getName() throws Exception {
        return appName;
    }

    @Override
    public String getYourName() throws Exception {
        return yourName;
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    //< private functions

}
