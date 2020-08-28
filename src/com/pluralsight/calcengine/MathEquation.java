package com.pluralsight.calcengine;

public class MathEquation {

    private int identifier;
    private double leftVal;
    private double rightVal;
    private char opCode;


    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public double getLeftVal() {
        return leftVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }



//    private static int numberOfCalculations;
//    private static  double sumOfResults;
//
//    public MathEquation()
//    {
//
//    }
//
//    public MathEquation(char opCode)
//    {
//        this.opCode = opCode;
//    }
//
//    public MathEquation(char opCode,double rightVal, double leftVal)
//    {
//        this(opCode);
//        this.leftVal = leftVal;
//        this.rightVal = rightVal;
//    }
//
//
//
//    void execute()
//    {
//        switch (opCode) {
//            case 'a':
//                result = leftVal + rightVal;
//                break;
//            case 's':
//                result = leftVal - rightVal;
//                break;
//            case 'm':
//                result = leftVal * rightVal;
//                break;
//            case 'd':
//                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
//                break;
//            default:
//                System.out.println("Invalid opCode: " + opCode);
//                result = 0.0d;
//                break;
//        }
//        numberOfCalculations++;
//        sumOfResults+=result;
//
//    }
//
//    public static double getAverageResult()
//    {
//        return numberOfCalculations/sumOfResults;
//    }
}
