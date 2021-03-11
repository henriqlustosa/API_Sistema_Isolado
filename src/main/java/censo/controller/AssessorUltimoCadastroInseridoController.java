package censo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import censo.controller.dto.AssessorUltimoCadastroInseridoDto;
import censo.model.Paciente;


@RestController
@RequestMapping("/hspmsgh-api/assessor/ultimoinserido")
public class  AssessorUltimoCadastroInseridoController { 
	@CrossOrigin(origins="*")
	@GetMapping("/")
	public ResponseEntity<Paciente> getUltimoCadastro(){
		
		Paciente paciente = AssessorUltimoCadastroInseridoDto.paciente();	
		
		//if(paciente.getCd_prontuario() == null) {
			//return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(paciente); 
	}

}
