package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinaryFunc;
import userfuncs.binaryfuncs.BinaryFuncProvider;

public class ABSMinusProvider implements BinaryFuncProvider {
    @Override
    public BinaryFunc get() {
        return new ABSMinus();
    }
}
