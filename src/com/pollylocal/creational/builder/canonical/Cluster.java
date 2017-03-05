package com.pollylocal.creational.builder.canonical;

public class Cluster
{
    private String host;
    private int port;
    private int retryAttempts;
    private boolean metricsEnabled;

    public static RuntimeBuilder runtimeBuilder()
    {
        return new RuntimeBuilder();
    }

    public static StorageBuilder storageBuilder()
    {
        return new StorageBuilder();
    }

    public static class RuntimeBuilder
    {
        private Cluster cluster = new Cluster();

        public RuntimeBuilder withHost(String host)
        {
            if (host == null)
            {
                throw new IllegalArgumentException("Hosts must be set!");
            }
            cluster.setHost(host);
            return this;
        }

        public RuntimeBuilder withPort(int port)
        {
            cluster.setPort(port);
            return this;
        }

        public RuntimeBuilder withRetryAttempts(int retryAttempts)
        {
            cluster.setRetryAttempts(retryAttempts);
            return this;
        }

        public RuntimeBuilder withoutMetrics()
        {
            cluster.setMetricsEnabled(false);
            return this;
        }

        public RuntimeBuilder withMetrics()
        {
            cluster.setMetricsEnabled(true);
            return this;
        }

        public Cluster build()
        {
            return cluster;
        }
    }

    public static class StorageBuilder
    {
        private String host;
        private int port;
        private int retryAttempts;
        private boolean metricsEnabled;

        public StorageBuilder withHost(String host)
        {
            if (host == null)
            {
                throw new IllegalArgumentException("Hosts must be set!");
            }
            this.host = host;
            return this;
        }

        public StorageBuilder withPort(int port)
        {
            this.port = port;
            return this;
        }

        public StorageBuilder withRetryAttempts(int retryAttempts)
        {
            this.retryAttempts = retryAttempts;
            return this;
        }

        public StorageBuilder withoutMetrics()
        {
            this.metricsEnabled = false;
            return this;
        }

        public StorageBuilder withMetrics()
        {
            this.metricsEnabled = true;
            return this;
        }

        public Cluster build()
        {
            return new Cluster(this.host, this.port, this.retryAttempts, this.metricsEnabled);
        }
    }

    public Cluster()
    {
    }

    public Cluster(String host, int port, int retryAttempts, boolean metricsEnabled)
    {
        this.host = host;
        this.port = port;
        this.retryAttempts = retryAttempts;
        this.metricsEnabled = metricsEnabled;
    }

    public String getHost()
    {
        return host;
    }

    public void setHost(String host)
    {
        this.host = host;
    }

    public int getPort()
    {
        return port;
    }

    public void setPort(int port)
    {
        this.port = port;
    }

    public int getRetryAttempts()
    {
        return retryAttempts;
    }

    public void setRetryAttempts(int retryAttempts)
    {
        this.retryAttempts = retryAttempts;
    }

    public boolean isMetricsEnabled()
    {
        return metricsEnabled;
    }

    public void setMetricsEnabled(boolean metricsEnabled)
    {
        this.metricsEnabled = metricsEnabled;
    }

    @Override
    public String toString()
    {
        final StringBuffer sb = new StringBuffer("Cluster{");
        sb.append("host='").append(host).append('\'');
        sb.append(", port=").append(port);
        sb.append(", retryAttempts=").append(retryAttempts);
        sb.append(", metricsEnabled=").append(metricsEnabled);
        sb.append(", hashCode=").append(hashCode());
        sb.append('}');
        return sb.toString();
    }
}
