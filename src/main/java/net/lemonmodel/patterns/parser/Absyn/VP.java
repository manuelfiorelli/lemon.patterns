package net.lemonmodel.patterns.parser.Absyn; // Java Package generated by the BNF Converter.

public abstract class VP implements java.io.Serializable {
  public abstract <R,A> R accept(VP.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(net.lemonmodel.patterns.parser.Absyn.EVPSimple p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.EVPComplex p, A arg);

  }

}
