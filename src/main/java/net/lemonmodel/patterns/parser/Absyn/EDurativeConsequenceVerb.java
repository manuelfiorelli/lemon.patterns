package net.lemonmodel.patterns.parser.Absyn; // Java Package generated by the BNF Converter.

public class EDurativeConsequenceVerb extends VerbPattern {
  public final VerbPattern verbpattern_;

  public EDurativeConsequenceVerb(VerbPattern p1) { verbpattern_ = p1; }

  public <R,A> R accept(net.lemonmodel.patterns.parser.Absyn.VerbPattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof net.lemonmodel.patterns.parser.Absyn.EDurativeConsequenceVerb) {
      net.lemonmodel.patterns.parser.Absyn.EDurativeConsequenceVerb x = (net.lemonmodel.patterns.parser.Absyn.EDurativeConsequenceVerb)o;
      return this.verbpattern_.equals(x.verbpattern_);
    }
    return false;
  }

  public int hashCode() {
    return this.verbpattern_.hashCode();
  }


}