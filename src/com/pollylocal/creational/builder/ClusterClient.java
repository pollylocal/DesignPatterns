package com.pollylocal.creational.builder;

import com.pollylocal.creational.builder.canonical.Cluster;
import com.pollylocal.creational.builder.lombok.LombokCluster;

public class ClusterClient
{
    public static void main(String[] args)
    {
        System.out.println("Runtime");
        Cluster.RuntimeBuilder runtimeBuilder = Cluster.runtimeBuilder()
                .withHost("localhost")
                .withPort(8888)
                .withRetryAttempts(5)
                .withMetrics();
        Cluster cluster1 = runtimeBuilder.build();
        Cluster cluster2 = runtimeBuilder.withPort(9999).build();
        System.out.println(cluster1);
        System.out.println(cluster2);
        System.out.println("Storage");
        Cluster.StorageBuilder storageBuilderBuilder = Cluster.storageBuilder()
                .withHost("localhost")
                .withPort(8888)
                .withRetryAttempts(5)
                .withMetrics();
        Cluster cluster3 = storageBuilderBuilder.build();
        Cluster cluster4 = storageBuilderBuilder.withPort(9999).build();
        System.out.println(cluster3);
        System.out.println(cluster4);

        System.out.println("Lombok");
        LombokCluster.LombokClusterBuilder lombokClusterBuilder= LombokCluster.builder()
                .host("localhost")
                .port(8888)
                .retryAttempts(5)
                .metricsEnabled(true);
        LombokCluster lombokCluster = lombokClusterBuilder.build();
        LombokCluster lombokCluster1 = lombokClusterBuilder.port(9999).build();
        System.out.println(lombokCluster + " hashCode=" + lombokCluster.hashCode());
        System.out.println(lombokCluster1 + " hashCode=" + lombokCluster1.hashCode());
    }
}
