package censo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import censo.controller.dto.AssessorPessoaServidorDto;
import censo.model.PessoaServidor;
@RestController
@RequestMapping("/hspmsgh-api/assessor/profissional")
public class AssessorPessoaServidorController {
	
	@CrossOrigin(origins="*")
	@GetMapping("/{CPF}")
	public ResponseEntity<List<PessoaServidor>> getAssessorPessoaServidor(@PathVariable String CPF){
		
		List<PessoaServidor> profissional = AssessorPessoaServidorDto.profissional(CPF);	
		
		//if(paciente.getCd_prontuario() == null) {
			//return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(profissional); 
	}
}
