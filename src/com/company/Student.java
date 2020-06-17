/*
 * @author  Oleksii Shevchenko KNUTE 1m
 *
 * Programming patterns. Factory, Builder
 *
 *@version 16.06.20
 * Develop for your class
 *
 * 1. Factory.
 * 2. Abstract factory.
 * 3. Create a class Student  - 25 fields.
 * 4. Create a builder for the class Student
 */

package com.company;

import java.util.Objects;

public class Student {

    //3. Create a class Student  - 25 fields.
    public class Student
    {
        private String secondName;                // Secomd name of student
        private String firstName;                 // First name of student
        private String dateOfBirth;               //Student's date of birth
        private String patronymic;
        private String homeAddress;
        private int age;                          //Age of the student
        private int height;                       //Height of the student
        private int weight;                       //Weight of the student
        private String countryOfBirth;            //Country in which was born
        private String gender;
        private String parentsAddress;            //the address where the parents live
        private long parentPhoneNumber;
        private String university;
        private long phoneNumber;                   //Student's mobile number
        private String universityEntryDate;        //Date when date when he was enrolled in university
        private String academicPerformance;         //How to study student
        private boolean budgetPlace;               //Contract or budget
        private String specialisation;
        private int yearOfStudy;                   //What year of study student in at university
        private String faculty;
        private boolean scienceAchievements;       //Does the student have scientific achievements
        private String kindOfSportingAchievement;  //What kind of Achievements student has
        private boolean sportAchievements;         //Does the student have achievements in sports

        //Constructor
        public Student(String secondName, String firstName,
                       String dateOfBirth, String patronymic,
                       String homeAddress, int age, int height,
                       int weight, String countryOfBirth, String gender,
                       String parentsAddress, long parentPhoneNumber,
                       String university, long phoneNumber,
                       String universityEntryDate, String academicPerformance,
                       boolean budgetPlace, String specialisation,
                       int yearOfStudy, String faculty, boolean scienceAchievements,
                       String kindOfSportingAchievement, boolean sportAchievements) {

            this.secondName = secondName;
            this.firstName = firstName;
            this.dateOfBirth = dateOfBirth;
            this.patronymic = patronymic;
            this.homeAddress = homeAddress;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.countryOfBirth = countryOfBirth;
            this.gender = gender;
            this.parentsAddress = parentsAddress;
            this.parentPhoneNumber = parentPhoneNumber;
            this.university = university;
            this.phoneNumber = phoneNumber;
            this.universityEntryDate = universityEntryDate;
            this.academicPerformance = academicPerformance;
            this.budgetPlace = budgetPlace;
            this.specialisation = specialisation;
            this.yearOfStudy = yearOfStudy;
            this.faculty = faculty;
            this.scienceAchievements = scienceAchievements;
            this.kindOfSportingAchievement = kindOfSportingAchievement;
            this.sportAchievements = sportAchievements;
        }

        //Get & Set
        public String getSecondName() {
            return secondName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public void setPatronymic(String patronymic) {
            this.patronymic = patronymic;
        }

        public String getHomeAddress() {
            return homeAddress;
        }

        public void setHomeAddress(String homeAddress) {
            this.homeAddress = homeAddress;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getCountryOfBirth() {
            return countryOfBirth;
        }

        public void setCountryOfBirth(String countryOfBirth) {
            this.countryOfBirth = countryOfBirth;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getParentsAddress() {
            return parentsAddress;
        }

        public void setParentsAddress(String parentsAddress) {
            this.parentsAddress = parentsAddress;
        }

        public long getParentPhoneNumber() {
            return parentPhoneNumber;
        }

        public void setParentPhoneNumber(long parentPhoneNumber) {
            this.parentPhoneNumber = parentPhoneNumber;
        }

        public String getUniversity() {
            return university;
        }

        public void setUniversity(String university) {
            this.university = university;
        }

        public long getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getUniversityEntryDate() {
            return universityEntryDate;
        }

        public void setUniversityEntryDate(String universityEntryDate) {
            this.universityEntryDate = universityEntryDate;
        }

        public String getAcademicPerformance() {
            return academicPerformance;
        }

        public void setAcademicPerformance(String academicPerformance) {
            this.academicPerformance = academicPerformance;
        }

        public boolean isBudgetPlace() {
            return budgetPlace;
        }

        public void setBudgetPlace(boolean budgetPlace) {
            this.budgetPlace = budgetPlace;
        }

        public String getSpecialisation() {
            return specialisation;
        }

        public void setSpecialisation(String specialisation) {
            this.specialisation = specialisation;
        }

        public int getYearOfStudy() {
            return yearOfStudy;
        }

        public void setYearOfStudy(int yearOfStudy) {
            this.yearOfStudy = yearOfStudy;
        }

        public String getFaculty() {
            return faculty;
        }

        public void setFaculty(String faculty) {
            this.faculty = faculty;
        }

        public boolean isScienceAchievements() {
            return scienceAchievements;
        }

        public void setScienceAchievements(boolean scienceAchievements) {
            this.scienceAchievements = scienceAchievements;
        }

        public String getKindOfSportingAchievement() {
            return kindOfSportingAchievement;
        }

        public void setKindOfSportingAchievement(String kindOfSportingAchievement) {
            this.kindOfSportingAchievement = kindOfSportingAchievement;
        }

        public boolean isSportAchievements() {
            return sportAchievements;
        }

        public void setSportAchievements(boolean sportAchievements) {
            this.sportAchievements = sportAchievements;
        }

        //Overriding toString method


        @Override
        public String toString() {
            return "Student{" +
                    "secondName='" + secondName + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", dateOfBirth='" + dateOfBirth + '\'' +
                    ", patronymic='" + patronymic + '\'' +
                    ", homeAddress='" + homeAddress + '\'' +
                    ", age=" + age +
                    ", height=" + height +
                    ", weight=" + weight +
                    ", countryOfBirth='" + countryOfBirth + '\'' +
                    ", gender='" + gender + '\'' +
                    ", parentsAddress='" + parentsAddress + '\'' +
                    ", parentPhoneNumber=" + parentPhoneNumber +
                    ", university='" + university + '\'' +
                    ", phoneNumber=" + phoneNumber +
                    ", universityEntryDate='" + universityEntryDate + '\'' +
                    ", academicPerformance='" + academicPerformance + '\'' +
                    ", budgetPlace=" + budgetPlace +
                    ", specialisation='" + specialisation + '\'' +
                    ", yearOfStudy=" + yearOfStudy +
                    ", faculty='" + faculty + '\'' +
                    ", scienceAchievements=" + scienceAchievements +
                    ", kindOfSportingAchievement='" + kindOfSportingAchievement + '\'' +
                    ", sportAchievements=" + sportAchievements +
                    '}';
        }

        //5. Creating class Builder
        public static class Builder
        {
            private Student studentToBuild;

            public Builder()
            {
                this.studentToBuild = new Student();
            }

            public Builder setSimilarTo(Student student)
            {
                this.studentToBuild.firstName = student.firstName;
                this.studentToBuild.secondName = student.secondName;
                this.studentToBuild.patronymic = student.patronymic;
                this.studentToBuild.dateOfBirth = student.dateOfBirth;
                this.studentToBuild.countryOfBirth = student.countryOfBirth;
                this.studentToBuild.age = student.age;
                this.studentToBuild.height = student.height;
                this.studentToBuild.weight = student.weight;
                this.studentToBuild.gender = student.gender;
                this.studentToBuild.homeAddress = student.homeAddress;
                this.studentToBuild.phoneNumber = student.phoneNumber;
                this.studentToBuild.parentsAddress = student.parentsAddress;
                this.studentToBuild.parentPhoneNumber = student.parentPhoneNumber;
                this.studentToBuild.university = student.university;
                this.studentToBuild.universityEntryDate = student.universityEntryDate;
                this.studentToBuild.budgetPlace = student.budgetPlace;
                this.studentToBuild.faculty = student.faculty;
                this.studentToBuild.specialisation = student.specialisation;
                this.studentToBuild.yearOfStudy = student.yearOfStudy;
                this.studentToBuild.sportAchievements = student.sportAchievements;
                this.studentToBuild.kindOfSportingAchievement = student.kindOfSportingAchievement;
                this.studentToBuild.scienceAchievements = student.scienceAchievements;
                this.studentToBuild.academicPerformance = student.academicPerformance;
                return this;
            }

            //Creating Setters

            public Builder setFirstName(String firstName)
            {
                studentToBuild.setFirstName(firstName);
                return this;
            }

            public Builder setSecondName(String secondName)
            {
                studentToBuild.setSecondName(secondName);
                return this;
            }

            public Builder setPatronymic(String patronymic)
            {
                studentToBuild.setPatronymic(patronymic);
                return this;
            }

            public Builder setDateOfBirth(String dateOfBirth)
            {
                studentToBuild.setDateOfBirth(dateOfBirth);
                return this;
            }

            public Builder setCountryOfBirth(String countryOfBirth)
            {
                studentToBuild.setCountryOfBirth(countryOfBirth);
                return this;
            }

            public Builder setAge(int age)
            {
                studentToBuild.setAge(age);
                return this;
            }

            public Builder setHeight(int height)
            {
                studentToBuild.setHeight(height);
                return this;
            }

            public Builder setWeight(int weight)
            {
                studentToBuild.setWeight(weight);
                return this;
            }

            public Builder setGender(String gender)
            {
                studentToBuild.setGender(gender);
                return this;
            }

            public Builder setHomeAddress(String homeAddress)
            {
                studentToBuild.setHomeAddress(homeAddress);
                return this;
            }

            public Builder setPhoneNumber(long phoneNumber)
            {
                studentToBuild.setPhoneNumber(phoneNumber);
                return this;
            }

            public Builder setParentsAddress(String parentsAddress)
            {
                studentToBuild.setParentsAddress(parentsAddress);
                return this;
            }


            public Builder setParentPhoneNumber(long parentPhoneNumber)
            {
                studentToBuild.setParentPhoneNumber(parentPhoneNumber);
                return this;
            }

            public Builder setUniversity(String university)
            {
                studentToBuild.setUniversity(university);
                return this;
            }

            public Builder setUniversityEntryDate(String universityEntryDate)
            {
                studentToBuild.setUniversityEntryDate(universityEntryDate);
                return this;
            }

            public Builder setBudgetPlace(boolean budgetPlace)
            {
                studentToBuild.setBudgetPlace(budgetPlace);
                return this;
            }

            public Builder setFaculty(String faculty)
            {
                studentToBuild.setFaculty(faculty);
                return this;
            }

            public Builder setSpecialisation(String specialisation)
            {
                studentToBuild.setSpecialisation(specialisation);
                return this;
            }

            public Builder setYearOfStudy(int yearOfStudy)
            {
                studentToBuild.setYearOfStudy(yearOfStudy);
                return this;
            }

            public Builder setSportAchievements(boolean sportAchievements)
            {
                studentToBuild.setSportAchievements(sportAchievements);
                return this;
            }

            public Builder setKindOfSportingAchievement(String kindOfSportingAchievement)
            {
                studentToBuild.setKindOfSportingAchievement(kindOfSportingAchievement);
                return this;
            }

            public Builder setScienceAchievements(boolean scienceAchievements)
            {
                studentToBuild.setScienceAchievements(scienceAchievements);
                return this;
            }

            public Builder setAcademicPerformance(String academicPerformance)
            {
                studentToBuild.setAcademicPerformance(academicPerformance);
                return this;
            }

            //Building method
            public Student Build()
            {
                return studentToBuild;
            }


        }
// Equals & HashCode
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return getAge() == student.getAge() &&
                    getHeight() == student.getHeight() &&
                    getWeight() == student.getWeight() &&
                    getParentPhoneNumber() == student.getParentPhoneNumber() &&
                    getPhoneNumber() == student.getPhoneNumber() &&
                    isBudgetPlace() == student.isBudgetPlace() &&
                    getYearOfStudy() == student.getYearOfStudy() &&
                    isScienceAchievements() == student.isScienceAchievements() &&
                    isSportAchievements() == student.isSportAchievements() &&
                    Objects.equals(getSecondName(), student.getSecondName()) &&
                    Objects.equals(getFirstName(), student.getFirstName()) &&
                    Objects.equals(getDateOfBirth(), student.getDateOfBirth()) &&
                    Objects.equals(getPatronymic(), student.getPatronymic()) &&
                    Objects.equals(getHomeAddress(), student.getHomeAddress()) &&
                    Objects.equals(getCountryOfBirth(), student.getCountryOfBirth()) &&
                    Objects.equals(getGender(), student.getGender()) &&
                    Objects.equals(getParentsAddress(), student.getParentsAddress()) &&
                    Objects.equals(getUniversity(), student.getUniversity()) &&
                    Objects.equals(getUniversityEntryDate(), student.getUniversityEntryDate()) &&
                    Objects.equals(getAcademicPerformance(), student.getAcademicPerformance()) &&
                    Objects.equals(getSpecialisation(), student.getSpecialisation()) &&
                    Objects.equals(getFaculty(), student.getFaculty()) &&
                    Objects.equals(getKindOfSportingAchievement(), student.getKindOfSportingAchievement());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getSecondName(), getFirstName(), getDateOfBirth(), getPatronymic(), getHomeAddress(), getAge(), getHeight(), getWeight(), getCountryOfBirth(), getGender(), getParentsAddress(), getParentPhoneNumber(), getUniversity(), getPhoneNumber(), getUniversityEntryDate(), getAcademicPerformance(), isBudgetPlace(), getSpecialisation(), getYearOfStudy(), getFaculty(), isScienceAchievements(), getKindOfSportingAchievement(), isSportAchievements());
        }
    }

}
