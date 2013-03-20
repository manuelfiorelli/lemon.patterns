package net.lemonmodel.patterns.parser.Absyn; // Java Package generated by the BNF Converter.

public abstract class Statement implements java.io.Serializable {
  public abstract <R,A> R accept(Statement.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(net.lemonmodel.patterns.parser.Absyn.EPrefix p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.ELexicon p, A arg);

  }

}