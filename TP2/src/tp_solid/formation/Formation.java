package tp_solid.formation;

import java.util.List;

/**
 * 
 */
public interface Formation {

	/**
	 * @return
	 */
	public int getAnnee();
	
	/**
	 * @param annee
	 */
	public void setAnnee(int annee);
	
	/**
	 * @return
	 */
	public String getNom();
	
	/**
	 * @return
	 */
	public List<String> getCompetences();
}
