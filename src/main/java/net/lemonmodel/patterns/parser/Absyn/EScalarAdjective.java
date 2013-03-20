package net.lemonmodel.patterns.parser.Absyn; // Java Package generated by the BNF Converter.

public class EScalarAdjective extends AdjectivePattern {
  public final AP ap_;
  public final ListScalarMembership listscalarmembership_;

  public EScalarAdjective(AP p1, ListScalarMembership p2) { ap_ = p1; listscalarmembership_ = p2; }

  public <R,A> R accept(net.lemonmodel.patterns.parser.Absyn.AdjectivePattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof net.lemonmodel.patterns.parser.Absyn.EScalarAdjective) {
      net.lemonmodel.patterns.parser.Absyn.EScalarAdjective x = (net.lemonmodel.patterns.parser.Absyn.EScalarAdjective)o;
      return this.ap_.equals(x.ap_) && this.listscalarmembership_.equals(x.listscalarmembership_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.ap_.hashCode())+this.listscalarmembership_.hashCode();
  }


}