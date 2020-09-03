package com.demo01.domain.implement;

import com.demo01.domain.service.NameService;
import org.springframework.stereotype.Service;

@Service(value = "nameServiceImpl")
public class NameServiceImpl implements NameService {

    @Override
    public String getName() throws Exception {
        return null;
    }
}
