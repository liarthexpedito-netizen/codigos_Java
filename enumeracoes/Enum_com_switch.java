package enumeracoes;

public class Enum_com_switch {

    public enum pedido {

    PAGAMENTO_PENDENTE,
    PROCESSANDO_PAGAMENTO,
    PEDIDO_ENVIADO,
    ENTREGUE;

    }

    public static void main(String[] args) {

        pedido ped = pedido.PEDIDO_ENVIADO;
        
        switch (ped) {
            case PAGAMENTO_PENDENTE:
                System.out.println("Aguardando pagamento");
                break;
            case PROCESSANDO_PAGAMENTO:
                System.out.println("Estamos analisando seu pagamento");
                break;
            case PEDIDO_ENVIADO:
                System.out.println("Seu pedido está indo até você");
                break;
            case ENTREGUE:
                System.out.println("Chegouuuuuu!");
            default:
                break;
        }
    }
}
