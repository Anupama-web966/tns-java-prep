package com.tnsif.lambdaexpression;
interface Sayable{
    public String say();
}
class Withoutparameter {
public static void main(String[] args) {
        Sayable s=()->{return "i have nothing to say";};
        System.out.println(s.say());
}
}

