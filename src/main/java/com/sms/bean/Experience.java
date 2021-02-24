package com.sms.bean;

public class Experience extends Bean {
    private String job;
    private String intro;
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



    @Override
    public String toString() {
        return "Experience{" +
                "id='" + getId() + '\'' +
                "createdTime='" + getCreatedTime() + '\'' +
                "job='" + job + '\'' +
                ", intro='" + intro + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
