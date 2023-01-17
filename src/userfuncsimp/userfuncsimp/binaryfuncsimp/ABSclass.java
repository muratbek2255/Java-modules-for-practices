package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinaryFunc;

public class ABSclass implements BinaryFunc {
    @Override
    public String getName() {
        return "Abs";
    }

    @Override
    public int func(int a, int b) {
        return Math.abs(a) + Math.abs(b);
    }
}
