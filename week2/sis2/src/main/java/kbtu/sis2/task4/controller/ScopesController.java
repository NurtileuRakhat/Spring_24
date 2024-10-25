package kbtu.sis2.task4.controller;

import jakarta.annotation.Resource;
import kbtu.sis2.task4.model.HelloMessageGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.*;

@RestController
public class ScopesController {
    public static final Logger LOG = LoggerFactory.getLogger(ScopesController.class);

    @Resource(name = "requestScopedBean")
    HelloMessageGenerator requestScopedBean;

    @Resource(name = "sessionScopedBean")
    HelloMessageGenerator sessionScopedBean;

    @Resource(name = "applicationScopedBean")
    HelloMessageGenerator applicationScopedBean;

    @RequestMapping("/scopes/request")
    public String getRequestScopeMessage(final Model model) {
        LOG.info("Previous Message: " + requestScopedBean.getMessage());
        requestScopedBean.setMessage("Request Scope Message!");
        LOG.info("Current Message: " + requestScopedBean.getMessage());
        return "Request scope example";
    }

    @RequestMapping("/scopes/session")
    public String getSessionScopeMessage(final Model model) {
        LOG.info("Previous Message: " + sessionScopedBean.getMessage());
        LOG.info("Address: " + System.identityHashCode(model));
        sessionScopedBean.setMessage("Session Scope Message!");
        LOG.info("Current Message: " + sessionScopedBean.getMessage());
        return "Session scope example";
    }

    @RequestMapping("/scopes/application")
    public String getApplicationScopeMessage(final Model model) {
        LOG.info("Current Message: " + applicationScopedBean.getMessage());
        applicationScopedBean.setMessage("Application Scope Message!");
        LOG.info("Current Message: " + applicationScopedBean.getMessage());
        return "Application scope example";
    }
}