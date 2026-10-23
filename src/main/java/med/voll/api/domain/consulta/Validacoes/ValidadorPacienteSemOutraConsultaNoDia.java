package med.voll.api.domain.consulta.Validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

public class ValidadorPacienteSemOutraConsultaNoDia {

    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        var primeiroHorario = dados.data().withHour(7);
        var ultimoHorario = dados.data().withHour(18);
        var pacientePossuiOutraConsultaNoDia = repository.existsbyPacienteIdAndDataBetween(
                dados.idPaciente(), primeiroHorario, ultimoHorario
        );

        if (pacientePossuiOutraConsultaNoDia){
            throw new ValidacaoException("Paciente ja possui uma consulta agendada nesse dia");
        }
    }
}
