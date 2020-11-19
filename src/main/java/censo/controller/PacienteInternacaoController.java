package censo.controller;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import censo.controller.dto.*;
import censo.model.Internacao;

@RestController
@RequestMapping("/hspmsgh-api/internacoes")
public class PacienteInternacaoController {
	@CrossOrigin(origins="*")
	@GetMapping("/{prontuarioId}")
	public ResponseEntity<List<Internacao>> getInternacoesAlta(@PathVariable Long prontuarioId){
		
				List<Internacao> internacoes = InternacaPacienteDto.Internacoes(prontuarioId);
			
				if(internacoes == null) {
					return ResponseEntity.notFound().build();
				}
				return ResponseEntity.ok(internacoes);

			}
}
