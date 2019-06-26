package ru.spb.iac.toris.egrulegrip.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")
public class AppConfiguration {

    private String name;
    private String tmpDataDir;
    private int threads;
    private int maxthreads;
    private int countFilesToMaxThreads;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTmpDataDir() {
        return tmpDataDir;
    }

    public void setTmpDataDir(String tmpDataDir) {
        this.tmpDataDir = tmpDataDir;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public int getMaxthreads() {
        return maxthreads;
    }

    public void setMaxthreads(int maxthreads) {
        this.maxthreads = maxthreads;
    }

    public int getCountFilesToMaxThreads() {
        return countFilesToMaxThreads;
    }

    public void setCountFilesToMaxThreads(int countFilesToMaxThreads) {
        this.countFilesToMaxThreads = countFilesToMaxThreads;
    }

}
