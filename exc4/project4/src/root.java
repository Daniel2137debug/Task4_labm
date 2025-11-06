@Configuration
public class SpringBeans {
        @Bean
        BookService bookService(final BookRepository bookRepository) {
            return new BookServiceImpl(bookRepository);
}
}

@SpringBootApplication

public class HexagonalArchitectureApplication {
public static void main(String[] args) {
       SpringApplication.run(HexagonalArchitectureApplication.class, args);  
}
}