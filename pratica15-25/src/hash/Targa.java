package hash;

import java.util.Objects;

public class Targa {
    private String numero;

    public Targa(String numero) {
        this.numero = numero;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Targa){
            Targa r=(Targa) o;
            return r.getNumero().equalsIgnoreCase(this.numero);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }

    @Override
    public String toString() {
        return "Targa{" +
                "numero='" + numero + '\'' +
                '}';
    }
}
