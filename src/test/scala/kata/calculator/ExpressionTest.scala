package kata.calculator

import org.scalatest.{FlatSpec, Matchers}

class ExpressionTest extends FlatSpec with Matchers {
  //Add(Const(2),Mult(Var,Const(4)))==> 2+x*4
  //Mult(Add(Const(2),Var),Const(4))==> (2+x)*4
  //Mult(Var,Var))==> x^2
  //Mult(Mult(Var,Var),Const(4))==> x^2*4 oubien 4x^2







}
