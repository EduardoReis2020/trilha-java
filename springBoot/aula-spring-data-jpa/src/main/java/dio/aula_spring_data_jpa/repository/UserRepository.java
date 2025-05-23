package dio.aula_spring_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.aula_spring_data_jpa.model.User;


public interface UserRepository extends JpaRepository<User, Integer> {
    // Aqui podemos adicionar métodos personalizados, se necessário
    // Exemplo: List<User> findByName(String name);
}
