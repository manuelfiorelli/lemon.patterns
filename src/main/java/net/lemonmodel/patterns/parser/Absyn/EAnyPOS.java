package net.lemonmodel.patterns.parser.Absyn; // Java Package generated by the BNF Converter.

public class EAnyPOS extends POSTag {
  public final String string_;

  public EAnyPOS(String p1) { string_ = p1; }

  public <R,A> R accept(net.lemonmodel.patterns.parser.Absyn.POSTag.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof net.lemonmodel.patterns.parser.Absyn.EAnyPOS) {
      net.lemonmodel.patterns.parser.Absyn.EAnyPOS x = (net.lemonmodel.patterns.parser.Absyn.EAnyPOS)o;
      return this.string_.equals(x.string_);
    }
    return false;
  }

  public int hashCode() {
    return this.string_.hashCode();
  }


}