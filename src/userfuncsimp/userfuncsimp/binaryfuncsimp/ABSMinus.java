package userfuncsimp.binaryfuncsimp;


import userfuncs.binaryfuncs.BinaryFunc;


public class ABSMinus implements BinaryFunc {
    @Override
    public String getName() {
        return "minus";
    }

    @Override
    public int func(int a, int b) {
        return Math.abs(a) - Math.abs(b);
    }
}
