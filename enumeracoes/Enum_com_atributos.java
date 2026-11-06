package enumeracoes;

public class Enum_com_atributos {

    public enum Dev_nivel {

        //Um enum pode ter campos, construtor privado e métodos.

        JUNIOR (1, "Júnior"),
        PLENO (2, "Pleno"),
        SENIOR (3, "Sênior");

        private final int codigo;
        private final String descricao;

        Dev_nivel(int codigo, String descricao) {
            this.codigo = codigo;
            this.descricao = descricao;
        }

        public int getCodigo() {
            return codigo;
        }

        public String getDescricao() {
            return descricao;
        }
        
    }

    public static void main(String[] args) {

        Dev_nivel dn = Dev_nivel.JUNIOR;
        System.out.println(dn.getCodigo());
        System.out.println(dn.getDescricao());

    }
}
