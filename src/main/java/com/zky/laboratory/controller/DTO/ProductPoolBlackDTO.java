package com.zky.laboratory.controller.DTO;

public class ProductPoolBlackDTO {

    private String partNumber;

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    @Override
    public String toString() {
        return "ProductPoolBlackDTO{" +
                "partNumber='" + partNumber + '\'' +
                '}';
    }
}
