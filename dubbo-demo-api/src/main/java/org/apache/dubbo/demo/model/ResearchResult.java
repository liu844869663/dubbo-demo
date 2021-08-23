package org.apache.dubbo.demo.model;

import java.io.Serializable;

/**
 * @author jingping.liu
 * @date 2021-07-02
 * @description 研究结果
 */
public class ResearchResult implements Serializable {

    /**
     * 学习时间
     */
    private String time;
    /**
     * 学习进度
     */
    private String progress;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    @Override
    public String toString() {
        return "ResearchResult{" +
                "time='" + time + '\'' +
                ", progress='" + progress + '\'' +
                '}';
    }
}
