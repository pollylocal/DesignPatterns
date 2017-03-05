package com.pollylocal.creational.builder.lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;

import java.util.List;

/**
 * @author Aliaksandr Makavetski
 */
@Builder
@Getter
@ToString
public class LombokCluster {
    @Singular private List<String> hosts;
    private int port;
    private int retryAttempts;
    private boolean metricsEnabled;
}