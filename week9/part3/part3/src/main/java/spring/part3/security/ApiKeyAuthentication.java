package spring.part3.security;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class ApiKeyAuthentication extends AbstractAuthenticationToken {

    private final String apiKey;

    public ApiKeyAuthentication(String apiKey, Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
        this.apiKey = apiKey;
        setAuthenticated(true); // Отметить как аутентифицированный
    }

    @Override
    public Object getCredentials() {
        return apiKey; // Возвращает API ключ как учетные данные
    }

    @Override
    public Object getPrincipal() {
        return apiKey; // Возвращает API ключ как принципал
    }
}

