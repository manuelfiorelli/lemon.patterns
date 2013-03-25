package net.lemonmodel.patterns.parser.Absyn; // Java Package generated by the BNF Converter.

public abstract class VerbPattern implements java.io.Serializable {
  public abstract <R,A> R accept(VerbPattern.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(net.lemonmodel.patterns.parser.Absyn.EStateVerb1 p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.EStateVerb2 p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.EStateVerb3 p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.ETelicEventVerb p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.ENontelicEventVerb p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.EDunnotelicEventVerb p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.EDurativeEventVerb p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.EInstantEventVerb p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.EEventVerb p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.EConsequenceVerb1 p, A arg);
    public R visit(net.lemonmodel.patterns.parser.Absyn.EConsequenceVerb2 p, A arg);

  }

}
