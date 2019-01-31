package kata.calculator



sealed trait Expression
object Expression {
  def toInFix(expression: Expression):String = ???

  final case class Const(c:Double) extends Expression
  final case class Add(left:Expression,right:Expression) extends Expression
  final case class Mult(left:Expression,right:Expression) extends Expression
  final case object Var extends Expression

}
