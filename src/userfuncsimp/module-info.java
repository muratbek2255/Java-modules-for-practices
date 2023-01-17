import userfuncs.binaryfuncs.BinaryFuncProvider;
import userfuncsimp.binaryfuncsimp.ABSMinusProvider;
import userfuncsimp.binaryfuncsimp.ABSProvider;

module userfuncsimp {
    requires userfuncs;

    provides BinaryFuncProvider with ABSProvider, ABSMinusProvider;
}