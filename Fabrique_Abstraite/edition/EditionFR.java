package Fabrique_Abstraite.edition;

import Fabrique_Abstraite.FabriqueEdition;
import Fabrique_Abstraite.facture.FactureFR;
import Fabrique_Abstraite.mention_legale.RGBD;

public class EditionFR implements FabriqueEdition {
    public EditionFR() {
    }

    public FactureFR createFacture() {
        return new FactureFR();
    }

    public RGBD createMentionLegale() {
        return new RGBD();
    }
}
