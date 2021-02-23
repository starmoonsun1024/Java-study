package com.sms.bean;

public class Experience extends BaseBean {
    private String job;
    private String intro;
    private String beginDay;
    private String endDay;
    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getBeginDay() {
        return beginDay;
    }

    public void setBeginDay(String beginDay) {
        this.beginDay = beginDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "job='" + job + '\'' +
                ", intro='" + intro + '\'' +
                ", beginDay='" + beginDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", company=" + company +
                '}';
    }
}
