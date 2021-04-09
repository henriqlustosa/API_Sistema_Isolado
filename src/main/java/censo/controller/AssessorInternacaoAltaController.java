package censo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import censo.controller.dto.*;
import censo.model.Internacao;

@RestController
@RequestMapping("/hspmsgh-api/assessor/internacoes")
public class AssessorInternacaoAltaController {
	
	
	@CrossOrigin(origins="*")
	@GetMapping()
	public ResponseEntity<List<Internacao>> getInternacoesAlta(int tipo ,String dt_inicio, String dt_fim){
		// tipo = 1 - consulta por data da alta
		// tipo = 2 - consulta por data da internacao
			
		List<Internacao> internacoes = AssessorInternacaoAltaDto.Internacoes(tipo, dt_inicio, dt_fim);
		
		//if(internacoes == null) {
		//	return ResponseEntity.notFound().build();
		//}
		return ResponseEntity.ok(internacoes);

		}
}
