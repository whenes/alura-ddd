package br.com.alura.escola.academico.infra.indicacao;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.academico.aplicacao.indicacao.EnviarEmailIndicacao;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// logica de envio de email com a lib Java Mail
	}
}
