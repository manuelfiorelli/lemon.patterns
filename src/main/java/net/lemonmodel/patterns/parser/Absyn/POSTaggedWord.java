package net.lemonmodel.patterns.parser.Absyn; // Java Package generated by the BNF Converter.

public abstract class POSTaggedWord implements java.io.Serializable {
  public abstract <R,A> R accept(POSTaggedWord.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(net.lemonmodel.patterns.parser.Absyn.EPOSTaggedHeadWord p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.EPOSTaggedWord p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.ELemmaPOSTaggedHeadWord p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.ELemmaPOSTaggedWord p, A arg);

  }

}
