package com.api.openapi.parser;

import com.api.openapi.action.Action;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

public class OpenApiJsonParser {

    private static final Logger LOGGER = LoggerFactory.getLogger(OpenApiJsonParser.class);
    private static final OpenApiJsonParser INSTANCE = new OpenApiJsonParser();

    private OpenApiJsonParser() {
    }

    public String doParse(Collection<String> jPaths, Collection<String> operations, String json, Action action) {

        return json;
    }
}
