package com.study.bdnazurewebapptest.api;

import com.study.bdnazurewebapptest.model.Calculation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class WebAppController {

    @GetMapping("/greeting")
    public ResponseEntity<String> getGreeting(@RequestParam(value = "name") String name){
        if(name.equals("")){
            return ResponseEntity.status(HttpStatus.OK).body("Hello, guest!");
        }
        else{
            String resposta = "Hello, " + name + "!";
            return ResponseEntity.status(HttpStatus.OK).body(resposta);
        }
    }

    @GetMapping("/calculator")
    public ResponseEntity<String> getCalculator(@RequestBody Calculation calculation){
        int result = 0;
        switch (calculation.getOperation()){
            case ADDITION ->
                result = calculation.getFirstValue() + calculation.getSecondValue();
            case SUBTRACTION ->
                result = calculation.getFirstValue() - calculation.getSecondValue();
            case MULTIPLICATION ->
                result = calculation.getFirstValue() * calculation.getSecondValue();
            case DIVISION -> {
                if(calculation.getSecondValue() == 0){
                    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("You cannot divide by 0.");
                }

                result = calculation.getFirstValue() / calculation.getSecondValue();
            }
         }

        return ResponseEntity.status(HttpStatus.OK).body("The value of the operation is: " + result);
    }
}
