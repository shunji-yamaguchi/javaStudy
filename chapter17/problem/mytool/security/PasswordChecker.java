package chapter17.problem.mytool.security;

//import chapter17.example.yourtool.*;

/**
 * 問題17-5 解答その1
 * 以下のPasswordRegisterはpublicになっていないので、mytool.security以外のパッケージから
 * 利用できない。PasswordRegisterを他のパッケージからも利用できるように修正せよ。
 *
   package mytool.security;
   import yourtool.*;

   public class PasswordChecker {
   }

   class PasswordRegister {
   }
 *
 * @author shunji.yamaguchi
 *
 */
public class PasswordChecker {
}
