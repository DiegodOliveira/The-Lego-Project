import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Area area = new Area();
        StringBuilder escolhas = new StringBuilder();

        while(true) {
            System.out.println(
                            "\nBem vindo, que tipo de casa você irá construir hoje?\n" +
                            "Nós temos algumas opções!\n" +
                            "\nVocê poderá escolher entre:\n" +
                                    "Casa simples\n" +
                            "Casa com Garagem\n" +
                            "Casa com Jardim\n" +
                            "Casa com Jardim e Garagem\n" 
            );
            String espaco = leitor.nextLine();

            if(espaco.equalsIgnoreCase("Casa simples")){
                System.out.println("Digite a área da casa: ");
                int areaCasa = leitor.nextInt();
                leitor.nextLine();
                area.setAreaDaCasa(areaCasa);
                Constructor.printCasa();
                escolhas.append("Você escolheu uma casa simples com uma área de ").append(areaCasa).append("m²\n");
            } else if (espaco.equalsIgnoreCase("Casa com Garagem")) {
                System.out.println("Digite a área da casa: ");
                int areaCasa = leitor.nextInt();
                leitor.nextLine();
                area.setAreaDaCasa(areaCasa);
                System.out.println("Digite a área da garagem: ");
                int areaGaragem = leitor.nextInt();
                leitor.nextLine();
                area.setAreaDaGaragem(areaGaragem);
                Constructor.printCasaComGaragem();
                escolhas.append("Você escolheu uma casa com garagem, sua casa tem ").append(areaCasa).append("m²").
                        append(" e sua garagem tem ").append(areaGaragem).append("m²").append("\n");
            } else if (espaco.equalsIgnoreCase("Casa com Jardim")) {
                System.out.println("Digite a área da casa: ");
                int areaCasa = leitor.nextInt();
                leitor.nextLine();
                area.setAreaDaCasa(areaCasa);
                System.out.println("Digite a área da jardim: ");
                int areaJardim = leitor.nextInt();
                leitor.nextLine();
                area.setAreaDoJardim(areaJardim);
                Constructor.printCasaComJardim();
                escolhas.append("Você escolheu uma casa com jardim, sua casa tem ").append(areaCasa).append("m²").
                        append(" e seu jardim tem ").append(areaJardim).append("m²").append("\n");
            }else if(espaco.equalsIgnoreCase("Casa com Jardim e Garagem")) {
                System.out.println("Digite a área da casa: ");
                int areaCasa = leitor.nextInt();
                leitor.nextLine();
                area.setAreaDaCasa(areaCasa);
                System.out.println("Digite a área da jardim: ");
                int areaJardim = leitor.nextInt();
                leitor.nextLine();
                area.setAreaDoJardim(areaJardim);
                System.out.println("Digite a área da garagem: ");
                int areaGaragem = leitor.nextInt();
                leitor.nextLine();
                area.setAreaDaGaragem(areaGaragem);
                Constructor.printCasaComJardimEGaragem();
                escolhas.append("Você escolheu uma casa com jardim, sua casa tem ").append(areaCasa).append("m², ").
                        append("o seu jardim tem ").append(areaJardim).append("m², ").append("e a sua garagem tem ").append(areaGaragem).append("m²").append("\n");
            }
            else if (espaco.equalsIgnoreCase("Sair")) {
                break;
            } else System.out.println("Opção inválida");
        }

        System.out.println("\nSuas escolhas foram:\n" + escolhas);
    }
}