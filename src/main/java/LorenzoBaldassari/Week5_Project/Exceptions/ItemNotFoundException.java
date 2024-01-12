package LorenzoBaldassari.Week5_Project.Exceptions;

public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException(long id){
        super("elemento con "+id+" non trovato");
    }

}
