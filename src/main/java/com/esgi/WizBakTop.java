package com.esgi;

public class WizBakTop {

    int input;

    public static WizBakTop from(String input){
        return new WizBakTop(input);
    }

    private WizBakTop(String input) {
        this.input = getNumberFromInput(input);
    }

    private Integer getNumberFromInput(String input) {
        return Integer.parseInt(input);
    }

    public String execute() {
        StringBuilder sb = new StringBuilder();
        if (!WBTNumberInterpretor.isNumberDivisible(this.input)){
            return String.valueOf(this.input);
        }

        sb.append(getPossibleDivisions());

        sb.append(WBTNumberInterpretor.generate(this.input));

        return sb.toString();
    }

    private String getPossibleDivisions() {
        StringBuilder sb = new StringBuilder();
        if (WBTNumberInterpretor.isNumberDivisibleBy3(this.input)) {
            sb.append("Wiz");
        }

        if (WBTNumberInterpretor.isNumberDivisibleBy5(this.input)) {
            sb.append("Bak");
        }

        if (WBTNumberInterpretor.isNumberDivisibleBy7(this.input)) {
            sb.append("Top");
        }
        return sb.toString();
    }
}
