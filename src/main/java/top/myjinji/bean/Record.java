package top.myjinji.bean;


import com.alibaba.excel.annotation.ExcelProperty;

import java.io.Serializable;

public class Record implements Serializable {
    @ExcelProperty(value = "星期")
    private String dayOfWeek;

    @ExcelProperty(value = "日期")
    private Integer date;

    @ExcelProperty(value = "早餐")
    private String breakfast;

    @ExcelProperty(value = "午餐")
    private String lunch;

    @ExcelProperty(value = "晚餐")
    private String dinner;

    @ExcelProperty(value = "交通")
    private String transportation;

    @ExcelProperty(value = "购物")
    private String shopping;

    @ExcelProperty(value = "日用")
    private String dailyExpenses;

    @ExcelProperty(value = "社交")
    private String social;

    @ExcelProperty(value = "杂项")
    private String miscellaneous;

    @ExcelProperty(value = "通讯")
    private String communication;

    @ExcelProperty(value = "借款")
    private String loan;

    @ExcelProperty(value = "医疗")
    private String medical;

    @ExcelProperty(value = "支出")
    private String expenses;

    @ExcelProperty(value = "收入")
    private String income;

    @ExcelProperty(value = "欠款")
    private String debt;

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public String getShopping() {
        return shopping;
    }

    public void setShopping(String shopping) {
        this.shopping = shopping;
    }

    public String getDailyExpenses() {
        return dailyExpenses;
    }

    public void setDailyExpenses(String dailyExpenses) {
        this.dailyExpenses = dailyExpenses;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getMiscellaneous() {
        return miscellaneous;
    }

    public void setMiscellaneous(String miscellaneous) {
        this.miscellaneous = miscellaneous;
    }

    public String getCommunication() {
        return communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    public String getLoan() {
        return loan;
    }

    public void setLoan(String loan) {
        this.loan = loan;
    }

    public String getMedical() {
        return medical;
    }

    public void setMedical(String medical) {
        this.medical = medical;
    }

    public String getExpenses() {
        return expenses;
    }

    public void setExpenses(String expenses) {
        this.expenses = expenses;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getDebt() {
        return debt;
    }

    public void setDebt(String debt) {
        this.debt = debt;
    }
}
