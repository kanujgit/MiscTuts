package com.kdroid.kotlintuts.codingquestion.commanElement;

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Test1 {
    String a;
    String b;

    public Test1(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }


    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test1)) return false;
        Test1 test1 = (Test1) o;
        return Objects.equals(getA(), test1.getA()) &&
                Objects.equals(getB(), test1.getB());
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        //return Objects.hash(getA(), getB());
        final int prime = 31;
        int result = 1;
        result = prime * result + a.hashCode();
        result = prime * result + b.hashCode();
        return result;
    }

    @NonNull
    @NotNull
    @Override
    public String toString() {
        return super.toString();
    }
}
