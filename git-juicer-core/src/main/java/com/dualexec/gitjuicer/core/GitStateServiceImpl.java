package com.dualexec.gitjuicer.core;


import com.dualexec.gitjuicer.core.api.GitStateService;

import java.util.LinkedList;
import java.util.List;

import org.osgi.service.component.annotations.Component;

@Component
public class GitStateServiceImpl implements GitStateService {

    @Override
    public void addRepository(String url) {

    }

    @Override
    public List<String> listRepositories() {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello World");
        return list;
    }
}
