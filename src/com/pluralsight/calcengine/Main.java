package com.pluralsight.calcengine;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        performCalculations();
    }

    static void performCalculations() {

        MathEquation equation1 = new MathEquation();
        equation1.setLeftVal(10.4);
        equation1.setOpCode('a');
        equation1.setRightVal(34);
        equation1.setIdentifier(1);

        MathEquation equation2 = new MathEquation();
        equation2.setLeftVal(20.4);
        equation2.setOpCode('d');
        equation2.setRightVal(34);
        equation2.setIdentifier(2);

        MathEquation equation3 = new MathEquation();
        equation3.setLeftVal(20.4);
        equation3.setOpCode('t');
        equation3.setRightVal(34);
        equation3.setIdentifier(2);

        MathEquation equation4 = new MathEquation();
        equation4.setLeftVal(20.4);
        equation4.setOpCode('m');
        equation4.setRightVal(34);
        equation4.setIdentifier(2);

        List<MathEquation> mathEquations = Arrays.asList(equation1, equation2,equation3,equation4);
        List<TResult> execute = execute(mathEquations);

    }


    private static List<TResult> execute(List<MathEquation> mathEquations) {
        return mathEquations.stream().map(x -> calculate(x)).collect(Collectors.toList());
    }

    private static TResult calculate(MathEquation x) {
        TResult result = new TResult();
        switch (x.getOpCode()) {
            case 'a':
                result.setResult(x.getLeftVal() + x.getRightVal());
                result.setIdentifier(x.getIdentifier());
                break;
            case 's':
                result.setResult(x.getLeftVal() - x.getRightVal());
                result.setIdentifier(x.getIdentifier());
                break;
            case 'm':
                result.setResult(x.getLeftVal() * x.getRightVal());
                result.setIdentifier(x.getIdentifier());
                break;
            case 'd':
                result.setResult(x.getRightVal() != 0 ? x.getLeftVal() / x.getRightVal() : 0.0d);
                result.setIdentifier(x.getIdentifier());

                break;
            default:
                result.setIdentifier(x.getIdentifier());
                result.setValid(false);
                break;
        }
        return result;
    }
}