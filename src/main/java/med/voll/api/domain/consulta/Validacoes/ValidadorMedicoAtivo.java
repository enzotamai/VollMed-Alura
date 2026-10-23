package med.voll.api.domain.consulta.Validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import med.voll.api.domain.medico.MedicoRepository;

public class ValidadorMedicoAtivo {

    private MedicoRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        if (dados.idMedico() == null){
            return;
        }

        var medicoEstaAtivo = repository.findAtivobyId(dados.idMedico());
        if (!medicoEstaAtivo){
            throw new ValidacaoException("Consulta nao pode ser agendada com medico excluido");
        }
    }

}
