package databases.postgres.archive.conf;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@Configuration
@EnableJdbcRepositories("archive.repos")
public class JpaConfiguration {

}
