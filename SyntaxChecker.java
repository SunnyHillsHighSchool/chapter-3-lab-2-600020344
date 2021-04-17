//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
 private String exp;
 private Stack<Character> symbols;

 public SyntaxChecker()
 {
   exp = "";
   symbols = new Stack<Character>();
 }

 public SyntaxChecker(String s)
 {
   exp = s;
   symbols = new Stack<Character>();
 }
 
 public void setExpression(String s)
 {
   exp = s;
   symbols = new Stack<Character>();
 }

 public boolean checkExpression()
 {
  for (int i = 0; i<exp.length(); i++)
  {
    char c = exp.charAt(i);
    // System.out.println("c is " + c);
    switch (c)
    {
      case '{':
      case '(':
      case '<':
      case '[':
        symbols.push(c);
        // System.out.println("pushed " + c);
        break;
      case '}':
      case ')':
      case '>':   
      case ']':
        if(!symbols.isEmpty())
        {
          char popped = symbols.pop();
          // System.out.println("popped " + popped);
          if ((popped == '}' && c!='{') ||(popped == ')' && c!='(') || (popped == '>' && c!='<')||(popped == ']' && c!='['))
            return false;
        } else {
          return false;
        }
        break;
      default: break;
    }
  }
  if(!symbols.isEmpty())
  {
    return false;
  }
      return true;
 }

 //write a toString
 public String toString()
 {
   String s = exp + " is ";
   if(checkExpression())
   {
     s+= "correct.";
   } else {
     s+= "incorrect.";
   }
   return s;
 }
}
