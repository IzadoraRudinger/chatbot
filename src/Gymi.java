import java.text.Normalizer;
import java.util.Scanner;

public class Gymi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String mensagem;
        boolean esperandoPlano = false;
        String planoEscolhido = "";
        boolean esperandoContratacao = false;

        System.out.println("=== Gymi(chatbot) - Academia ===");
        System.out.println("Olá! Sou o Gymi!");
        System.out.println(
                "Pergunte sobre: horario,planos,aulas,musculacao,personal,pagamento,endereco,contato ou sair.");

        while (true) {

            System.out.print("\nVocê: ");

            // Normalização da mensagem
            mensagem = scanner.nextLine();
            mensagem = Normalizer.normalize(mensagem, Normalizer.Form.NFD);
            mensagem = mensagem.replaceAll("\\p{M}", "");
            mensagem = mensagem.toLowerCase().trim();

            // Regra composta (múltiplas condições)
            if ((mensagem.contains("quero") ||
                    mensagem.contains("contratar") ||
                    mensagem.contains("assinar") ||
                    mensagem.contains("matricula")) &&

                    (mensagem.contains("treinar") ||
                            mensagem.contains("plano"))) {
                System.out.println("Gymi: Que legal! Posso ajudar você a escolher um plano para começar seus treinos.");
                mensagem = "planos";
                esperandoContratacao = true;
            }

            if (esperandoPlano) {
                switch (mensagem) {
                    case "mensal":
                        System.out.println("Gymi: O plano Mensal custa R$99 e não possui fidelidade.");

                        planoEscolhido = "Mensal";
                        if (esperandoContratacao) {
                            System.out.println(
                                    "Gymi: Para contratar o Plano Mensal, vá até a recepção ou faça a matrícula pelo aplicativo.");
                            esperandoContratacao = false;
                        }

                        esperandoPlano = false;
                        continue;

                    case "trimestral":
                        System.out.println("Gymi: O plano Trimestral custa R$270 e inclui aulas em grupo.");

                        planoEscolhido = "trimestral";
                        if (esperandoContratacao) {
                            System.out.println(
                                    "Gymi: Para contratar o Plano trimestral, vá até a recepção ou faça a matrícula pelo aplicativo.");
                            esperandoContratacao = false;
                        }

                        esperandoPlano = false;
                        continue;

                    case "anual":
                        System.out.println(
                                "Gymi: O plano Anual custa R$960, inclui avaliação física gratuita e é o melhor custo-benefício.");

                        planoEscolhido = "anual";
                        if (esperandoContratacao) {
                            System.out.println(
                                    "Gymi: Para contratar o Plano anual, vá até a recepção ou faça a matrícula pelo aplicativo.");
                            esperandoContratacao = false;
                        }

                        esperandoPlano = false;
                        continue;
                    case "todos":
                        System.out.println("Gymi: Todos os planos disponíveis:");
                        System.out.println();
                        System.out.println("Plano Mensal - R$99");
                        System.out.println("- Acesso à academia por 30 dias.");
                        System.out.println("- Musculação e área de cardio.");
                        System.out.println("- Sem taxa de fidelidade.");
                        System.out.println();
                        System.out.println("Plano Trimestral - R$270");
                        System.out.println("- Acesso por 3 meses.");
                        System.out.println("- Musculação, cardio e aulas em grupo.");
                        System.out.println("- Economia em relação ao plano mensal.");
                        System.out.println();
                        System.out.println("Plano Anual - R$960");
                        System.out.println("- Acesso por 12 meses.");
                        System.out.println("- Todas as modalidades da academia.");
                        System.out.println("- Avaliação física gratuita e melhor custo-benefício.");
                        System.out.println();
                        System.out.println("Gymi: Agora digite mensal, trimestral ou anual para escolher um plano.");
                        planoEscolhido = "";
                        esperandoPlano = true;
                        continue;
                    default:
                        System.out
                                .println("Gymi: Não reconheci esse plano. Digite mensal, trimestral, anual ou todos.");
                        continue; // continua esperando um plano válido
                }
            }
            // Contexto: contratação do plano escolhido
            if (mensagem.contains("contratar") ||
                    mensagem.contains("assinar") ||
                    mensagem.contains("matricula")) {

                if (!planoEscolhido.isEmpty()) {
                    System.out.println("Gymi: Ótima escolha! Você escolheu o Plano " + planoEscolhido + ".");
                    System.out.println(
                            "Para contratar, basta ir até a recepção da academia com um documento de identificação.");
                    System.out.println("Você também pode fazer a matrícula pelo aplicativo da Gymi.");
                } else {
                    System.out.println("Gymi: Qual plano você deseja contratar? Mensal, Trimestral ou Anual?");
                    esperandoPlano = true;
                    esperandoContratacao = true;
                }
                continue;
            }

            // Palavras-chave
            if (mensagem.contains("horario") ||
                    mensagem.contains("aberto") ||
                    mensagem.contains("aberta") ||
                    mensagem.contains("fecha") ||
                    mensagem.contains("funciona")) {
                mensagem = "horario";
            }

            if (mensagem.contains("plano") ||
                    mensagem.contains("preco") ||
                    mensagem.contains("valor")) {
                mensagem = "planos";
            }

            if (mensagem.contains("aula") ||
                    mensagem.contains("zumba") ||
                    mensagem.contains("pilates") ||
                    mensagem.contains("spinning") ||
                    mensagem.contains("funcional") ||
                    mensagem.contains("participar")) {
                mensagem = "aulas";
            }
            if (mensagem.contains("personal") ||
                    mensagem.contains("professor") ||
                    mensagem.contains("treinador")) {
                mensagem = "personal";
            }

            if (mensagem.contains("pix") ||
                    mensagem.contains("cartao") ||
                    mensagem.contains("dinheiro") ||
                    mensagem.contains("pagar")) {
                mensagem = "pagamento";
            }
            if (mensagem.contains("localizacao") ||
                    mensagem.contains("locais") ||
                    mensagem.contains("local") ||
                    mensagem.contains("localizados") ||
                    mensagem.contains("localizado") ||
                    mensagem.contains("localizada") ||
                    mensagem.contains("endereco") ||
                    mensagem.contains("onde fica") ||
                    mensagem.contains("onde voces ficam")) {
                mensagem = "endereco";
            }
            if (mensagem.contains("contato") ||
                    mensagem.contains("telefone") ||
                    mensagem.contains("whatsapp")) {
                mensagem = "contato";
            }

            switch (mensagem) {
                case "horario":
                    System.out.println("Gymi:Funcionamos de segunda a sexta das 6h às 22h e sábado das 8h às 18h.");
                    break;

                case "planos":
                    System.out.println("Gymi: Temos os planos Mensal, Trimestral e Anual.");
                    System.out.println("Digite mensal, trimestral, anual ou todos para ver mais detalhes.");
                    esperandoPlano = true;
                    break;

                case "aulas":
                    System.out.println("Gymi: Temos aulas de Zumba, Pilates, Spinning e Funcional.");
                    System.out.println("As aulas estão incluídas nos planos Trimestral e Anual.");
                    System.out.println("Quem possui o Plano Mensal pode participar pagando R$15 por aula.");
                    System.out.println(
                            "Para participar, basta fazer o agendamento na recepção ou pelo aplicativo da academia.");
                    break;

                case "musculacao":
                    System.out
                            .println("Gymi:Nossa área de musculação possui equipamentos para iniciantes e avançados.");
                    System.out.println(
                            "Temos esteiras, bicicletas, pesos livres, máquinas e acompanhamento dos professores da academia.");
                    break;

                case "personal":
                    System.out.println("Gymi: Sim! Temos personal trainers disponíveis.");
                    System.out.println("Você pode contratar um personal na recepção ou pelo aplicativo da academia.");
                    System.out.println("Os horários e valores são informados no momento do agendamento.");
                    break;

                case "pagamento":
                    System.out.println("Gymi:Aceitamos PIX, cartão de crédito, débito e dinheiro.");
                    break;

                case "endereco":
                    System.out.println("Gymi: Estamos na Rua das Flores, 100 - Centro.");
                    break;

                case "contato":
                    System.out.println("Gymi: Nosso WhatsApp é (11) 99999-9999.");
                    break;

                case "sair":
                    System.out.println("Gymi:Obrigado! Bons treinos!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Gymi: Desculpe, nao entendi. Digite uma das opçoes disponíveis.");
                    break;
            }

        }

    }
}
