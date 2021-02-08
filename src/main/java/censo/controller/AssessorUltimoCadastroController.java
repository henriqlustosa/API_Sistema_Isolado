package censo.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import censo.controller.dto.AssessorUltimoCadastroDto;
import censo.model.Paciente;


@RestController
@RequestMapping("/hspmsgh-api/assessor/ultimopaciente")
public class AssessorUltimoCadastroController {
	@CrossOrigin(origins="*")
	@GetMapping("/")
	public ResponseEntity<Paciente> getUltimoCadastro(){
		
		Paciente paciente = AssessorUltimoCadastroDto.paciente();	
		
		//if(paciente.getCd_prontuario() == null) {
			//return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(paciente); 
	}

}
