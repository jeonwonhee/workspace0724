package com.kh.jdbd.test;

import java.time.LocalDate;
import java.util.Objects;

public class Test {
    private int tno;
    private String tname;
    private LocalDate tdate;

    public Test() {
        super();
    }

    public Test(int tno, String tname, LocalDate tdate) {
        super();
        this.tno = tno;
        this.tname = tname;
        this.tdate = tdate;
    }

    public int getTno() {
        return tno;
    }

    public void setTno(int tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public LocalDate getTdate() {
        return tdate;
    }

    public void setTdate(LocalDate tdate) {
        this.tdate = tdate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tno);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;              // 같은 객체면 true
        if (obj == null || getClass() != obj.getClass()) return false;
        Test other = (Test) obj;
        return tno == other.tno;                   // tno 같으면 같다고 판단
    }

    @Override
    public String toString() {
        return "Test [tno=" + tno + ", tname=" + tname + ", tdate=" + tdate + "]";
    }
}
