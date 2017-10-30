package com.test.design_pattern.action.mediator;

/**
 * Created by wanggy on 2017/10/27.
 */
public class ConcreteMediator extends AbstractMediator {
    private ConcreteColleagueHR hr;
    private ConcreteColleagueAndroidDeveloper ad;

    public ConcreteColleagueHR getHr() {
        return hr;
    }

    public void setHr(ConcreteColleagueHR hr) {
        this.hr = hr;
    }

    public ConcreteColleagueAndroidDeveloper getAd() {
        return ad;
    }

    public void setAd(ConcreteColleagueAndroidDeveloper ad) {
        this.ad = ad;
    }

    @Override
    public void constact(String message, Colleague colleague) {
        if(colleague == hr){
            ad.getMessage(message);
        }
        else{
            hr.getMessage(message);
        }
    }
}
