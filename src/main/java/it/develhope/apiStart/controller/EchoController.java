package it.develhope.apiStart.controller;

import it.develhope.apiStart.DTO.UserDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/api")
public class EchoController {
//    @GetMapping(value = "/echo/{id}")  //value deve essere uguale al path se no abbiamo valori null quando scriviamo http
//    public String getRoute(@PathVariable(required = false, value = "id") String userId) {
//        return "Ciao sono il GET " + userId;
//    }

    //meglio scrivere direttamente così:
//    @GetMapping(value = "/echo/{id}")
//    public String getRoute(@PathVariable String id) {
//        return "Ciao sono il GET " + id;
//    }
    //oppure

//    @GetMapping(value = "/echo")
//    public String newGetRoute(@RequestParam(required = false) String id, @RequestParam(required = false) Integer quantity) {
//        return "Ciao sono il GET " + id + " quantity is: " + quantity;
//    }
    //localhost:8080/echo?id=abc&quantity=123

    @GetMapping(value = "/echo/{id}")
    public String newGetRoute(@PathVariable String id, @RequestParam(required = false) Integer quantity, @RequestHeader HttpHeaders headers) {
//        headers.get("sadbkjkmas");
        return "Ciao sono il GET " + id + " quantity is: " + quantity;
    }

    @PostMapping(value = "/echo")
    public String postRoute() {
        return "Ciao sono il POST";
    }
    //oppure
    @PostMapping(value = "/echoPost")
    public String newPostRoute(@RequestBody UserDTO user) {
        return user.toString();
    }
    //bisogna andare in body su Postman e inserire i dati con {}, se non si inserisce un dato sarà null

    //request e response
    @PostMapping(value = "/post")
    public String post(@Valid @RequestBody UserDTO userDTO, HttpServletRequest request, HttpServletResponse response) {
        return userDTO.toString();
    }
    //dependency validation con @valid per dire a intellij di validare request body
    //con valid bisogna inserire tutti i valori nel body di Postman altrimenti esce l'errore con il not blank mandatory

    @DeleteMapping(value = "/echo")
    public String deleteRoute() {
        return "Ciao sono il DELETE";
    }
}
