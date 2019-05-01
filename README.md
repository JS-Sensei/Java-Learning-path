# Java Learning Path Oracle Doc
 The Java Virtual Machine always starts execution with the code in the *main* method in the class you indicate.
 
 #### Floating Point
  The command `System.out.print(2.0 - 1.1)` prints `0.89999999999` and not `0.9` as you would expect. Such roundoff errors
  are caused by the fact that floating-point numbers are represented in the binary number system. There is no precise 
  binary representation of the fraction `1/10`, just as there is no accurate representation of `1/3` in the decimal
   system.If we need precise numerical computations without roundoff errors, use `BigDecimal` class.

#### Unicode and the *char* Type
A *code point* is a code value that is associated with character in an encoding scheme. In Java, the `char` type 
describes a code unit in the **UTF-16** encoding.

#### The Boolean Type
it has two values `false` and `true` it is used for evaluating logical conditions. You cannot convert between integers
and boolean values. 

**Integer division** by 0 raises an **exception**, whereas **floating-point** division by 0 yields an infinite or 
NaN result.

#### Strings are immutable
You cannot change the individual Characters in a Java string. Objects of the String class are immutable. But you can
change the content of the String variable containing a String Object.
##### The Explanation as to why Strings are immutable: 
the compiler can arrange that **strings** are _shared_. Imagine various strings sitting in a common pool. String 
variables then point to locations in the pool. If you copy a string variable, both the original and the copy share
the same characters and hence point to the same location in that pool. Overall, the designers of Java decided that
the efficiency of Sharing outweighs the inefficiency of string editing by substrings and concatenating. 

Do not use the **==** operator to test whether two strings are equal!