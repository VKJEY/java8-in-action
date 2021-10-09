package com.example;

import java.util.function.BiFunction;

public class MethodReferenceExample {
    
    public static <T> T mergeThings(T a, T b, BiFunction<T,T,T> mergerFunc) {
        return mergerFunc.apply(a, b);
    }

    public static String mergeStrings(String a, String b) {
        return a + b;
    }

    public String instMergeStrings(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Calling the method mergeThings with a lambda expression
        System.out.println(MethodReferenceExample.
            mergeThings("Hello ", "World!", (a, b) -> a + b));

        System.out.println( 
            MethodReferenceExample.mergeThings("Static ", "Method Ref", MethodReferenceExample::mergeStrings));
        
        System.out.println( 
            MethodReferenceExample.mergeThings("Use ", "String method", String::concat));

        MethodReferenceExample ex = new MethodReferenceExample();
        System.out.println( 
            MethodReferenceExample.mergeThings("Use ", "Instance method", ex::instMergeStrings));
    }
}
