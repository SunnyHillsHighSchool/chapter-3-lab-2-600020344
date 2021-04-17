//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import static java.lang.System.*;


class Main {
  public static void main(String[] args) {
    //add test cases  
    SyntaxChecker sc = new SyntaxChecker("(abc(*def)");
    System.out.println(sc);
    sc.setExpression("[{}]");
    System.out.println(sc);
    sc.setExpression("[");
    System.out.println(sc);
    sc.setExpression("[{<()>}]");
    System.out.println(sc);
    sc.setExpression("{<html[value=4]*(12)>{$x}}");
    System.out.println(sc);
    sc.setExpression("[one]<two>{three}(four)");
    System.out.println(sc);
    sc.setExpression("car(cdr(a)(b)))");
    System.out.println(sc);
    sc.setExpression("car(cdr(a)(b))");
    System.out.println(sc);
    
    
    
  }
}
