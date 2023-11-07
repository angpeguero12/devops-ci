import java.io.IOException;

public class MyIOException extends IOException {
    public MyIOException(String message) {
        super(message);
    }

    public MyIOException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class FileOperations {
    public static void main(String[] args) {
        try {
            // Simular una situación de error
            if (someConditionIsMet) {
                throw new MyIOException("Ocurrió un error de E/S personalizado");
            }

            // Realiza operaciones de E/S
            // ...

        } catch (MyIOException e) {
            // Maneja la excepción personalizada
            System.err.println("Error personalizado: " + e.getMessage());
        } catch (IOException e) {
            // Maneja otras excepciones de E/S
            System.err.println("Error de E/S: " + e.getMessage());
        }
    }
}

