package org.example.records.upd;

public record MRZData(String name, String passportNumber, String nationality, String dateOfBirth,
                      String sex, String expirationData) {
    public MRZData {
        if (passportNumber == null || expirationData == null) {
            throw new RuntimeException("Wrong data");
        }
    }
}
