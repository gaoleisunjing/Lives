package com.allyn.lives.events;

import com.allyn.lives.bean.MusicBean;

/**
 * Created by Administrator on 2016/7/1.
 */
public class MusicBeamEvent {

    private MusicBean bean;

    public MusicBean getBean() {
        return bean;
    }

    public void setBean(MusicBean bean) {
        this.bean = bean;
    }

    public MusicBeamEvent(MusicBean bean) {
        this.bean = bean;
    }
}
