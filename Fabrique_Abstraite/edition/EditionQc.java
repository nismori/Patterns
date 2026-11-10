package Fabrique_Abstraite.edition;

import Fabrique_Abstraite.FabriqueEdition;
import Fabrique_Abstraite.Facture;
import Fabrique_Abstraite.MentionLegale;
import Fabrique_Abstraite.conf.Conf;
import Fabrique_Abstraite.facture.*;
import Fabrique_Abstraite.mention_legale.*;

public class EditionQc implements FabriqueEdition {

    public EditionQc(){
    }

    public FactureQc createFacture(){
        return new FactureQc();
    }

    public MentionQc createMentionLegale(){
        return new MentionQc();
    }
}
