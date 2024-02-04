import clavier.In;

public class Tp1Moyenne {
    public static void main(String[] agrs) {
        int coefCultureGenerale = 2 ;
        int coefAnglais = 3 ;
        int coefMaths = 2 ;
        int coefEtudeConceptionReseauxInfo = 3 ;
        int coefExploitationMaintenanceReeauxInfo = 4 ;
        int coefValorisationDonneeCybersecurite = 7 ;

        double noteCultureGenerale = 0 , noteAnglais = 0, noteMaths = 0 ,noteEtudeConceptionReseauxInfo = 0,noteExploitationMaintenanceReeauxInfo = 0,noteValorisationDonneeCybersecurite = 0 ,noteLanguevivantefacultative = 0 ;
        double pointCultureGenerale = noteCultureGenerale * coefCultureGenerale,pointAnglais = noteAnglais * coefAnglais, pointMaths = noteMaths * coefMaths,pointEtudeConceptionReseauxInfo = noteEtudeConceptionReseauxInfo * coefEtudeConceptionReseauxInfo;
        double pointExploitationMaintenanceReeauxInfo = noteExploitationMaintenanceReeauxInfo * coefExploitationMaintenanceReeauxInfo,pointValorisationDonneeCybersecurite = noteValorisationDonneeCybersecurite * coefValorisationDonneeCybersecurite;
        double coefTotal = coefAnglais + coefMaths +coefCultureGenerale + coefEtudeConceptionReseauxInfo + coefValorisationDonneeCybersecurite + coefExploitationMaintenanceReeauxInfo;
        double pointTotal = 0;
        double noteGdeleleve = 0;


        System.out.print("Entre la note de CultureGenerale -> ");
        noteCultureGenerale = In.readInteger();
        System.out.print("Entre la note de d anglais -> ");
        noteAnglais = In.readInteger();
        System.out.print("Entre la note de Maths -> ");
        noteMaths = In.readInteger();
        System.out.print("Entre la note de EtudeConceptionReseauxInfo -> ");
        noteEtudeConceptionReseauxInfo = In.readInteger();
        System.out.print("Entre la note de ExploitationMaintenanceReeauxInfo -> ");
        noteExploitationMaintenanceReeauxInfo = In.readInteger();
        System.out.print("Entre la note de ValorisationDonneeCybersecurite  -> ");
        noteValorisationDonneeCybersecurite = In.readInteger();
        System.out.print("Entre la note de Languevivantefacultative -> ");
        noteLanguevivantefacultative = In.readInteger();

        pointCultureGenerale = noteCultureGenerale * coefCultureGenerale;
        pointAnglais = noteAnglais * coefAnglais;
        pointMaths = noteMaths * coefMaths;
        pointEtudeConceptionReseauxInfo = noteEtudeConceptionReseauxInfo * coefEtudeConceptionReseauxInfo;
        pointExploitationMaintenanceReeauxInfo = noteExploitationMaintenanceReeauxInfo * coefExploitationMaintenanceReeauxInfo;
        pointValorisationDonneeCybersecurite = noteValorisationDonneeCybersecurite * coefValorisationDonneeCybersecurite;

        pointTotal = pointAnglais + pointCultureGenerale + pointMaths + pointEtudeConceptionReseauxInfo + pointValorisationDonneeCybersecurite + pointExploitationMaintenanceReeauxInfo;
        noteGdeleleve = pointTotal / coefTotal;
        System.out.println("Épreuve\t\t\t\tDuree\t\t\t\t\t\tCoefficient\t\tType d’épreuve \t\t\t\tNote\t\t\t\tPoint");
        System.out.println("\nCulture générale\net expression\t\t 4 heures\t\t\t\t\t\t " + coefCultureGenerale + " \t\t\t\tÉcrit\t\t\t\t\t" +   noteCultureGenerale +"\t\t\t\t"+ pointCultureGenerale );
        System.out.println("\nAnglais\t\t\t\tCompréhension:\t\t\t\t\t "  + coefAnglais +" \t\t\t\tCCF" + "2 situations\t\t\t" + noteAnglais +"\t\t\t\t"+ pointAnglais + "\n\t\t\t\t\t30 min sans préparation\n\t\t\t\t\tExpression :\n \t\t\t\t\t15 min sans préparation ");
        System.out.println("\nMathématiques\t\t55 minutes par CCF\t\t\t\t " + coefMaths + " \t\t\t\tCCF" +	"2 situations\t\t\t"+ noteMaths+"\t\t\t\t"+pointMaths);
        System.out.println("\nÉtude et conception\nde réseaux\ninformatiques\t\t 6 heures\t\t\t\t\t\t  "+ coefEtudeConceptionReseauxInfo +"  \t\t\t\t" + "Écrit\t\t\t\t"+ noteEtudeConceptionReseauxInfo +"\t\t\t\t"+pointEtudeConceptionReseauxInfo);
        System.out.println("\nExploitation et\nmaintenance des\nréseaux\ninformatiques\t\t3 heures\t\t\t\t\t\t " + coefExploitationMaintenanceReeauxInfo +" \t\t\t\t" + "Oral\t\t\t\t\t"+ noteExploitationMaintenanceReeauxInfo+"\t\t\t\t"+pointExploitationMaintenanceReeauxInfo);
        System.out.println("\nValorisation de la\ndonnée et\ncybersécurité\t\t1 heure\t\t\t\t\t\t\t "+ coefValorisationDonneeCybersecurite +"\t\t\t\t\t" + "Oral\t\t\t\t"+ noteValorisationDonneeCybersecurite+"\t\t\t\t"+ pointValorisationDonneeCybersecurite);

        System.out.println("\nLangue vivante\nfacultative\t\t\t15 minutes\t\t\t\t\t\t Points au\n\t\t\t\t\t\t\t\t\t\t\t\t\t dessus de 10\t\t" + "Oral\t\t\t\t"+ noteLanguevivantefacultative  + "\t\t\t\t" + 10.0 );
        System.out.println("le coefficient des BTS est de "+ coefTotal);
        System.out.println("les point de l eleve sont de "+ pointTotal);
        System.out.println("A la note finale de l'eleve est "+ noteGdeleleve);
    }
}
