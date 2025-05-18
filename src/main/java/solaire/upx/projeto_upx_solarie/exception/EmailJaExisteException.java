package solaire.upx.projeto_upx_solarie.exception;

public class EmailJaExisteException extends RuntimeException {
    public EmailJaExisteException(String mensagem){
        super(mensagem);
    }
}
