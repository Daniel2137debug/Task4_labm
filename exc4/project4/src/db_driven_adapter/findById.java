@Component
public class JpaBookRepository implements BookRepository {
   
@Autowired //link repository and service
private HAAJpaRepository haaJpaRepository;
    @Override
public Book findById(Long id) {
    	Optional<BookEntity> bookEntityOptional = haaJpaRepository.findById(id);
    	BookEntity bookEntity = bookEntityOptional.orElseThrow(BookDoesNotExistException::new);
    	return bookEntity.toBook();
    }
}