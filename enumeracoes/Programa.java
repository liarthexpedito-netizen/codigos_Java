package enumeracoes;

import java.time.LocalDateTime;

public class Programa {
    public static void main(String[] args) {
        
        Ordem pedido = new Ordem(123, LocalDateTime.now(), Status.PAGAMENTO_PENDENTE);

        System.out.println(pedido);

        Status ped1 = Status.ENTREGUE;
        Status ped2 = Status.valueOf("ENTREGUE"); //'valuesof' converte o texto em uma constante

        //'values' retorna um array com todas as constantes.
        for (Status s : Status.values()) {
            System.out.println(s);
        }

        Status s = Status.PEDIDO_ENVIADO;
        int posicao = s.ordinal();
        System.out.println(posicao);

        System.out.println(ped1);
        System.out.println(ped2);


    }
}
