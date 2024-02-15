package br.com.compasso;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

	 @GetMapping("/sum/{numberOne}/{numberTwo}")
	    public Double sum(@PathVariable String numberOne, @PathVariable String numberTwo) {
	        MathUtil.validateNumericInputs(numberOne, numberTwo);
	        return MathUtil.convertToDouble(numberOne) + MathUtil.convertToDouble(numberTwo);
	    }

	    @GetMapping("/sub/{numberOne}/{numberTwo}")
	    public Double sub(@PathVariable String numberOne, @PathVariable String numberTwo) {
	        MathUtil.validateNumericInputs(numberOne, numberTwo);
	        return MathUtil.convertToDouble(numberOne) - MathUtil.convertToDouble(numberTwo);
	    }

	    @GetMapping("/mult/{numberOne}/{numberTwo}")
	    public Double mult(@PathVariable String numberOne, @PathVariable String numberTwo) {
	        MathUtil.validateNumericInputs(numberOne, numberTwo);
	        return MathUtil.convertToDouble(numberOne) * MathUtil.convertToDouble(numberTwo);
	    }

	    @GetMapping("/div/{numberOne}/{numberTwo}")
	    public Double div(@PathVariable String numberOne, @PathVariable String numberTwo) {
	        MathUtil.validateNumericInputs(numberOne, numberTwo);
	        return MathUtil.convertToDouble(numberOne) / MathUtil.convertToDouble(numberTwo);
	    }

	    @GetMapping("/raizQ/{number}")
	    public Double raizQ(@PathVariable String number) {
	        MathUtil.validateNumericInput(number);
	        return MathUtil.calculateSquareRoot(number);
	    }

	    @GetMapping("/media/{numberOne}/{numberTwo}")
	    public Double media(@PathVariable String numberOne, @PathVariable String numberTwo) {
	        MathUtil.validateNumericInputs(numberOne, numberTwo);
	        return (MathUtil.convertToDouble(numberOne) + MathUtil.convertToDouble(numberTwo)) / 2;
	    }
}
