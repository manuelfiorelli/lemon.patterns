package net.lemonmodel.patterns.parser.Absyn; // Java Package generated by the BNF Converter.

public abstract class NP implements java.io.Serializable {
  public abstract <R,A> R accept(NP.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(net.lemonmodel.patterns.parser.Absyn.ENPSimple p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.ENPComplex p, A arg);

  }

}
