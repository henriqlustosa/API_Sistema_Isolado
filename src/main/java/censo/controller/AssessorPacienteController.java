package censo.controller;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import censo.controller.dto.AssessorPacienteDto;
import censo.model.Paciente;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/hspmsgh-api/assessor/paciente")
public class AssessorPacienteController {
	@CrossOrigin(origins="*")
	@GetMapping()
	public ResponseEntity<List<Paciente>> getAssessorPaciente(String codigoDoRH, String nome,String mae ,String CPF,String CNS, String dataDeNascimento,String logradouro, String numero, String bairro, String RF, String status){
		
		List<Paciente> pacientes = AssessorPacienteDto.paciente( codigoDoRH,  nome,mae , CPF, CNS,  dataDeNascimento, logradouro,  numero,  bairro,  RF,  status);	
		
		//if(paciente.getCd_prontuario() == null) {
			//return ResponseEntity.notFound().build();			
		//}
		return ResponseEntity.ok(pacientes); 
	}


}
