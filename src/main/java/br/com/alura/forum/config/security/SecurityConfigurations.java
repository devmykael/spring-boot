package br.com.alura.forum.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
<<<<<<< HEAD
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
=======
<<<<<<< HEAD
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
=======
<<<<<<< HEAD
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
=======
<<<<<<< HEAD
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
=======
<<<<<<< HEAD
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
=======
>>>>>>> 55c94f6c05b730a7c5f31dcb4a8b24994c5b5584
>>>>>>> 4894220b423d44d7ad4622fc20590b6c35e7863e
>>>>>>> 6fc1e2b1efea72d0fff32e3d95e400a84cb361e9
>>>>>>> e3901d6bd8aae9b6b156df7cda90814c63fe1cd3
>>>>>>> 26a32ea4127a1a1aa3daa2e86004e0f006f6c7d1
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 4894220b423d44d7ad4622fc20590b6c35e7863e
>>>>>>> 6fc1e2b1efea72d0fff32e3d95e400a84cb361e9
>>>>>>> e3901d6bd8aae9b6b156df7cda90814c63fe1cd3
>>>>>>> 26a32ea4127a1a1aa3daa2e86004e0f006f6c7d1
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import br.com.alura.forum.repository.UsuarioRepository;

@EnableWebSecurity
@Configuration
<<<<<<< HEAD
@Profile(value = {"prod", "test"})
@Order(100)
=======
<<<<<<< HEAD
@Profile(value = {"prod", "test"})
@Order(100)
=======
<<<<<<< HEAD
@Profile(value = {"prod", "test"})
@Order(100)
=======
@Order(value = Ordered.LOWEST_PRECEDENCE)
<<<<<<< HEAD
=======
=======

@EnableWebSecurity
@Configuration
>>>>>>> 55c94f6c05b730a7c5f31dcb4a8b24994c5b5584
>>>>>>> 4894220b423d44d7ad4622fc20590b6c35e7863e
>>>>>>> 6fc1e2b1efea72d0fff32e3d95e400a84cb361e9
>>>>>>> e3901d6bd8aae9b6b156df7cda90814c63fe1cd3
>>>>>>> 26a32ea4127a1a1aa3daa2e86004e0f006f6c7d1
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private AutenticacaoService autenticacaoService;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 4894220b423d44d7ad4622fc20590b6c35e7863e
>>>>>>> 6fc1e2b1efea72d0fff32e3d95e400a84cb361e9
>>>>>>> e3901d6bd8aae9b6b156df7cda90814c63fe1cd3
>>>>>>> 26a32ea4127a1a1aa3daa2e86004e0f006f6c7d1
	@Autowired
	private TokenService tokenService;
	@Autowired
	private UsuarioRepository usuarioRepository;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
>>>>>>> 55c94f6c05b730a7c5f31dcb4a8b24994c5b5584
>>>>>>> 4894220b423d44d7ad4622fc20590b6c35e7863e
>>>>>>> 6fc1e2b1efea72d0fff32e3d95e400a84cb361e9
>>>>>>> e3901d6bd8aae9b6b156df7cda90814c63fe1cd3
>>>>>>> 26a32ea4127a1a1aa3daa2e86004e0f006f6c7d1
	
	@Override
	@Bean
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}
	
	//Configurações de autenticação
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(autenticacaoService)
			.passwordEncoder(new BCryptPasswordEncoder());
	}
	
	//Configurações de autorização
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers(HttpMethod.GET, "/topicos").permitAll()
			.antMatchers(HttpMethod.GET, "/topicos/*").permitAll()
			.antMatchers(HttpMethod.POST, "/auth").permitAll()
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e3901d6bd8aae9b6b156df7cda90814c63fe1cd3
>>>>>>> 26a32ea4127a1a1aa3daa2e86004e0f006f6c7d1
			.antMatchers(HttpMethod.DELETE, "/topicos/*").hasRole("MODERADOR")
			.anyRequest().authenticated()
			.and().csrf().disable()
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
			.and().addFilterBefore(new AutenticacaoViaTokenFilter(tokenService, usuarioRepository), UsernamePasswordAuthenticationFilter.class);
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
			.anyRequest().authenticated()
			.and().csrf().disable()
<<<<<<< HEAD
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
			.and().addFilterBefore(new AutenticacaoViaTokenFilter(tokenService, usuarioRepository), UsernamePasswordAuthenticationFilter.class);
=======
<<<<<<< HEAD
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
			.and().addFilterBefore(new AutenticacaoViaTokenFilter(tokenService, usuarioRepository), UsernamePasswordAuthenticationFilter.class);
=======
			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
>>>>>>> 55c94f6c05b730a7c5f31dcb4a8b24994c5b5584
>>>>>>> 4894220b423d44d7ad4622fc20590b6c35e7863e
>>>>>>> 6fc1e2b1efea72d0fff32e3d95e400a84cb361e9
>>>>>>> e3901d6bd8aae9b6b156df7cda90814c63fe1cd3
>>>>>>> 26a32ea4127a1a1aa3daa2e86004e0f006f6c7d1
	}
	
	//Configurações de recursos estáticos(js, css, imagens, etc.)
	@Override
	public void configure(WebSecurity web) throws Exception {
<<<<<<< HEAD
		web.ignoring()
        	.antMatchers("/**.html", "/v2/api-docs", "/webjars/**", "/configuration/**", "/swagger-resources/**");
=======
<<<<<<< HEAD
		web.ignoring()
        	.antMatchers("/**.html", "/v2/api-docs", "/webjars/**", "/configuration/**", "/swagger-resources/**");
=======
<<<<<<< HEAD
		web.ignoring()
        	.antMatchers("/**.html", "/v2/api-docs", "/webjars/**", "/configuration/**", "/swagger-resources/**");
=======
<<<<<<< HEAD
		web.ignoring()
        	.antMatchers("/**.html", "/v2/api-docs", "/webjars/**", "/configuration/**", "/swagger-resources/**");
=======
		
>>>>>>> 4894220b423d44d7ad4622fc20590b6c35e7863e
>>>>>>> 6fc1e2b1efea72d0fff32e3d95e400a84cb361e9
>>>>>>> e3901d6bd8aae9b6b156df7cda90814c63fe1cd3
>>>>>>> 26a32ea4127a1a1aa3daa2e86004e0f006f6c7d1
	}
	
}
