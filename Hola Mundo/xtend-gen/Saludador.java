import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Saludador {
  private final String _saludo;
  
  public String getSaludo() {
    return this._saludo;
  }
  
  public String saludar() {
    String _saludo = this.getSaludo();
    return InputOutput.<String>println(_saludo);
  }
  
  public Saludador(final String saludo) {
    super();
    this._saludo = saludo;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_saludo== null) ? 0 : _saludo.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Saludador other = (Saludador) obj;
    if (_saludo == null) {
      if (other._saludo != null)
        return false;
    } else if (!_saludo.equals(other._saludo))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
