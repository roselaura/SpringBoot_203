package com.example.demo;

public class Employee {
        private long id;
        private String first_name;
        private String last_name;
        private int ssn;
        private int dob;

        public long getId() {
                return id;
        }

        public void setId(long id) {
                this.id = id;
        }

        public String getFirst_name() {
                return first_name;
        }

        public void setFirst_name(String first_name) {
                this.first_name = first_name;
        }

        public String getLast_name() {
                return last_name;
        }

        public void setLast_name(String last_name) {
                this.last_name = last_name;
        }

        public int getSsn() {
                return ssn;
        }

        public void setSsn(int ssn) {
                this.ssn = ssn;
        }

        public int getDob() {
                return dob;
        }

        public void setDob(int dob) {
                this.dob = dob;
        }
}
