package org.example.records.old;

import java.util.Objects;

public class MRZData {
    private final String name;
    private final String passportNumber;
    private final String nationality;
    private final String dateOfBirth;
    private final String sex;
    private final String expirationData;

    public MRZData(String name, String passportNumber, String nationality, String dateOfBirth, String sex, String expirationData) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.expirationData = expirationData;
    }

    public String getName() {
        return name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public String getExpirationData() {
        return expirationData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MRZData mrzData = (MRZData) o;
        return Objects.equals(name, mrzData.name) && Objects.equals(passportNumber, mrzData.passportNumber) && Objects.equals(nationality, mrzData.nationality) && Objects.equals(dateOfBirth, mrzData.dateOfBirth) && Objects.equals(sex, mrzData.sex) && Objects.equals(expirationData, mrzData.expirationData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passportNumber, nationality, dateOfBirth, sex, expirationData);
    }
}
