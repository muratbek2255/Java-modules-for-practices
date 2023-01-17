package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;

import java.util.ServiceLoader;

import userfuncs.binaryfuncs.BinaryFunc;
import userfuncs.binaryfuncs.BinaryFuncProvider;


public class MyModAppDemo {
    public static void main(String[] args) {
        if(SimpleMathFuncs.isFactor(2, 10))
            System.out.println("2 множитель 10");

        System.out.println("Наименьший множитель 35 и 105" + SimpleMathFuncs.lcf(35, 105));

        ServiceLoader<BinaryFuncProvider> ldr = ServiceLoader.load(BinaryFuncProvider.class);

        BinaryFunc binOp = null;

        for (BinaryFuncProvider bfp:
             ldr) {
            if(bfp.get().getName().equals("Abs")) {
                binOp = bfp.get();
                break;
            }
        }

        if(binOp != null) System.out.println("Result = " + binOp.func(12, -4));
        else System.out.println("Function absplus not found");

        binOp = null;

        for (BinaryFuncProvider bfp:
             ldr) {
            if(bfp.get().getName().equals("minus")) {
                binOp = bfp.get();
                break;
            }
        }

        if(binOp != null) System.out.println("Result = " + binOp.func(12, -4));
        else System.out.println("Function absplus not found");
    }
}