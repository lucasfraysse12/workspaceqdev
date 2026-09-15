/**
 * 
 */
package tp_solid.formation;

import java.util.ArrayList;
import java.util.List;

/**
 * FormationInfocom
 *
 *
 * @author Pierre PC (IUT de Rodez)
 * @version 1.0
 * @since 14 sept. 2026
 */
public class FormationInfocom extends AbstractFormation {
	
	public FormationInfocom(int annee) {
		super(annee, "Information et communication");
	}

	@Override
	public List<String> getCompetences() {
		return new ArrayList<>();
	}

}
