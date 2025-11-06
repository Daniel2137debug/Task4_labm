# Task4_labm

Hexagonal architecture exercise from my lab classes at the University of Huelva. It's a tiny Spring Boot app that returns a book by its id, split into ports and adapters: the Book model in domain, the service in driver_ports, the repository interface in driven_ports, its JPA implementation in db_driven_adapter and the REST controller in ui_driver_adapter.
