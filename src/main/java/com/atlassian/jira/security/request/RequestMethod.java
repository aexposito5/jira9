package com.atlassian.jira.security.request;

import com.atlassian.annotations.PublicApi;

@PublicApi
public enum RequestMethod {
    GET,
    HEAD,
    OPTIONS,
    CONNECT,
    DELETE,
    POST,
    PUT,
    PATCH,
    TRACE;
}
