package Service;

import DAO.PaisDAO;
import Model.Pais;

public class PaisService {

	PaisDAO dao = new PaisDAO();
	
	public int criar(Pais pais) {
		return dao.criar(pais);
	}
	public void atualizar(Pais pais) {
		dao.atualizar(pais);
	}
	public void excluir(int id){
		dao.excluir(id);
	}
	public Pais carregar(int id){
		return dao.carregar(id);
	}
	public String[] paisVetPaises() {
		return dao.paisVetPaises();
	}
	public void paisHabitantes(Pais pais) {
		dao.paisHabitantes(pais);
		
	}
	public void paisMenorArea(Pais pais) {
		dao.paisMenorArea(pais);
	}
}
