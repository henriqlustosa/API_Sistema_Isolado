package censo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import censo.controller.dto.CentroCirurgicoDto;
import censo.model.CentroCirurgico;


@RestController
@RequestMapping("/hspmsgh-api/centrocirurgico")
public class CentroCirurgicoController {
	@CrossOrigin(origins="*")
	@GetMapping("/{data}")
	public ResponseEntity<List<CentroCirurgico>> getInternacoesAlta(@PathVariable String data){
		
				List<CentroCirurgico> cirurgias = CentroCirurgicoDto.Cirurgias(data);
			
				//if(internacoes == null) {
					//return ResponseEntity.notFound().build();
				//}
				return ResponseEntity.ok(cirurgias);

			}
}


