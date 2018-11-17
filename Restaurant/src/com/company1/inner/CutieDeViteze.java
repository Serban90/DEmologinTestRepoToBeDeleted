package com.company1.inner;

public class CutieDeViteze {

    private class SchimbatorDeViteze {

    }

    public static void main(String[] args) {
        CutieDeViteze cutieDeViteze = new CutieDeViteze();
        CutieDeViteze.SchimbatorDeViteze schimbatorDeViteze = cutieDeViteze.new SchimbatorDeViteze();
    }
}
