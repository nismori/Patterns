package Fabrique_Abstraite.mention_legale;

import Fabrique_Abstraite.MentionLegale;
import Fabrique_Abstraite.conf.Conf;

public class MentionQc implements MentionLegale {
    public void afficher(Conf conf) {
        System.out.println("Ceci est une loi quebecoise.");
    }
}
