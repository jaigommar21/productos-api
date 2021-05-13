package pe.edu.tecsup.productosapi.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.tecsup.productosapi.entities.Usuario;
import pe.edu.tecsup.productosapi.repositories.AuthenticationRepository;

@Service
@Transactional
public class AuthenticationServiceImpl implements AuthenticationService{

	@Autowired
	private AuthenticationRepository usuarioRepository;
	
	@Override
	public Usuario findByUsernameAndPassword(String username, String password) {
		return usuarioRepository.findByUsernameAndPassword(username, password);
	}

	@Override
	public Usuario findByUsername(String username) {
		return usuarioRepository.findByUsername(username);
	}

}
