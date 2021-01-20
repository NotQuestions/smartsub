package ua.smartsub.smartsub.services;

import ua.smartsub.smartsub.entity.User;

public interface IAuthService  {
    User saveUser(User user);

//    JwtAuthenticationResponse loginUser(LoginRequest loginRequest);
//
//    void sendMailForRecoverPassword (String email);
//
//    void checkTokenForRecoverPassword(RecoverUserPasswordRequest recoverUserPasswordRequest);
//
//    void recoverPassword(RecoverUserPasswordRequest recoverUserPasswordRequest);

    void activateAccount(String token);

    User findByLoginAndPassword(String login, String password);
}
