package Fabrique_Abstraite.edition;

import Fabrique_Abstraite.FabriqueEdition;
import Fabrique_Abstraite.facture.FactureQc;
import Fabrique_Abstraite.mention_legale.MentionQc;

public class EditionQc implements FabriqueEdition {

    public EditionQc() {
    }

    public FactureQc createFacture() {
        return new FactureQc();
    }

    public MentionQc createMentionLegale() {
        return new MentionQc();
    }
}
