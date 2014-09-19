package net.lemonmodel.patterns.parser.Absyn; // Java Package generated by the BNF Converter.

public class EPatternWithRegister extends PatternType {
  public final Pattern pattern_;
  public final Register register_;

  public EPatternWithRegister(Pattern p1, Register p2) { pattern_ = p1; register_ = p2; }

  public <R,A> R accept(net.lemonmodel.patterns.parser.Absyn.PatternType.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof net.lemonmodel.patterns.parser.Absyn.EPatternWithRegister) {
      net.lemonmodel.patterns.parser.Absyn.EPatternWithRegister x = (net.lemonmodel.patterns.parser.Absyn.EPatternWithRegister)o;
      return this.pattern_.equals(x.pattern_) && this.register_.equals(x.register_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.pattern_.hashCode())+this.register_.hashCode();
  }


}
