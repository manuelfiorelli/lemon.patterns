package net.lemonmodel.patterns.parser.Absyn; // Java Package generated by the BNF Converter.

public class EPOSTaggedWord extends POSTaggedWord {
  public final String string_;
  public final POSTag postag_;

  public EPOSTaggedWord(String p1, POSTag p2) { string_ = p1; postag_ = p2; }

  public <R,A> R accept(net.lemonmodel.patterns.parser.Absyn.POSTaggedWord.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof net.lemonmodel.patterns.parser.Absyn.EPOSTaggedWord) {
      net.lemonmodel.patterns.parser.Absyn.EPOSTaggedWord x = (net.lemonmodel.patterns.parser.Absyn.EPOSTaggedWord)o;
      return this.string_.equals(x.string_) && this.postag_.equals(x.postag_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.string_.hashCode())+this.postag_.hashCode();
  }


}
