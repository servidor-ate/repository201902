package pe.royalsystems.springerp.model.dao;

import pe.royalsystems.springerp.model.domain.SsHcEpisodioAtencionFormato;

import java.util.List;

public interface SsHcEpisodioAtencionFormatoDao extends AbstractDao<SsHcEpisodioAtencionFormato, String>{

	public List<SsHcEpisodioAtencionFormato> listarSsHcEpisodioAtencionFormato(SsHcEpisodioAtencionFormato objSsHcEpisodioAtencionFormato);
	public int contadorSsHcEpisodioAtencionFormato(SsHcEpisodioAtencionFormato objSsHcEpisodioAtencionFormato);
	public SsHcEpisodioAtencionFormato buscarEpisodioPaciente(SsHcEpisodioAtencionFormato objSsHcEpisodioAtencionFormato);
	public int guardar(SsHcEpisodioAtencionFormato objSsHcEpisodioAtencionFormato);
	public SsHcEpisodioAtencionFormato atencionFormularioDinamico(SsHcEpisodioAtencionFormato objSsHcEpisodioAtencionFormato);

}