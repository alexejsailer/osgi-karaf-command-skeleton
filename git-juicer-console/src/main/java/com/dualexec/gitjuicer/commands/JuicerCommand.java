package com.dualexec.gitjuicer.commands;

import com.dualexec.gitjuicer.core.api.GitStateService;
import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.Option;
import org.apache.karaf.shell.api.action.lifecycle.Reference;
import org.apache.karaf.shell.api.action.lifecycle.Service;

@Service
@Command(scope = "juicer", name = "list", description = "Add a git repository.")
public class JuicerCommand implements Action {


    @Reference
    GitStateService gitStateService;


    @Option(name = "-c", aliases = "--clone", description = "clone", required = false, multiValued = false)
    Long id = 0L;

    @Argument(index = 0, name = "path", description = "Destination path", required = true, multiValued = false)
    String path;

    @Override
    public Object execute() throws Exception {
        return gitStateService.listRepositories().get(0);
    }

}
