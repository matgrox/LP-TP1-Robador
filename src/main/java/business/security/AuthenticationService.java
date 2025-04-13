/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import model.User;

/**
 *
 * @author matgr
 */
public class AuthenticationService {

    public AuthenticationService() {
    }

    
    public long signin(String username, String password) {
        long iduser = -1;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            File file = new File("src/main/java/data/user.json");
            User user = objectMapper.readValue(file, User.class);
            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)) {
                iduser = user.getId();
            }
        } catch (IOException ex) {
            System.out.println(" [json] Problemas de acceso a los datos");
        }
        return iduser;
    }
}
