public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super( "Не найден товар с ID: " + id );
    }
}
