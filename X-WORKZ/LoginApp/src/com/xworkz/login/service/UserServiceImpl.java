package com.xworkz.login.service;

import com.xworkz.login.dto.UserDTO;
import com.xworkz.login.repository.UserRepository;
import com.xworkz.login.repository.UserRepositoryImpl;

public class UserServiceImpl implements UserService{

    @Override
    public String validate(UserDTO userDTO) {
        if(userDTO!=null){

            String email=userDTO.getEmail();
            if(email!=null && email.contains("@")){
                System.out.println("Email is valid");
            }
            else{
                System.out.println("Email is invalid");
                return "Please enter valid Email";
            }

            String userId=userDTO.getUserId();
            if(userId!=null && userId.length()>3 && userId.matches(".*[0-9].*")){
                System.out.println("User Id is valid");
            }
            else{
                System.out.println("User Id is invalid");
                return "Please enter valid User Id";
            }

            String password=userDTO.getPassword();
            if(){
                System.out.println("Password is valid");
            }else{
                System.out.println("Password is invalid");
                return "Please enter valid Password";
            }

            String cpassword=userDTO.getcpassword();
            if(cpassword!=null && cpassword.equals(password)){
                System.out.println("Password is Correct");
            }else{
                System.out.println("Password is Incorrect");
                return"Password is not matching";
            }
            UserRepository userRepository=new UserRepositoryImpl();
            userRepository.save(userDTO);
}
return "Sign-Up Successfully";
}