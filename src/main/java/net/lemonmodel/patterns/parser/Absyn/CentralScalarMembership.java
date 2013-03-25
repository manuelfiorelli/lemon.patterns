package net.lemonmodel.patterns.parser.Absyn; // Java Package generated by the BNF Converter.

public class CentralScalarMembership extends ScalarMembership {
  public final URI uri_;

  public CentralScalarMembership(URI p1) { uri_ = p1; }

  public <R,A> R accept(net.lemonmodel.patterns.parser.Absyn.ScalarMembership.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof net.lemonmodel.patterns.parser.Absyn.CentralScalarMembership) {
      net.lemonmodel.patterns.parser.Absyn.CentralScalarMembership x = (net.lemonmodel.patterns.parser.Absyn.CentralScalarMembership)o;
      return this.uri_.equals(x.uri_);
    }
    return false;
  }

  public int hashCode() {
    return this.uri_.hashCode();
  }


}
